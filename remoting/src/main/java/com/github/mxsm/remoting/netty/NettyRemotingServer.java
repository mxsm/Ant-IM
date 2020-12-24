package com.github.mxsm.remoting.netty;

import com.github.mxsm.remoting.RemotingServer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author mxsm
 * @Date 2020/12/23
 * @Sincen 1.0.0
 */
public class NettyRemotingServer implements RemotingServer {

    private final EventLoopGroup bossGroup;

    private final EventLoopGroup workerGroup ;

   private final ServerBootstrap bootstrap;

    private final NettyServerConfig config;

    public NettyRemotingServer( final NettyServerConfig config) {
        this.bootstrap = new ServerBootstrap();
        this.config = config;
        if(this.config.isUseEpoll()){
            ThreadFactory threadFactory = new ThreadFactory() {
                private AtomicInteger atomicInteger = new AtomicInteger(1);
                @Override
                public Thread newThread(Runnable r) {
                    return new Thread(r, String.format("NettyServerBossEpoll_Thread_%d", atomicInteger.getAndIncrement()));
                }
            };
            bossGroup = new EpollEventLoopGroup(1, threadFactory);
        }else {
            ThreadFactory threadFactory = new ThreadFactory() {
                private AtomicInteger atomicInteger = new AtomicInteger(1);
                @Override
                public Thread newThread(Runnable r) {
                    return new Thread(r, String.format("NettyServerBossNio_Thread_%d", atomicInteger.getAndIncrement()));
                }
            };
            bossGroup = new NioEventLoopGroup(1, threadFactory);
        }

        if(this.config.isUseEpoll()){
            ThreadFactory threadFactory = new ThreadFactory() {
                private AtomicInteger atomicInteger = new AtomicInteger(1);
                @Override
                public Thread newThread(Runnable r) {
                    return new Thread(r, String.format("NettyServerWorkEpoll_Thread_%d", atomicInteger.getAndIncrement()));
                }
            };
            workerGroup = new EpollEventLoopGroup(4, threadFactory);
        }else {
            ThreadFactory threadFactory = new ThreadFactory() {
                private AtomicInteger atomicInteger = new AtomicInteger(1);
                @Override
                public Thread newThread(Runnable r) {
                    return new Thread(r, String.format("NettyServerWorkNio_Thread_%d", atomicInteger.getAndIncrement()));
                }
            };
            workerGroup = new NioEventLoopGroup(4, threadFactory);
        }

    }




    /**
     * 启动服务
     */
    @Override
    public void start() {

        ServerBootstrap serverBootstrap = this.bootstrap.group(this.bossGroup, this.workerGroup)
                .channel(useEpoll()? EpollServerSocketChannel.class: NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG,1024)
                .option(ChannelOption.SO_REUSEADDR, true)
                .option(ChannelOption.SO_KEEPALIVE,true)
                .childOption(ChannelOption.TCP_NODELAY, true)
                .childOption(ChannelOption.SO_SNDBUF, Integer.MAX_VALUE)
                .childOption(ChannelOption.SO_RCVBUF, Integer.MAX_VALUE)
                .localAddress(new InetSocketAddress(this.config.getPort()))
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    /**
                     * This method will be called once the {@link Channel} was registered. After the method returns this instance
                     * will be removed from the {@link ChannelPipeline} of the {@link Channel}.
                     *
                     * @param ch the {@link Channel} which was registered.
                     * @throws Exception is thrown if an error occurs. In that case it will be handled by
                     *                   {@link #exceptionCaught(ChannelHandlerContext, Throwable)} which will by default close
                     *                   the {@link Channel}.
                     */
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {

                    }
                });


    }

    /**
     * 关闭服务
     */
    @Override
    public void shutdown() {

    }

    private boolean useEpoll(){
        return this.config.isUseEpoll();
    }

}

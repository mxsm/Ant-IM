package com.github.mxsm.remoting.netty;

import com.github.mxsm.remoting.RemotingServer;
import com.github.mxsm.remoting.netty.channel.ServerChannelInitializer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import lombok.extern.slf4j.Slf4j;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author mxsm
 * @Date 2020/12/23
 * @Sincen 1.0.0
 */
@Slf4j
public class NettyRemotingServer implements RemotingServer {

    private final EventLoopGroup bossGroup;

    private final EventLoopGroup workerGroup;

    private final ServerBootstrap bootstrap;

    private final NettyServerConfig config;

    public NettyRemotingServer(final NettyServerConfig config) {
        this.bootstrap = new ServerBootstrap();
        this.config = config;
        if (this.config.isUseEpoll()) {
            bossGroup = new EpollEventLoopGroup(1, new ThreadFactoryImpl("NettyServerBossEpoll_Thread_"));
        } else {
            bossGroup = new NioEventLoopGroup(1, new ThreadFactoryImpl("NettyServerBossEpoll_Thread_"));
        }

        if (this.config.isUseEpoll()) {
            workerGroup = new EpollEventLoopGroup(4, new ThreadFactoryImpl("NettyServerWorkEpoll_Thread_"));
        } else {
            workerGroup = new NioEventLoopGroup(4, new ThreadFactoryImpl("NettyServerWorkEpoll_Thread_"));
        }

    }


    /**
     * 启动服务
     */
    @Override
    public void start() {

        ServerBootstrap serverBootstrap = this.bootstrap.group(this.bossGroup, this.workerGroup)
                .channel(useEpoll() ? EpollServerSocketChannel.class : NioServerSocketChannel.class)
                .option(ChannelOption.SO_BACKLOG, 1024)
                .option(ChannelOption.SO_REUSEADDR, true)
                .childOption(ChannelOption.SO_KEEPALIVE, true)
                .childOption(ChannelOption.TCP_NODELAY, true)
                .childOption(ChannelOption.SO_SNDBUF, Integer.MAX_VALUE)
                .childOption(ChannelOption.SO_RCVBUF, Integer.MAX_VALUE)
                .localAddress(new InetSocketAddress(this.config.getPort()))
                .childHandler(new ServerChannelInitializer());

        try {
            ChannelFuture channelFuture = serverBootstrap.bind().sync();
            log.info("启动服务端[{}:{}]", InetAddress.getLocalHost().getHostAddress(), this.config.getPort());
            channelFuture.channel().closeFuture().sync();
        } catch (Exception e) {
            log.error("服务启动失败" + e);
        } finally {
            log.info("shutdown the Server");
            shutdown();
        }

    }

    /**
     * 关闭服务
     */
    @Override
    public void shutdown() {
        bossGroup.shutdownGracefully();
        workerGroup.shutdownGracefully();
    }

    private boolean useEpoll() {
        return this.config.isUseEpoll();
    }

}

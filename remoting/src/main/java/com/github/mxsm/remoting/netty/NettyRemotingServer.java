package com.github.mxsm.remoting.netty;

import com.github.mxsm.remoting.RemotingServer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @author mxsm
 * @Date 2020/12/23
 * @Sincen 1.0.0
 */
public class NettyRemotingServer implements RemotingServer {

    private final EventLoopGroup bossGroup;

    private final EventLoopGroup workerGroup ;

   // private final ServerBootstrap bootstrap;

    private final NettyServerConfig config;

    public NettyRemotingServer( final NettyServerConfig config) {

        this.config = config;

        if(this.config.isUseEpoll()){
            ThreadFactory threadFactory = r -> new Thread(r,"1");
            bossGroup = new EpollEventLoopGroup(1, threadFactory);
        }else {
            ThreadFactory threadFactory = Executors.defaultThreadFactory();
            bossGroup = new NioEventLoopGroup(1, threadFactory);
        }
        if(this.config.isUseEpoll()){
            ThreadFactory threadFactory = r -> new Thread(r,"1");
            workerGroup = new EpollEventLoopGroup(1, threadFactory);
        }else {
            ThreadFactory threadFactory = Executors.defaultThreadFactory();
            workerGroup = new NioEventLoopGroup(1, threadFactory);
        }

    }




    /**
     * 启动服务
     */
    @Override
    public void start() {

    }

    /**
     * 关闭服务
     */
    @Override
    public void shutdown() {

    }

}

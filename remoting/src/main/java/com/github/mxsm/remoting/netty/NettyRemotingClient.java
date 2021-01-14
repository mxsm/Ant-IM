package com.github.mxsm.remoting.netty;

import com.github.mxsm.remoting.RemotingClient;
import com.github.mxsm.remoting.netty.channel.ClientChannelInitializer;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @author mxsm
 * @Date 2021/1/14
 * @Since
 */
public class NettyRemotingClient implements RemotingClient {

    private final EventLoopGroup group;

    private final Bootstrap bootstrap;

    private final NettyClientConfig config;

    public NettyRemotingClient(final NettyClientConfig config) {
        this.config = config;
        if (this.config.isUseEpoll()) {
            group = new EpollEventLoopGroup(1, new ThreadFactoryImpl(""));
        } else {
            group = new NioEventLoopGroup(1, new ThreadFactoryImpl(""));
        }
        bootstrap = new Bootstrap();
    }

    /**
     * 同步发送
     */
    @Override
    public void invokeSync() {

    }

    /**
     * 异步发送
     */
    @Override
    public void invokeAsync() {

    }

    /**
     * 启动服务
     */
    @Override
    public void start() {
        bootstrap.group(group)
            .channel(this.config.isUseEpoll() ? EpollSocketChannel.class : NioSocketChannel.class)
            .remoteAddress(this.config.getServerAddress(), this.config.getPort())
            .option(ChannelOption.TCP_NODELAY, true)
            .handler(new ClientChannelInitializer());
        try {
            bootstrap.connect(this.config.getServerAddress(), this.config.getPort()).sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            shutdown();
        }
    }

    /**
     * 关闭服务
     */
    @Override
    public void shutdown() {

    }
}

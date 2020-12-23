package com.github.mxsm.remoting.netty;

import com.github.mxsm.remoting.common.RemotingUtils;
import io.netty.channel.epoll.Epoll;

/**
 * @author mxsm
 * @Date 2020/12/23
 * @Since
 */
public abstract class AbstractNettyConfig implements NettyConfig {

    private int port = 8848;

    /**
     * 默认不使用epoll
     */
    private boolean isUseEpoll = false;

    /**
     * 获取端口
     *
     * @return
     */
    @Override
    public int getPort() {
        return port;
    }

    /**
     * 是否使用Epoll
     *
     * @return
     */
    @Override
    public boolean isUseEpoll() {
        return RemotingUtils.isLinuxPlatform() && isUseEpoll && Epoll.isAvailable();
    }


}

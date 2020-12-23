package com.github.mxsm.remoting.netty;

/**
 * @author mxsm
 * @Date 2020/12/23
 * @Since 1.0.0
 */
public interface NettyConfig {

    /**
     * 获取端口
     * @return
     */
    int getPort();


    /**
     * 是否使用Epoll
     * @return
     */
    boolean isUseEpoll();

}

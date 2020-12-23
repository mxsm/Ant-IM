package com.github.mxsm.remoting;

/**
 * @author mxsm
 * @Date 2020/12/23
 * @Since 1.0.0
 */
public interface RemotingService {

    /**
     * 启动服务
     */
    void start();

    /**
     * 关闭服务
     */
    void shutdown();

}

package com.github.mxsm.remoting;

/**
 * @author mxsm
 * @Date 2020/12/23
 * @Since 1.0.0
 */
public interface RemotingClient extends RemotingService{

    /**
     * 同步发送
     */
    void invokeSync();

    /**
     * 异步发送
     */
    void invokeAsync();

}

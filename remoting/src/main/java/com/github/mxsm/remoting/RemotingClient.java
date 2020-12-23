package com.github.mxsm.remoting;

/**
 * @author mxsm
 * @Date 2020/12/23
 * @Since 1.0.0
 */
public interface RemotingClient extends RemotingService{


    void invokeSync();

    void invokeAsync();

}

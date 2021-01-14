package com.github.mxsm.remoting.netty;

/**
 * @author mxsm
 * @Date 2020/12/23
 * @Since
 */
public class NettyClientConfig extends AbstractNettyConfig implements NettyConfig{

    /**
     * 服务地址
     */
    private String serverAddress;


    public String getServerAddress() {
        return serverAddress;
    }

    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
    }
}

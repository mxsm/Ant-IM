package com.github.mxsm.remoting.netty.handler;

import com.github.mxsm.remoting.common.Heartbeat;
import com.github.mxsm.serialization.protobuf.AntMessagePackage;
import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import java.net.SocketAddress;
import lombok.extern.slf4j.Slf4j;

/**
 * @author mxsm
 * @Date 2021/1/13
 * @Since
 */
@Slf4j
public class ProtobufClientHandler extends ChannelDuplexHandler {

    /**
     * Calls {@link ChannelHandlerContext#connect(SocketAddress, SocketAddress, ChannelPromise)} to forward
     * to the next {@link ChannelOutboundHandler} in the {@link ChannelPipeline}.
     * <p>
     * Sub-classes may override this method to change behavior.
     *
     * @param ctx
     * @param remoteAddress
     * @param localAddress
     * @param promise
     */
    @Override
    public void connect(ChannelHandlerContext ctx, SocketAddress remoteAddress, SocketAddress localAddress, ChannelPromise promise) throws Exception {
        super.connect(ctx, remoteAddress, localAddress, promise);
        log.info("客户端[IP:{}]连接服务器[IP:{}]成功", remoteAddress.toString(), localAddress.toString());
    }

    /**
     * Calls {@link ChannelHandlerContext#fireChannelRead(Object)} to forward
     * to the next {@link ChannelInboundHandler} in the {@link ChannelPipeline}.
     * <p>
     * Sub-classes may override this method to change behavior.
     *
     * @param ctx
     * @param msg
     */
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        if(msg instanceof Heartbeat){
            ctx.writeAndFlush(Heartbeat.HEART_BEAT);
            return;
        }
        //处理消息
        AntMessagePackage messagePackage = (AntMessagePackage)msg;
        log.info(messagePackage.getProtocol());

        super.channelRead(ctx, msg);
    }

}

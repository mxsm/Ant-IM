package com.github.mxsm.remoting.netty.channel;

import com.github.mxsm.remoting.netty.decoder.WrapperProtobufVarint32FrameDecoder;
import com.github.mxsm.remoting.netty.handler.ProtobufServerHandler;
import com.github.mxsm.serialization.protobuf.AntMessagePackage;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

/**
 * @author mxsm
 * @Date 2020/12/24
 * @Since 1.0
 */
public class ServerChannelInitializer extends ChannelInitializer<SocketChannel> {
    /**
     * This method will be called once the {@link Channel} was registered. After the method returns this instance
     * will be removed from the {@link ChannelPipeline} of the {@link Channel}.
     *
     * @param ch the {@link Channel} which was registered.
     * @throws Exception is thrown if an error occurs. In that case it will be handled by
     *                   {@link #exceptionCaught(ChannelHandlerContext, Throwable)} which will by default close
     *                   the {@link Channel}.
     */
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        pipeline.addLast(new IdleStateHandler(0, 0, 5, TimeUnit.SECONDS));
        pipeline.addLast(new WrapperProtobufVarint32FrameDecoder());
        pipeline.addLast(new ProtobufDecoder(AntMessagePackage.getDefaultInstance()));
        pipeline.addLast(new ProtobufVarint32LengthFieldPrepender());
        pipeline.addLast(new ProtobufEncoder());
        pipeline.addLast(new ProtobufServerHandler());
    }
}

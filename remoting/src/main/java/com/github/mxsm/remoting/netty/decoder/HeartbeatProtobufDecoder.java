package com.github.mxsm.remoting.netty.decoder;

import com.github.mxsm.remoting.common.Heartbeat;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import static com.github.mxsm.remoting.common.Heartbeat.*;

/**
 * @author mxsm
 * @Date 2020/12/24
 * @Since 1.0.0
 */
@Slf4j
public class HeartbeatProtobufDecoder extends ProtobufVarint32FrameDecoder {

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {

        in.markReaderIndex();
        int readableBytes = in.readableBytes();
        if( readableBytes < HEART_BEAT.length){
            return;
        }
        byte[] readBytes = new byte[HEART_BEAT.length];
        in.readBytes(readBytes);
        if(Arrays.equals(HEART_BEAT, readBytes)){
            log.info("----------服务端IM收到心跳----------------");
            Channel channel = ctx.channel();
            if(channel != null && channel.isWritable()){
                out.add(new Heartbeat());
            }
        }else {
            in.resetReaderIndex();
        }
        super.decode(ctx, in, out);
    }
}

package com.github.mxsm.serialization.protobuf.util;

import com.github.mxsm.serialization.protobuf.Header;
import com.github.mxsm.serialization.protobuf.Terminal;
import com.github.mxsm.serialization.protobuf.UserMetadata;

/**
 * @author mxsm
 * @Date 2021/1/14
 * @Since
 */
public abstract class HeaderBuilder {

    /**
     * 创建Header
     * @param sender
     * @param receiver
     * @param terminal
     * @param userMetadata
     * @return
     */
    public static Header buildHeader(long sender, long receiver, Terminal terminal, UserMetadata userMetadata) {
        return Header.newBuilder().setSender(sender).setReceiver(receiver).setTerminal(terminal)
            .setUserMetadata(userMetadata).build();
    }

    public static Header buildTestHeader(long sender, long receiver, UserMetadata userMetadata) {
        return buildHeader(sender,receiver, null, userMetadata);
    }

}

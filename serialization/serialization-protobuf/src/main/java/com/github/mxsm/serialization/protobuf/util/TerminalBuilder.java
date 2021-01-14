package com.github.mxsm.serialization.protobuf.util;

import com.github.mxsm.serialization.protobuf.Terminal;
import com.github.mxsm.serialization.protobuf.TerminalType;

/**
 * @author mxsm
 * @Date 2021/1/14
 * @Since
 */
public abstract class TerminalBuilder {

    private static final String OS_NAME;

    static {
        OS_NAME = System.getProperty("os.name");
    }

    /**
     * @param terminalType Android, ios, web, DesktopApp, TestClient
     * @param deviceToken
     * @param osType
     * @param deviceType
     * @return
     */
    public static Terminal buildTerminal(TerminalType terminalType, String deviceToken, String osType,
        String deviceType) {
        return Terminal.newBuilder().setTermType(terminalType).setDeviceToken(deviceToken).setOsType(osType)
            .setDeviceType(deviceType).build();
    }

    public static Terminal buildTestClientTerminal(String deviceToken, String osType, String deviceType) {
        return buildTerminal(TerminalType.TEST_CLIENT, deviceToken, osType, deviceType);
    }

    public static Terminal buildAndroidTerminal(String deviceToken, String osType, String deviceType) {
        return buildTerminal(TerminalType.ANDROID, deviceToken, osType, deviceType);
    }

    public static Terminal buildIosTerminal(String deviceToken, String osType, String deviceType) {
        return buildTerminal(TerminalType.IOS, deviceToken, osType, deviceType);
    }

    public static Terminal buildWebTerminal(String deviceToken, String osType, String deviceType) {
        return buildTerminal(TerminalType.WEB, deviceToken, osType, deviceType);
    }

    public static Terminal buildDesktopAppTerminal(String deviceToken, String osType, String deviceType) {
        return buildTerminal(TerminalType.DESKTOP_APP, deviceToken, osType, deviceType);
    }
}

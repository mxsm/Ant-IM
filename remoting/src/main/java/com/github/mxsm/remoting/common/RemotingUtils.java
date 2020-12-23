package com.github.mxsm.remoting.common;


import org.apache.commons.lang3.StringUtils;

/**
 * @author mxsm
 * @Date 2020/12/23
 * @Since 1.0.0
 */
public abstract class RemotingUtils {

    public static final String OS_NAME = System.getProperty("os.name");

    private static boolean isLinuxPlatform = false;

    private static boolean isWindowsPlatform = false;

    static {
        if (StringUtils.isNotBlank(OS_NAME) && StringUtils.containsIgnoreCase(OS_NAME, "linux")) {
            isLinuxPlatform = true;
        }

        if (StringUtils.isNotBlank(OS_NAME) && StringUtils.containsIgnoreCase(OS_NAME, "windows")) {
            isWindowsPlatform = true;
        }
    }

    public static boolean isLinuxPlatform(){
        return isLinuxPlatform;
    }

    public static boolean isWindowsPlatform(){
        return isWindowsPlatform;
    }
}

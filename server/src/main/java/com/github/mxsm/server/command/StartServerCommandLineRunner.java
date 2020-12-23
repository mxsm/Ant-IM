package com.github.mxsm.server.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author mxsm
 * @Date 2020/12/23
 * @Since 1.0.0
 */
@Component
@Slf4j
public class StartServerCommandLineRunner implements CommandLineRunner {

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        log.info(">>>>>>>>>>>>>>>开始启动IM服务端<<<<<<<<<<<<<<<");
    }
}

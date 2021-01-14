package com.github.mxsm.remoting.netty;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author mxsm
 * @Date 2021/1/14
 * @Since
 */
public class ThreadFactoryImpl implements ThreadFactory {

    private final AtomicInteger threadIndex = new AtomicInteger(1);

    private final String threadNamePrefix;

    private final boolean daemon;

    public ThreadFactoryImpl(String threadNamePrefix) {
        this(threadNamePrefix, false);
    }

    public ThreadFactoryImpl(String threadNamePrefix, boolean daemon) {
        this.threadNamePrefix = threadNamePrefix;
        this.daemon = daemon;
    }

    /**
     * Constructs a new {@code Thread}.  Implementations may also initialize
     * priority, name, daemon status, {@code ThreadGroup}, etc.
     *
     * @param r a runnable to be executed by new thread instance
     * @return constructed thread, or {@code null} if the request to
     * create a thread is rejected
     */
    @Override
    public Thread newThread(Runnable runnable) {

        Thread thread = new Thread(runnable, this.threadNamePrefix + this.threadIndex.incrementAndGet());
        thread.setDaemon(daemon);
        return thread;
    }
}

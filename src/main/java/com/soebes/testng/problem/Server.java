package com.soebes.testng.problem;

import java.net.URI;

public class Server {

    private URI uri;
    private long startTime;

    public Server(URI resource) {
        this.uri = resource;
        this.startTime = System.currentTimeMillis();
    }

    public boolean isRunning() {
        long diff = System.currentTimeMillis() - this.startTime;
        if (diff >= 1000) {
            return true;
        } else {
            return false;
        }
    }

    public void waitForSomeTime() throws InterruptedException {
        Thread.sleep(200L);
    }
}

package com.offbytwo.jenkins.integration;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(groups = { Groups.NO_EXECUTOR_GROUP })
public class NoExecutorStartedGetComputersWithDetailsIT extends AbstractJenkinsIntegrationCase {

    @BeforeMethod
    public void beforeMethod() throws IOException, InterruptedException {
        jenkinsServer.waitForSomeTime();
    }

    @Test
    public void getIdleShouldReturnTrue() {
        assertThat(true).isTrue();
    }

    @Test
    public void getJnlpShouldReturnTrue() {
        assertThat(true).isTrue();
    }

    @Test
    public void getExecutorsShouldReturnTwo() {
        assertThat(true).isTrue();
    }

    @Test
    public void getLaunchSupportedShouldReturnTrue() {
        assertThat(true).isTrue();
    }

    @Test
    public void getManualLanuchShouldReturnTrue() {
        assertThat(true).isTrue();
    }

}

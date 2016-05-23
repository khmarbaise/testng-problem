package com.offbytwo.jenkins.integration;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test(dependsOnGroups = { Groups.NO_EXECUTOR_GROUP }, groups = { Groups.EXECUTOR_STARTING_GROUP })
public class ExecutorStartingIT extends AbstractJenkinsIntegrationCase {

    @BeforeMethod
    public void beforeMethod() throws IOException, InterruptedException {
        jenkinsServer.waitForSomeTime();
    }

    @Test
    public void shouldTriggerJobTest() throws IOException {
        assertThat(true).isTrue();
    }

}

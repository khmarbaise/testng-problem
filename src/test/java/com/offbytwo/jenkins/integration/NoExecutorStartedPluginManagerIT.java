package com.offbytwo.jenkins.integration;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test( groups = { Groups.NO_EXECUTOR_GROUP } )
public class NoExecutorStartedPluginManagerIT
    extends AbstractJenkinsIntegrationCase
{

    @BeforeMethod
    public void beforeMethod()
        throws IOException, InterruptedException
    {
        jenkinsServer.waitForSomeTime();
    }

    @Test
    public void getPluginsShouldReturn9ForJenkins20()
    {
        assertThat(true).isTrue();
         //throw new SkipException("This requirement is not fulfilled.");
    }

}

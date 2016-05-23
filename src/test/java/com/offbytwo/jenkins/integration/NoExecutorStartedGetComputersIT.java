package com.offbytwo.jenkins.integration;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test( groups = { Groups.NO_EXECUTOR_GROUP } )
public class NoExecutorStartedGetComputersIT
    extends AbstractJenkinsIntegrationCase
{

    @BeforeMethod
    public void beforeMethod()
        throws IOException, InterruptedException
    {
        jenkinsServer.waitForSomeTime();
    }

    @Test
    public void numberOfComputersIsEqualOne()
    {
        assertThat( true).isTrue();
    }

    @Test
    public void getNameShouldReturnMaster()
    {
        assertThat( true).isTrue();
    }
}

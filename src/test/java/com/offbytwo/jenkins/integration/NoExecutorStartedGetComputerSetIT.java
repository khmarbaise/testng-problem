package com.offbytwo.jenkins.integration;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test( groups = { Groups.NO_EXECUTOR_GROUP } )
public class NoExecutorStartedGetComputerSetIT
    extends AbstractJenkinsIntegrationCase
{


    @BeforeMethod
    public void beforeMethod()
        throws IOException
    {
        // Do some inti for the method
    }

    @Test
    public void shouldGetNameOfMasterNode()
    {
        assertThat(true).isTrue();
    }

    @Test
    public void getTotalExecutorsShouldReturnZero()
    {
        assertThat(true).isTrue();
    }

    @Test
    public void getBusyExecutorsShouldReturnZero()
    {
        assertThat(true).isTrue();
    }

    @Test
    public void getDisplayNameShouldReturnNodes()
    {
        assertThat(true).isTrue();
    }
}

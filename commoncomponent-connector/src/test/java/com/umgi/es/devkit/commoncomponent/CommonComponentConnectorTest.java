package com.umgi.es.devkit.commoncomponent;

import org.mule.tck.junit4.FunctionalTestCase;

import org.junit.Test;

public class CommonComponentConnectorTest extends FunctionalTestCase
{
    @Override
    protected String getConfigResources()
    {
        return "commoncomponent-config.xml";
    }

    @Test
    public void testFlow() throws Exception
    {
        runFlowAndExpect("testFlow", "Another string");
    }
}

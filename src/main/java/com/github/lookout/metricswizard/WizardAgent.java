package com.github.lookout.metricswizard;

import java.io.IOException;
import java.lang.instrument.Instrumentation;

import com.github.lookout.metricswizard.mbeansdiscovery.MBeansDiscovery;
import com.github.lookout.metricswizard.metricsbuilder.MetricsBuilder;


/**
 * WizardAgent is a Java Agent that accumulates and reports metrics
 * (i.e. MBean attributes) to upstream server
 */
public class WizardAgent {
    private MBeansDiscovery mBeansDiscovery;
    private MetricsBuilder metricsBuilder;

    /** Constructor. */
    WizardAgent() {
    }

    /** Start the agent. */
    void start(String agentArgs) {

        /** Create Metrics builder */
        metricsBuilder = new MetricsBuilder();

        /** Create a discovery class to discover MBeans */
        mBeansDiscovery = new MBeansDiscovery(metricsBuilder);

        /** Read Config */

        /** Start discovery */
        mBeansDiscovery.start();
    }

    /** Define a premain method to launch java agent. */
    public static void premain(final String agentArgs, final Instrumentation inst)
            throws IOException {

        /** Create Wizard agent */
        WizardAgent agent = new WizardAgent();

        /** Start the agent */
        agent.start(agentArgs);
    }
}


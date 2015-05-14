package com.github.lookout.metricswizard.metricsbuilder;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import com.github.lookout.metricswizard.mbeansdiscovery.MBeansBuilder;


/**
 * Listens to MBeans via MBeansBuilder interface.
 */
public class MetricsBuilder implements MBeansBuilder {

    /** Constructor. */
    public MetricsBuilder() {
        /** MetricRegistry to store metrics that are consumed by Reporter  */
    }

    /** Register MBean notification. */
    @Override
    public void registerNotify(MBeanServer server, ObjectName mbean) {

        /** Parse all "mbean" attributes and create gauges for long/double/float attributes */

        /** Add gauges to the metricsRegistry */
    }

    /** MBean attribute change notification. */
    @Override
    public void updateNotify(MBeanServer server, ObjectName mbean) {
    }

    /** Unregister MBean notification. */
    @Override
    public void unregisterNotify(MBeanServer server, ObjectName mbean) {
    }
}

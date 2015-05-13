package com.github.lookout.metricswizard.mbeansdiscovery;

import javax.management.MBeanServer;
import javax.management.ObjectName;

/**
 * Defines the interface between MBeansDiscovery and MetricsBuilder
 * (i.e. producer and consumer)
 */
public interface MBeansBuilder {

    /** Register MBean notification. */
    public void registerNotify(MBeanServer server, ObjectName mbean);

    /** MBean attribute change notification. */
    public void updateNotify(MBeanServer server, ObjectName mbean);

    /** Unregister MBean notification. */
    public void unregisterNotify(MBeanServer server, ObjectName mbean);
}

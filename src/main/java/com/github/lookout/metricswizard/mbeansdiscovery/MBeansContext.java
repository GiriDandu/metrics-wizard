package com.github.lookout.metricswizard.mbeansdiscovery;

import java.util.TimerTask;
import javax.management.*;


/**
 * This class is maintained for each MBean discovered via JMX interface.
 */
public class MBeansContext extends TimerTask {

    /** MBean object name. */
    //ObjectName mbean;

    /** MBean Server associated with objectName. */
    //MBeanServer mBeanServer;

    /** Owner. */
    //MBeansDiscovery mBeansDiscovery;

    /** Constructor. */
    MBeansContext(MBeansDiscovery mBeansDiscovery, MBeanServer mBeanServer, ObjectName mbean) {
        //this.mBeansDiscovery = mBeansDiscovery;
        //this.mBeanServer = mBeanServer;
        //this.mbean = mbean;

        /** Register processing */
        register();
    }

    private void register() {
        /** Send Register Notify to MBeansBuilder */

        /** If Mbean does not send notifications, then start timer Timer */

        /** Otherwise, create a listener and register it with MBeansServer*/
    }

    /** Called by timer expiration (i.e. run()) or listener. */
    void update() {
        /** Send Update Notify to MBeansBuilder */
    }

    /** Called by MBeanServerDelegate Listener. */
    void unregister() {
        /** Send Unregister Notify to MBeansBuilder */
    }

    /** Timeout, in case timer is scheduled. */
    @Override
    public void run() { update(); }
}


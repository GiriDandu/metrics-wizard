package com.github.lookout.metricswizard.mbeansdiscovery;

import java.util.TimerTask;
import javax.management.*;


/**
 * This class is maintained for each MBean discovered via JMX interface.
 */
public class MBeansContext extends TimerTask {


    /** Constructor. */
    MBeansContext(MBeansDiscovery mBeansDiscovery, MBeanServer mBeanServer, ObjectName mbean) {

        /** Register processing */
        register();
    }

    private void register() {
        /** Send Register Notify to MBeansBuilder */

        /** If Mbean does not emit notifications, then start timer Timer. */

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

    @Override
    public void run() {
        /** if timer is launched for polling; on timeout report update */
    }
}


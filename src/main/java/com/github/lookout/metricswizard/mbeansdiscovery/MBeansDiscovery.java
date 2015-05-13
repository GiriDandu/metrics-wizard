package com.github.lookout.metricswizard.mbeansdiscovery;

import java.util.Timer;


/**
 * MBeansDiscovery.
 *
 * Discovers MBeans and its attributes by listening or polling the MBeansServer(s).
 */
public class MBeansDiscovery {
    //private Timer timer;
    //private MBeansBuilder mBeansBuilder;

    /** Constructor. */
    public MBeansDiscovery(MBeansBuilder mBeansBuilder) {
        //this.mBeansBuilder = mBeansBuilder;

        /**
         * Create timer with daemon threads, so that unfinished timer tasks do not
         * block the application from exiting
         */
        //this.timer = new Timer("MBeansDiscovery", true);
    }

    /** Start the agent. */
    public void start() {
        /** Read extant MBeans and creates & starts the MBeansContext for each of them */
    }

}


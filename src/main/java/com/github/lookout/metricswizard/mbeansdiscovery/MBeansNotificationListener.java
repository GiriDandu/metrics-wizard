package com.github.lookout.metricswizard.mbeansdiscovery;

import javax.management.Notification;
import javax.management.NotificationListener;


/**
 * MBeansNotificationListener.
 *
 * It is a custom notification listener for all types of
 * MBeans notifications from a MBeans NotificationBroadcaster(s)
 */
public class MBeansNotificationListener implements NotificationListener {

    public  void handleNotification(Notification notification, Object object) {
    }
}

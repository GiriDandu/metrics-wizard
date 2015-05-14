package com.github.lookout.metricswizard.mbeansdiscovery;

import spock.lang.*


class MBeansNotificationListenerSpec extends Specification {

    def "the construction works"() {
        given:
        MBeansNotificationListener listener = new MBeansNotificationListener()

        expect:
        listener instanceof MBeansNotificationListener
    }
}
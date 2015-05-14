package com.github.lookout.metricswizard.mbeansdiscovery;

import javax.management.MBeanServer
import javax.management.ObjectName
import spock.lang.*


class MBeansContextSpec extends Specification {

    def "the construction works"() {
        given:
        MBeansDiscovery mBeansDiscovery = Mock(MBeansDiscovery)
        MBeanServer mBeanServer = Mock(MBeanServer)
        ObjectName mbean = new ObjectName("test-object-name:type=hello")
        MBeansContext context = new MBeansContext(mBeansDiscovery, mBeanServer, mbean)

        expect:
        context instanceof MBeansContext
    }
}
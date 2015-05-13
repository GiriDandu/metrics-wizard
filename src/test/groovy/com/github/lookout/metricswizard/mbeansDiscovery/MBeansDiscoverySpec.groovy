package com.github.lookout.metricswizard.mbeansdiscovery;

import spock.lang.*


class MBeansDiscoverySpec extends Specification {

    def "the construction works"() {
        given:
        MBeansBuilder mBeansBuilder = Mock(MBeansBuilder)
        MBeansDiscovery mBeansDiscovery = new MBeansDiscovery(mBeansBuilder)

        expect:
        mBeansDiscovery instanceof MBeansDiscovery
    }
}
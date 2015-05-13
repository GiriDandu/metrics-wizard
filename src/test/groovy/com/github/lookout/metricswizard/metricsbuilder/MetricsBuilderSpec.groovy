package com.github.lookout.metricswizard.metricsbuilder;

import spock.lang.*


class MetricsBuilderSpec extends Specification {

    def "the construction works"() {
        given:
        MetricsBuilder metricsBuilder = new MetricsBuilder()

        expect:
        metricsBuilder instanceof MetricsBuilder
    }
}
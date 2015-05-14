package com.github.lookout.metricswizard

import spock.lang.*

class WizardAgentSpec extends Specification {

    def "the construction should create a publisher"() {
        given:
        WizardAgent agent = new WizardAgent()

        expect:
        agent instanceof WizardAgent
    }
}
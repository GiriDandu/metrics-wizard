# Hacking Metrics Wizard


## Design

                                                            JMXMetric                     JMX Connector
    SNMPReporter   <-.                                          ^                               |
                      \                                         |                               |
    DatadogReporter <-- Reporter                          Transformation                        |
                      /    ^                                    ^                               |
    StatsdReporter <-`     |                                    |                               |
                           |                                    |                               v
                    MetricsRegistry <--/register metric/-- BeanRegistry <--/mbean found/--  JMX Scanner






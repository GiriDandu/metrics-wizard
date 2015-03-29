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
                                                                                 
                                                                                 
                                                                                 
                                                                                 
                                                                                 
                                 MetricsWizardConfiguration                      


### JMXMetric


### Transformation

Requirements:

 * Must be able to transform the value
 * Must be able to transform the name of the metric
 * Must be configurable from the YAML configuration for a specific mbean name.
   E.g.
   `org.apache.ZookeeperService`ReplicatedServer_id1.QuorumSize=com.github.lookout.metricswizard.transforms..FancyIntTranform`
 * Should be configurable from the YAML configuration for a regular expression
   pattern


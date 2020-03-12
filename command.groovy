node {
  stage 'Run CE JMeter Test'
  sh "/home/vvdn/Desktop/Jmeter/apache-jmeter-5.2.1/bin/jmeter.sh -n -t COllection_Engine_API's.jmx -l test.jtl"
}

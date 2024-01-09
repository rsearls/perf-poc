# perf-poc
This project has been created to address
[RESTEASY-3430, Create an environment for performance testing](https://issues.redhat.com/browse/RESTEASY-3430).
The project is a POC for developing performance tests that
can be run in a CI environment.  Github CI and Jenkins are
the two CIs the webservice's team uses.  Apache JMeter has been chosen
because it is a free open source project that addresses performance 
testing and it runs in both Github CI and Jenkins.

This iteration of the project focuses on providing a Github
workflow that runs the defined performance plan and generates
an HTML report.  This project defines several REST endpoints
that are packaged in a WAR file and deployed to Wildfly.  A
test plan (file) has been created using Apache JMeter UI.  
It calls the REST endpoints and provides performance data.
The data is translated into a dashboard report consisting of
graphs and statistics from the test plan.  An example dashboard 
report can be seen [here](https://jmeter.apache.org/usermanual/generating-dashboard.html)

### Test components
This project is currently using the following components
- JDK-11
- perf-poc version 1.0-SNAPSHOT
- Wildfly version wildfly-31.0.0.Beta1-SNAPSHOT
- JMeter version 5.6.2

### Directory layout
- src: contains the REST endpoints used in the test
- jmeter-files: contains the test plan and properties file to generate data fields
- .github: contains the workflow to run the test and provide the dashboards report

#### NOTE
The workflow provides the dashboard report as an uploaded ZIP file.  Multiple files
are used in providing the graphs and statistics tables.   Download the ZIP file,
unzip it and display the index.html file in your local browser.

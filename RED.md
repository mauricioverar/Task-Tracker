mvn test
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< cl.kibernumacademy:tasktracker >-------------------
[INFO] Building tasktracker 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- jacoco:0.8.11:prepare-agent (default) @ tasktracker ---
[INFO] argLine set to "-javaagent:C:\\Users\\mvera\\.m2\\repository\\org\\jacoco\\org.jacoco.agent\\0.8.11\\org.jacoco.agent-0.8.11-runtime.jar=destfile=C:\\Users\\mvera\\Documents\\QA testing\\tdd-junit\\tasktracker\\target\\jacoco.exec"
[INFO] 
[INFO] --- resources:3.0.2:resources (default-resources) @ tasktracker ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\mvera\Documents\QA testing\tdd-junit\tasktracker\src\main\resources
[INFO] 
[INFO] --- compiler:3.8.0:compile (default-compile) @ tasktracker ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to C:\Users\mvera\Documents\QA testing\tdd-junit\tasktracker\target\classes
[INFO] 
[INFO] --- resources:3.0.2:testResources (default-testResources) @ tasktracker ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Users\mvera\Documents\QA testing\tdd-junit\tasktracker\src\test\resources  
[INFO]
[INFO] --- compiler:3.8.0:testCompile (default-testCompile) @ tasktracker ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- surefire:2.22.1:test (default-test) @ tasktracker ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running cl.kibernumacademy.service.TaskTrackerTest
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.001 s <<< FAILURE! - in cl.kibernumacademy.service.TaskTrackerTest
[ERROR] cl.kibernumacademy.service.TaskTrackerTest  Time elapsed: 0.001 s  <<< ERROR!
java.lang.NoClassDefFoundError: TaskTracker
Caused by: java.lang.ClassNotFoundException: TaskTracker

[INFO] 
[INFO] Results:
[INFO]
[ERROR] Errors: 
[ERROR]   TaskTrackerTest » NoClassDefFound TaskTracker
[INFO]
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.413 s
[INFO] Finished at: 2025-07-13T12:46:59-04:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.1:test (default-test) on project tasktracker: There are test failures.
[ERROR]
[ERROR] Please refer to C:\Users\mvera\Documents\QA testing\tdd-junit\tasktracker\target\surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
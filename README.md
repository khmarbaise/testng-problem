TestNG Problem with dependsOnGroups
===================================

run the whole example via:

```
mvn clean verify
```
The output looks like this:

```
..
[INFO] --- maven-failsafe-plugin:2.19.1:integration-test (integration-test) @ testng-problem ---

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TestSuite
Wait until Jenkins is started....done.
NoExecutorStartedGetComputerSetIT:
  SUCCESS   getBusyExecutorsShouldReturnZero
  SUCCESS   getDisplayNameShouldReturnNodes
  SUCCESS   getTotalExecutorsShouldReturnZero
  SUCCESS   shouldGetNameOfMasterNode
NoExecutorStartedGetComputersIT:
  SUCCESS   getNameShouldReturnMaster
  SUCCESS   numberOfComputersIsEqualOne
NoExecutorStartedGetComputersWithDetailsIT:
  SUCCESS   getExecutorsShouldReturnTwo
  SUCCESS   getIdleShouldReturnTrue
  SUCCESS   getJnlpShouldReturnTrue
  SUCCESS   getLaunchSupportedShouldReturnTrue
  SUCCESS   getManualLanuchShouldReturnTrue
NoExecutorStartedPluginManagerIT:
  SUCCESS   getPluginsShouldReturn9ForJenkins20
ExecutorStartingIT:
  SUCCESS   shouldTriggerJobTest
ExecutorStartedIT:
  SUCCESS   shouldTriggerJobTest
Tests run: 14, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.499 sec - in TestSuite

Results :

Tests run: 14, Failures: 0, Errors: 0, Skipped: 0
```

To see the problem you need only to change the branch in git on `failure` branch
where you see the changed code where the code changed of `NoExecutorStartedPluginManagerIT`
from this:


```
@Test
public void getPluginsShouldReturn9ForJenkins20()
{
    assertThat(true).isTrue();
     //throw new SkipException("This requirement is not fulfilled.");
}
```

into this:
```
@Test
public void getPluginsShouldReturn9ForJenkins20()
{
    ///assertThat(true).isTrue();
    throw new SkipException("This requirement is not fulfilled.");
}
```

If you run on the `failure` branch you can see the following:

```
[INFO] --- maven-failsafe-plugin:2.19.1:integration-test (integration-test) @ testng-problem ---

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running TestSuite
Wait until Jenkins is started....done.
NoExecutorStartedGetComputerSetIT:
  SUCCESS   getBusyExecutorsShouldReturnZero
  SUCCESS   getDisplayNameShouldReturnNodes
  SUCCESS   getTotalExecutorsShouldReturnZero
  SUCCESS   shouldGetNameOfMasterNode
NoExecutorStartedGetComputersIT:
  SUCCESS   getNameShouldReturnMaster
  SUCCESS   numberOfComputersIsEqualOne
NoExecutorStartedGetComputersWithDetailsIT:
  SUCCESS   getExecutorsShouldReturnTwo
  SUCCESS   getIdleShouldReturnTrue
  SUCCESS   getJnlpShouldReturnTrue
  SUCCESS   getLaunchSupportedShouldReturnTrue
  SUCCESS   getManualLanuchShouldReturnTrue
NoExecutorStartedPluginManagerIT:
  SKIPPED ( This requirement is not fulfilled. )   getPluginsShouldReturn9ForJenkins20
Tests run: 14, Failures: 0, Errors: 0, Skipped: 3, Time elapsed: 3.109 sec - in TestSuite

Results :

Tests run: 14, Failures: 0, Errors: 0, Skipped: 3

[INFO] 
```

The full log files have been checked in also.

$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sampleAppLaunch.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 317132,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Sample App Launch",
  "description": "",
  "id": "login;sample-app-launch",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The Appium server is running",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "The simulator is open",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The app is launched",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "The app is closed",
  "keyword": "Then "
});
formatter.match({
  "location": "SampleAppLaunchSteps.the_Appium_server_is_running()"
});
formatter.result({
  "duration": 6156600553,
  "status": "passed"
});
formatter.match({
  "location": "SampleAppLaunchSteps.the_simulator_is_open()"
});
formatter.result({
  "duration": 27490,
  "status": "passed"
});
formatter.match({
  "location": "SampleAppLaunchSteps.the_app_is_launched()"
});
formatter.result({
  "duration": 23593,
  "status": "passed"
});
formatter.match({
  "location": "SampleAppLaunchSteps.the_app_is_closed()"
});
formatter.result({
  "duration": 1069859388,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "Verify if user is able to Login in to the site",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login as a authenticated user",
  "description": "",
  "id": "login-feature;login-as-a-authenticated-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is  on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user navigates to Login Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and Password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_is_on_homepage()"
});
formatter.result({
  "duration": 8169433364,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_navigates_to_Login_Page()"
});
formatter.result({
  "duration": 1737713703,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_enters_username_and_Password()"
});
formatter.result({
  "duration": 6972515832,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.success_message_is_displayed()"
});
formatter.result({
  "duration": 2812136907,
  "status": "passed"
});
});
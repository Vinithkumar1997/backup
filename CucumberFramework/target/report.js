$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/Pavithra%20Sukumar/eclipse-workspace/CucumberFramework/src/test/resources/loginAndForgotPassword.feature");
formatter.feature({
  "name": "To validate the login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user has to launch the chrome and hit the Fb url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_launch_the_chrome_and_hit_the_Fb_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the login functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user has to enter the username and password",
  "rows": [
    {
      "cells": [
        "vinith",
        "12345"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_enter_the_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user unable to enter the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_unable_to_enter_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To verify the Forgot Password Link",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user has to click the Forgot Password Link",
  "keyword": "When "
});
formatter.step({
  "name": "user has to enter the \"\u003cMobileNumber\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click search",
  "keyword": "And "
});
formatter.step({
  "name": "user has to navigate to the Identify account dialogue box",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "MobileNumber"
      ]
    },
    {
      "cells": [
        "8825974058"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user has to launch the chrome and hit the Fb url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_launch_the_chrome_and_hit_the_Fb_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the Forgot Password Link",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user has to click the Forgot Password Link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_click_the_Forgot_Password_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to enter the \"8825974058\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_enter_the(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click search",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.click_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user has to navigate to the Identify account dialogue box",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_navigate_to_the_Identify_account_dialogue_box()"
});
formatter.result({
  "status": "passed"
});
});
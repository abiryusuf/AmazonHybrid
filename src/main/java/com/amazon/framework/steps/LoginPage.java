package com.amazon.framework.steps;

import cucumber.api.java.en.Then;

public class LoginPage extends StepBase {
    @Then("^Enter \"([^\"]*)\" as email address$")
    public void enter_as_email_address(String arg1)  {
        login.EmailIDTextBox.sendKeys("yusuf_ctg@yahoo.com");

    }

    @Then("^Click Continue$")
    public void click_Continue()  {
        login.Continue.click();


    }

    @Then("^Enter \"([^\"]*)\" as password$")
    public void enter_as_password(String arg1) {
        login.passwordTextBox.sendKeys("ja135786");

    }

    @Then("^Click login$")
    public void click_login()  {
        login.SigninButton.click();

    }

    @Then("^Verify my account$")
    public void verify_my_account()  {
        login.verifyAccount();

    }
    @Then("^Verify my account \"([^\"]*)\"$")
    public void verify_my_account(String arg1)  {
        login.verifyAccount();
    }

  /*  @Then("^Error message should display$")
    public void error_massage_should_display() throws Throwable {
        login.verifyNotSuccessFulAccount();

    }*/





}

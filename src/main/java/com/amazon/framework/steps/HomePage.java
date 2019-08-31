package com.amazon.framework.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage extends StepBase {
    @Given("^As a not validated user$")
    public void as_a_not_validated_user()  {
       driver.manage().deleteAllCookies();

    }

    @When("^Browse to the url \"([^\"]*)\"$")
    public void browse_to_the_url(String arg1) {
        driver.navigate().to("http://www.amazon.com/");

    }

    @Then("^User click login button$")
    public void user_click_login_button()  {
        home.loginLink.click();

    }
}

package com.amazon.framework.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps extends StepBase {

    @When("^Write \"([^\"]*)\" as in search box$")
    public void write_as_in_search_box(String arg1)  {
        search.Search.sendKeys("shoes");

    }


    @When("^Drop and Down for shoes for men$")
    public void drop_and_Down_for_shoes_for_men()  {
        search.Searchforman.click();

    }

    @Then("^Click shoes for men$")
    public void click_shoes_for_men()  {
        search.Search.click();

    }



}
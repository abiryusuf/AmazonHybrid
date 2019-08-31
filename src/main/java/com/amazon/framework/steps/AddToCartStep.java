package com.amazon.framework.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartStep extends StepBase {
    @When("^Write \"([^\"]*)\" as search box and submit$")
    public void write_as_search_box_and_submit(String arg1)  {
        cart.Athelicshoes.sendKeys("Athletic shoes men");
        cart.Athelicshoes.submit();


    }

    @When("^Click tesla men shoes$")
    public void click_tesla_men_shoes()  {
        cart.Tesla.click();

    }

    @When("^Click choice color$")
    public void click_choice_color()  {
        cart.color.click();

    }

    @When("^Click Select box$")
    public void click_Select_box()  {
        cart.select.click();

    }

    @When("^Drop Down for  shoes size and click$")
    public void drop_Down_for_shoes_size_and_click()  {
        cart.size.click();

    }

    @Then("^Click Add to cart$")
    public void click_Add_to_cart()  {
        cart.addtocart.click();

    }

}

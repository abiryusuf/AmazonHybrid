package com.amazon.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyOrders {

    private WebDriver X = null;

    public MyOrders(WebDriver X) {
        this.X = X;
        PageFactory.initElements(X,this);

    }
    @FindBy(xpath = "//*[@class='nav-line-1']")
    public WebElement Account;

    @FindBy(how = How.XPATH, using = " //*[@class='nav-text']")
    public WebElement orders;
//MouseHover, I need an
// action class for mouseHover
    public void Orders(){
        Actions action = new Actions(X);
        action.moveToElement(Account).build().perform();
        action.moveToElement(orders);
        action.click();
        action.perform();

    }
    //@FindBy(how = How.XPATH, using = "")
}

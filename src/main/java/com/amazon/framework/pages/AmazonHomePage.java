package com.amazon.framework.pages;

import com.amazon.framework.testng.TestNG;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonHomePage {
    private WebDriver X = null;

    public static Logger log = LogManager.getLogger(TestNG.class.getName());

    ////Initializing the page Object
    public AmazonHomePage(WebDriver x) { //Constructor
        this.X = x;
        PageFactory.initElements(X, this);
    }

    @FindBy(xpath = ".//*[@id='nav-signin-tooltip']/a/span")
    public WebElement loginLink;

    @FindBy(how = How.XPATH, using = " //*[@class='nav-text']")
    public WebElement orders;



    //or

   /* public WebElement getSignin(){
        return X.findElement(By.cssSelector(".sign-in-button_for-lg.sign_in_border"));
    }*/

    public void navigateToLoginPage(){

        loginLink.click();
    }


   public void verifyAccount(String accountName){
        WebElement element = X.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[1]"));
        String actualText = element.getText();

        //Compare the text from the browser with actual text
        Assert.assertEquals(accountName, actualText);
        log.info("successfully shows home page");



    }


}







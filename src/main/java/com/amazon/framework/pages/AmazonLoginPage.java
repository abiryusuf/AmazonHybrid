package com.amazon.framework.pages;

import com.amazon.framework.testng.TestNG;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonLoginPage {

    public static Logger log = LogManager.getLogger(TestNG.class.getName());

    private WebDriver X = null;


//Initializing the page Object
    public AmazonLoginPage(WebDriver X) {
        this.X = X;
        PageFactory.initElements(X, this);

    }

    @FindBy(how = How.XPATH, using = ".//*[@id='ap_email']")
    @CacheLookup //Improvement script: every webelement does not go to browser to find element
    public WebElement EmailIDTextBox;



    @FindBy(how = How.XPATH, using = ".//*[@id='ap_password']")
    public WebElement passwordTextBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='signInSubmit']")
    public WebElement SigninButton;

    @FindBy(how =How.XPATH, using = ".//*[@id='continue']")
    public WebElement Continue;

    @FindBy(xpath = "//*[@class='nav-logo-base nav-sprite']")
    WebElement AmazonLogo;



    //OR

    //Page Factory or Object repository

    /*@FindBy(xpath = "//*[@id='ap_email']")
 WebElement userName;*/
    /*Another way to find element
    By EmailID = By.xpath(".//*[@id='ap_email']");
    protected WebElement EmailIDTextBox;

    By password = By.xpath(".//*[@id='ap_password']");
    protected WebElement getPassword;

   */

    public boolean AmazonLogo(){
        return AmazonLogo.isDisplayed();
    }

//Actions
    public void Signin(String EmailID, String password){
        EmailIDTextBox.sendKeys(EmailID);
        Continue.click();
        passwordTextBox.sendKeys(password);
        SigninButton.click();


    }

    public void verifyAccount(String accountName){
        WebElement element = X.findElement(By.xpath("//*[class='nav-line-1']"));
        String actualText = element.getText();

        //Compare the text from the browser with actual text
        Assert.assertEquals(accountName, actualText);
        log.info("Hello, yusuf");



    }
}


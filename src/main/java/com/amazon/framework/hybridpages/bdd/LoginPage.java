package com.amazon.framework.hybridpages.bdd;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){
        super();
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.XPATH, using = ".//*[@id='ap_email']")
    @CacheLookup //Improvement script: every webelement does not go to browser to find element
    public WebElement EmailIDTextBox;


    @FindBy(how = How.XPATH, using = ".//*[@id='ap_password']")
    public WebElement passwordTextBox;

    @FindBy(how = How.XPATH, using = ".//*[@id='signInSubmit']")
    public WebElement SigninButton;

    @FindBy(how = How.XPATH, using = ".//*[@id='continue']")
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

    public boolean AmazonLogo() {
        return AmazonLogo.isDisplayed();
    }

    //Actions
    public void Signin(String EmailID, String password) {
        EmailIDTextBox.sendKeys(EmailID);
        Continue.click();
        passwordTextBox.sendKeys(password);
        SigninButton.click();


    }


    public void verifyAccount() {
        WebElement element = driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[1]"));
                // *[@id='nav-link-accountList']/span[1]"));
        String actualText = element.getText();

        //Compare the text from the browser with actual text
        Assert.assertEquals("Hello, yusuf",actualText);
       // log.info("Hello, yusuf");

    }

 /*  public void verifyNotSuccessFulAccount(){

        WebElement element = driver.findElement(By.xpath(".//*[@id='auth-error-message-box']/div/div/ul/li/span"));////*[@class='a-list-item']
        String actualtext = element.getText();
        Assert.assertEquals("We cannot find an account with that email address", actualtext);

    }*/
}
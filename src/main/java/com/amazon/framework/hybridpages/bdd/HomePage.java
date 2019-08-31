package com.amazon.framework.hybridpages.bdd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(){
        super();
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = ".//*[@id='nav-signin-tooltip']/a/span")
    public WebElement loginLink;

    @FindBy(how = How.XPATH, using = " //*[@class='nav-text']")
    public WebElement orders;


   /* public void Orders(){
        Actions action = new Actions(driver);
        action.moveToElement(loginLink).build().perform();
        orders.click();
    }*/


    //or

   /* public WebElement getSignin(){
        return X.findElement(By.cssSelector(".sign-in-button_for-lg.sign_in_border"));
    }*/

    public void navigateToLoginPage(){

        loginLink.click();
    }


  /* public void verifyAccount(String accountName){
        WebElement element = driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[1]"));
        String actualText = element.getText();

        //Compare the text from the browser with actual text
        Assert.assertEquals(accountName, actualText);
        //log.info("successfully shows home page");



    }*/
}

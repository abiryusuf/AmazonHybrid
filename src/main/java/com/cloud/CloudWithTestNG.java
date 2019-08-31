package com.cloud;

import com.amazon.framework.steps.AddToCartStep;
import com.amazon.framework.steps.HomePage;
import com.amazon.framework.steps.LoginPage;
import com.amazon.framework.steps.SearchSteps;
import com.amazon.framework.utils.DriverFactory;
import com.amazon.framework.utils.WebElementUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CloudWithTestNG {

    protected WebDriver driver;

    public HomePage homePage;
    public SearchSteps search;
    public AddToCartStep cart;
    public LoginPage login;
    public WebElementUtils webElementUtils;

    @BeforeMethod
    @Parameters({"browserName"})
    public void beforeMethod(@Optional(value = "cloud_chrome_64") String browserName) throws Exception {
        driver = DriverFactory.getInstance(browserName).getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

        driver.navigate().to("https://www.amazon.com/");


        homePage = new HomePage();
        search = new SearchSteps();
        cart = new AddToCartStep();
        login = new LoginPage();
        webElementUtils = new WebElementUtils();

    }
    @AfterMethod
    public void afterMethod(){
        homePage = null;
        search = null;
        webElementUtils = null;


        DriverFactory.getInstance().removeDriver();
    }
}
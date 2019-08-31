package com.cloud;


import com.amazon.framework.steps.AddToCartStep;
import com.amazon.framework.steps.HomePage;
import com.amazon.framework.steps.LoginPage;
import com.amazon.framework.steps.SearchSteps;
import com.amazon.framework.utils.DriverFactory;
import com.amazon.framework.utils.WebElementUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;


public class CloudWithJunit {
    protected WebDriver driver;

    public HomePage homePage;
    public SearchSteps search;
    public AddToCartStep cart;
    public LoginPage login;
    public WebElementUtils webElementUtils;


    @Parameterized.Parameter()
    public String browserName="chrome";


    @Before
    public void setUp() throws Exception {
        System.out.println("Browser: " + browserName);
        driver = DriverFactory.getInstance(browserName).getDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");


        homePage = new HomePage();
        search = new SearchSteps();
        cart = new AddToCartStep();
        login = new LoginPage();
        webElementUtils = new WebElementUtils();


    }


    @After
    public void tearDown() {
        homePage = null;
        search = null;
        webElementUtils = null;


        DriverFactory.getInstance().removeDriver();
      //  driver.close();
       // driver.quit();
    }

    @Parameterized.Parameters(name = "{index} - Browser - {0}")
    public static Collection<Object[]> browsers() {
        return Arrays.asList(new Object[][]{

                {"chrome"},
                //{"firefox"},
                {"cloud_chrome_64"},
                //{"cloud_ie_11"}
        });
    }

}

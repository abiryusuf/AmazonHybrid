package com.amazon.framework.testng;

import com.amazon.framework.reporting.ExtentTestNGITestListener;
import com.amazon.framework.utils.WebElementUtils;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

@Listeners({ExtentTestNGITestListener.class})

//TestNg helps to do test case step by step or build test case whatever we want such as groups, decency,

public class TestNG
{


    public WebDriver X = null;
    protected ApplicationBase Amazon;
    private static final int DEFAULT_IMPLICITY_WAIT_TIME = 20;
    private static final int PAGE_LOAD_TIMEOUT = 20;
    protected WebElementUtils webElementUtils;

    public static Logger log = LogManager.getLogger(TestNG.class.getName());




   /*public TestNG(WebDriver X) {
        super(X);*/


    public WebDriver getX() {

        return X;
    }

    @BeforeSuite
    public void beforeSuite() {

        System.out.println("******before suite will executes first*******");
    }

    @BeforeClass
    public void beforeClass() {

        System.out.println("This block executes before all test case");
    }

    @BeforeMethod
    @Parameters({"browserName"})
    public void setUp() {
        System.out.println("******This block executes before each test case********");
        ChromeDriverManager.getInstance().setup();
        X = new ChromeDriver();
        X.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        X.manage().timeouts().implicitlyWait(DEFAULT_IMPLICITY_WAIT_TIME, TimeUnit.SECONDS);
        X.manage().window().maximize();
        X.navigate().to("https://www.amazon.com/");
        log.info("navigate to homepage");
        log.info("Driver initialized");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("****This block excutes after each test case*******");
       X.close();
       X.quit();
       Amazon = null;
    }

    @AfterClass
    public void afterClass() {

        System.out.println("This block executes after all test case");
    }

    @AfterSuite
    public void afterSuite() {

        System.out.println("after suite will executes last");
    }
    /*A Singleton class in java can have only instant and hence all its methods and variable belong
     * to just one instance.
     * Singleton class concept is useful for the situation when there is a need to limit the number of objects for a class*/

    public ApplicationBase Amazon() {
        if (Amazon == null) {
            Amazon = new ApplicationBase(X);
        }
        return Amazon;
    }


}


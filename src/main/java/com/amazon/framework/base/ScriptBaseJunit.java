package com.amazon.framework.base;

import com.amazon.framework.reporting.ExtentTestNGITestListener;
import com.amazon.framework.utils.DriverFactory;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

@Listeners({ExtentTestNGITestListener.class})
public class ScriptBaseJunit {

    static final int DEFAULT_IMPLICITY_WAIT_TIME = 30;
    public WebDriver X = null;
    public ApplicationBaseJunit Amazon = null;

    protected WebDriver driver = DriverFactory.getInstance().getDriver();;
   // protected ReporterService reporter = ReporterService.reporter();

    public WebDriver getX() {

        return X;
    }

    //Before is executed once before each test where BeforeClass is only executed once before all tests.
    @BeforeClass
    public static void beforeClass() {
        System.out.println("**********beforeClass**********");
        /*rep.setReportPath(System.getProperty("user.dir") + "/test-output/htmlReport/");
        reporter.setReportName("PaxoReport");
        reporter.setReportTitle("Paxo Functional Test");
        reporter.setCreateUniqueFileName(true);*/
    }

    @Before
    public void setUp1() {
        FirefoxDriverManager.getInstance().setup();
        WebDriver X = new FirefoxDriver();
        X = new FirefoxDriver(); //Can not create an object without constructor
        X.manage().window().maximize();
        X.manage().deleteAllCookies();

        //Dynamic wait
        X.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        X.manage().timeouts().implicitlyWait(DEFAULT_IMPLICITY_WAIT_TIME, TimeUnit.SECONDS); //it is related to element or cheack the element.
        X.navigate().to("https://www.amazon.com/");


    }

    @Before
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        X = new ChromeDriver(); //Can not create an object without constructor
        X.manage().window().maximize();
        X.manage().deleteAllCookies();

        //Dynamic wait
        X.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        X.manage().timeouts().implicitlyWait(DEFAULT_IMPLICITY_WAIT_TIME, TimeUnit.SECONDS); //it is related to element or cheack the element.
        X.navigate().to("https://www.amazon.com/");
    }

    @After
    public void tearDown() {
        System.out.println("********After*********");
        X.close();
        X.quit();
        X = null;
    }

    @AfterClass
    public static void AfterClass() {
        System.out.println("***********After Class*************");

    }
   /* public ApplicationBaseJunit amazon(){
        if(amazon == null){
            amazon=new ApplicationBaseJunit();
        }
        return amazon;
    }*/


}


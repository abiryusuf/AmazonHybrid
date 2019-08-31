package com.amazon.framework.utils;

import com.amazon.framework.reporting.ExtentTestNGITestListener;
import com.amazon.framework.testng.ApplicationBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Listeners({ExtentTestNGITestListener.class})
public class IntializeDriver {


    private static final int DEFAULT_IMPLICITY_WAIT_TIME = 20;

    public WebDriver X = null;
    private ApplicationBase Amazon;

    @Parameters("browser")
    @BeforeMethod(alwaysRun = true)

    // public void browser(@Optional("ch") String browser) throws IOException {//

    public WebDriver browser(@Optional("ch") String browser) throws IOException {
        //Properties abir = new Properties();
        //FileInputStream file = new FileInputStream(file from documents);
        if (browser.contentEquals("ch")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
            X = new ChromeDriver();
        } else if (browser.contentEquals("ff")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/driver/geckodriver.exe");
            X = new FirefoxDriver();
            X.manage().timeouts().implicitlyWait(DEFAULT_IMPLICITY_WAIT_TIME, TimeUnit.SECONDS);
            X.get("https://www.amazon.com/");

        }

        return X;
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("********After*********");
        X.close();
        X.quit();
        X = null;
    }








}



package com.amazon.framework.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hook extends StepBase {
    @Before
    public void setup() {
        //ChromeDriverManager.getInstance().setup();
        //driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        //driver.close();
        //driver.quit();
        //DriverFactory.getInstance().removeDriver();
        //homePage = null;
    }
}

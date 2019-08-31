package com.amazon.framework.base;

import com.amazon.framework.pages.AmazonHomePage;
import com.amazon.framework.pages.AmazonLoginPage;
import com.amazon.framework.pages.ShoppingCart;
import com.amazon.framework.utils.DriverFactory;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public class ApplicationBaseJunit extends ScriptBaseJunit {
    private AmazonHomePage HomePage = null;
    private AmazonLoginPage LoginPage = null;
    private com.amazon.framework.pages.ShoppingCart ShoppingCart = null;
    protected WebDriver driver = DriverFactory.getInstance().getDriver();;

    @Before
    @Override //parent and child or super class to sub class, exactly the same method extends from another or parent class
    public void setUp(){
        super.setUp();
        getX().navigate().to("http://www.amazon.com/");
        }
    public AmazonHomePage HomePage() {
        if (HomePage == null) {
            HomePage = new AmazonHomePage(getX());
        }
        return HomePage;
    }

    public AmazonLoginPage LoginPage() {
        if (LoginPage == null) {
            LoginPage = new AmazonLoginPage(getX());
        }

        return LoginPage;

    }
    public com.amazon.framework.pages.ShoppingCart ShoppingCart(){
        if (ShoppingCart == null){
            ShoppingCart = new ShoppingCart(getX());
        }
        return ShoppingCart;
    }




}





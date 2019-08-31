package com.amazon.framework.testng;

import com.amazon.framework.pages.AmazonHomePage;
import com.amazon.framework.pages.AmazonLoginPage;
import com.amazon.framework.pages.MyOrders;
import com.amazon.framework.pages.ShoppingCart;
import org.openqa.selenium.WebDriver;

public class ApplicationBase {

    private AmazonHomePage HomePage = null;
    private AmazonLoginPage LoginPage = null;
    private ShoppingCart Cart = null;
    private MyOrders orders = null;
    //protected ApplicationBase Amazon = null;

    private WebDriver X = null;

    public ApplicationBase(WebDriver X) {

        this.X = X;
    }
   /*@BeforeMethod
    //@Override
    public void setUp(){
        super.setUp();
        getX().navigate().to("http://www.amazon.com/");
    }*/


    public AmazonHomePage HomePage() {
        if (HomePage == null) {
            HomePage = new AmazonHomePage(X);
        }
        return HomePage;
    }

    public AmazonLoginPage LoginPage() {
        if (LoginPage == null) {
            LoginPage = new AmazonLoginPage(X);
        }
        return LoginPage;

    }

    public ShoppingCart Cart() {
        if (Cart == null) {
            Cart = new ShoppingCart(X);
        }
        return Cart;
    }
    public MyOrders orders(){
        if(orders==null){
            orders=new MyOrders(X);
        }
        return orders;
    }



    }



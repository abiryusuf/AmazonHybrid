package testing.com.test;

import com.amazon.framework.reporting.ExtentTestNGITestListener;
import com.amazon.framework.testng.TestNG;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({ExtentTestNGITestListener.class})
public class LoginTestWithTestNG extends TestNG {

    //Every test case is not dependent each other
    //Before each test case -- launch the browser and login
    //Execute the test case
    //after each test case close the browser and quit

    @Test( priority = 2)
    public void loginTest(){
        System.out.println("*******valid Login test******");
        Amazon().HomePage().navigateToLoginPage();
        Amazon().LoginPage().Signin("yusuf_ctg@yahoo.com", "ja135786");
        Amazon().HomePage().verifyAccount("Hello, yusuf");


    }
    //Priority helps to execute sequencely what I want to execute first
    //Group

    @Test(groups = {"smoke-test"}, priority = 1)
    public void LogoTest(){
        Amazon().LoginPage().AmazonLogo();
    }

    @Test(priority = 3)
    public void CartTest(){
      /*  Amazon().HomePage().navigateToLoginPage(); // public ApplicationBase Amazon() // singleton
        Amazon().LoginPage().Signin("yusuf_ctg@yahoo.com", "ja135786");
        Amazon().HomePage().verifyAccount("Hello, yusuf");*/


        Amazon().Cart().printCartList();
        Amazon().Cart().findItem("3");
    }
    @Test(priority = 4)
    public void MyOrdersTest(){
        Amazon().HomePage().navigateToLoginPage(); // public ApplicationBase Amazon() // singleton
        Amazon().LoginPage().Signin("yusuf_ctg@yahoo.com", "ja135786");
       Amazon().HomePage().verifyAccount("Hello, yusuf");

        Amazon().orders().Orders();

        //Amazon() = TestNG annotation
        //orders ()= Application base
        //Orders ()= Method

    }
}

//OR

         /*Amazon().HomePage().navigateToLoginPage();
          Amazon().LoginPage().Signin(EmailId, password);
           Amazon().HomePage().verifyAccount(accountName)*/
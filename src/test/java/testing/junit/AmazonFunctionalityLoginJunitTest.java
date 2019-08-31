package testing.junit;

import com.amazon.framework.base.ApplicationBaseJunit;
import org.junit.Test;

public class AmazonFunctionalityLoginJunitTest extends ApplicationBaseJunit {

    @Test
    public void LoginTest(){
        System.out.println("********Test*********");
        HomePage().navigateToLoginPage();
        LoginPage().Signin("yusuf_ctg@yahoo.com", "ja135786");
        HomePage().verifyAccount("Hello, yusuf");
    }
    /*@Test
    public void ShoppingCart(){
        System.out.println("*******Shopping*********");
        HomePage().navigateToLoginPage();*/

}




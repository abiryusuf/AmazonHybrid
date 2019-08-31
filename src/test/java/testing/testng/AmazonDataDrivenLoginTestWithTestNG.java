package testing.testng;

import com.amazon.framework.pages.AmazonHomePage;
import com.amazon.framework.pages.AmazonLoginPage;
import com.amazon.framework.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonDataDrivenLoginTestWithTestNG extends TestNG {

    //public static Logger log = LogManager.getLogger(TestNG.class.getName());
    @DataProvider
    public Object[][] getData() {
        Object[][] data;
        data =  new Object[][]{
                {"yusuf_ctg@yahoo.com", "ja135786", "Hello, yusuf"}
                //as much I can, just i need to give emailid, password and account name
        };
        return data;
    }
    //OR
    //Array and index start from 0.
    //[][] = 1st one is row and 2nd one is coloum

   /*public Object [][] getData(){
    Object [][] data = new Object[2][3];
     data[0][0] = "yusuf_ctg@yahoo.com";
     data[0][1] = "ja135786";
     data[0][2] = "accountName";
     return data;*/


    @Test(dataProvider = "getData") //get data = {"yusuf_ctg@yahoo.com", "ja135786", "Hello, yusuf"}
    public void AmazonLoginDataProviderInClassarray (String EmailId, String password, String accountName) {
        System.out.println("******TestWithValiedUserAndPassword*********");
        X.get("http://www.amazon.com/"); // I need to public Webdriver then I can access

        //Create an Object
        AmazonHomePage a = new AmazonHomePage(X);
        a.loginLink.click();

        AmazonLoginPage b = new AmazonLoginPage(X);
        b.EmailIDTextBox.sendKeys(EmailId);
        b.Continue.click();
        b.passwordTextBox.sendKeys(password);
        b.SigninButton.click();

       // b.Continue.click();

        AmazonHomePage c = new AmazonHomePage(X);
        c.verifyAccount(accountName);

    }
           /* OR
           Amazon().HomePage().navigateToLoginPage();
           Amazon().LoginPage().Signin(EmailId, password);
           Amazon().HomePage().verifyAccount(accountName);
            */
    }




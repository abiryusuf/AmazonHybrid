package testing.icloud;

import com.cloud.CloudWithTestNG;
import org.testng.annotations.Test;

public class CloudTestWithTestNG extends CloudWithTestNG {

    @Test
    public void HomePageTest() {
        homePage.as_a_not_validated_user();
        homePage.browse_to_the_url("http://www.amazon.com/");
        homePage.user_click_login_button();
    }

    @Test
    public void searchTest() {
        homePage.browse_to_the_url("http://www.amazon.com/");
        search.write_as_in_search_box("shoes");
        search.drop_and_Down_for_shoes_for_men();
        search.click_shoes_for_men();

    }

    @Test
    public void AddToCartTest() {
        homePage.browse_to_the_url("http://www.amazon.com/");
        cart.write_as_search_box_and_submit("Athletic shoes men");
        cart.click_tesla_men_shoes();
        cart.click_choice_color();
        cart.click_Select_box();
        cart.drop_Down_for_shoes_size_and_click();
        cart.click_Add_to_cart();
    }

  //  @Test
    public void LoginTest() {
        homePage.browse_to_the_url("http://www.amazon.com");
        homePage.user_click_login_button();
        login.enter_as_email_address("yusuf_ctg@yahoo.com");
        login.click_Continue();
        login.enter_as_password("ja135786");
        login.click_login();
        login.verify_my_account();
    }

}

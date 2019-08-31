package com.amazon.framework.hybridpages.bdd;

import com.amazon.framework.utils.WebElementUtils;

public class BasePage extends WebElementUtils {

    public BasePage() {

        super();
    }

   /* public void verifyAccount(String accountName) {
        WebElement element = driver.findElement(By.xpath("//*[class='nav-line-1']"));
        String actualText = element.getText();

        //Compare the text from the browser with actual text
        Assert.assertEquals(accountName, actualText);
        // log.info("successfully shows home page");
    }*/
}
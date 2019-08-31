package com.amazon.framework.hybridpages.bdd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {

    public CartPage() {
        super();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = ".//*[@id='twotabsearchtextbox']")
    public WebElement Athelicshoes;

    @FindBy(how = How.CSS, using =".s-item-container")
    public WebElement Tesla;

    @FindBy(how = How.CSS, using ="#a-autoid-11-announce")
    public WebElement color;

    @FindBy(how = How.XPATH, using = ".//*[@id='dropdown_selected_size_name']/span/span" )
    public WebElement select;

    @FindBy(how = How.XPATH, using = ".//*[@id='native_dropdown_selected_size_name_7']")
    public WebElement size;

    @FindBy(how = How.XPATH, using = ".//*[@id='add-to-cart-button']")
    public WebElement addtocart;

    public void writeShoes(String arg1, String sub ){
        Athelicshoes.sendKeys();
        Athelicshoes.submit();


    }


    public void addcart(){
        Athelicshoes.click();
        Tesla.click();
        color.click();
        addtocart.click();
    }

   public void select(){
       Actions act = new Actions(driver);
       act.moveToElement(select).build().perform();
       act.moveToElement(size);
       act.click();
       act.perform();
   }

}

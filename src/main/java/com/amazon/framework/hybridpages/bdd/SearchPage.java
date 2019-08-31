package com.amazon.framework.hybridpages.bdd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {

   public SearchPage() {
        super();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = ".//*[@id='twotabsearchtextbox']")
    public WebElement Search;

    @FindBy(how = How.XPATH, using = ".//*[@id='issDiv2']")
    public WebElement Searchforman;

    public void search1(String args){
        Search.sendKeys();

    }
// action class for mouseHover
    public void SearchBox() {

        Actions action = new Actions(driver);
        action.moveToElement(Search).build().perform();
        action.moveToElement(Searchforman);
        action.click();
        action.perform();
    }


    }






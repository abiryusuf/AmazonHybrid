package com.amazon.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {



    private WebDriver X = null;

    public ShoppingCart(WebDriver X) {
        this.X =X;
        PageFactory.initElements(X, this);
    }
    @FindBy(xpath = ".//*[@id='nav-cart']")
    private WebElement cartBox;

    public void navigateToCartBoxPage(){

        cartBox.click();
    }

    private ArrayList<String> cartlist = new ArrayList<String>();

    ArrayList<String>str = new ArrayList<>();
    List<String> s = new ArrayList<String>();

    public void addCartItem(String item){

        cartlist.add(item);
    }

    public void printCartList() {
        System.out.println("I have " + cartlist.size() + "item in my cart list");
        for (int i = 0; i < cartlist.size(); i++) {
            System.out.println((i + 1) + " . " + cartlist.get(i));
        }
    }
    public void modifyCartItem(int position, String newitem) {
        cartlist.set(position, newitem);
        System.out.println("Cart item " + (position + 1) + "has been modify");

    }
    public void removeCartItem(int position){
        String theItem = cartlist.get(position);
        cartlist.remove(position);
    }
    public  String findItem(String searchItem ){
        int position = cartlist.indexOf(searchItem);
        if (position>=0){
            return cartlist.get(position);
        }
        return null;
    }

    public void ShoppingCart(){
        cartBox.click();

    }


}



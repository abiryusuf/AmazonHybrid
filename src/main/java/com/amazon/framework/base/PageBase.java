package com.amazon.framework.base;

import org.openqa.selenium.WebDriver;

public class PageBase {
    protected WebDriver X = null;

    public PageBase(WebDriver x) {

        X = x;
    }

    public WebDriver getX() {
        return X;
    }


}

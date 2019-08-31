package com.amazon.framework.steps;

import com.amazon.framework.hybridpages.bdd.CartPage;
import com.amazon.framework.hybridpages.bdd.HomePage;
import com.amazon.framework.hybridpages.bdd.LoginPage;
import com.amazon.framework.hybridpages.bdd.SearchPage;
import com.amazon.framework.utils.WebElementUtils;

public class StepBase extends WebElementUtils {
    public HomePage home = new HomePage();
    public LoginPage login = new LoginPage();
    public SearchPage search = new SearchPage();
    public CartPage cart = new CartPage();
}

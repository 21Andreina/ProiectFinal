package TestCases;

import Pages.BackToProductsPage;
import Pages.BasePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BackToProductsTests extends BasePage {
    private BackToProductsPage BackToProductsPage;
    private LoginPage LoginPage;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        BackToProductsPage = new BackToProductsPage(driver);
        LoginPage = new LoginPage(driver);
    }

    @Test
    public void clickOnBackToProductsButtonInStandardUser(){
        LoginPage.typeinUsernameField("standard_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        BackToProductsPage.clickOnSauceLabsBackpack();
        BackToProductsPage.clickOnBackToProductsButton();

        Assert.assertTrue(driver.getPageSource().contains("Products"));
    }

    @Test
    public void clickOnBackToProductsButtonInPerformanceGlitchUser(){
        LoginPage.typeinUsernameField("performance_glitch_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        BackToProductsPage.clickOnSauceLabsBackpack();
        BackToProductsPage.clickOnBackToProductsButton();

        Assert.assertTrue(driver.getPageSource().contains("Products"));


    }



}


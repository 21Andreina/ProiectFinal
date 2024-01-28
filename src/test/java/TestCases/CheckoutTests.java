package TestCases;

import Pages.BasePage;
import Pages.CheckoutPage;
import Pages.LoginPage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckoutTests extends BasePage {
    private CheckoutPage CheckoutPage;
    private Pages.LoginPage LoginPage;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        CheckoutPage = new CheckoutPage(driver);
        LoginPage = new LoginPage(driver);

    }
    @Description("Add 2 Items In Cart And Checkout")
    @Test (priority = 1)
    public void add2ItemsInCartAndCheckout(){
        LoginPage.typeinUsernameField("standard_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CheckoutPage.clickOnAddToCartSauceLabsBackpack();
        CheckoutPage.clickOnAddToCartSauceLabsFleeceJacket();
        CheckoutPage.clickOnCartButton();
        CheckoutPage.clickOnCheckoutbutton();
        CheckoutPage.typeNameInFirstNameField("test");
        CheckoutPage.typeLastNameInLastNameField("Testulet");
        CheckoutPage.typeInZipPostalCodeField("12345");
        CheckoutPage.clickOnContinueButton();
        CheckoutPage.clickOnFinishButton();

        String actualResult = driver.findElement(By.cssSelector("#checkout_complete_container > h2")).getText();
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));

        CheckoutPage.clickOnBackHomeButton();

    }

    @Description("Checkout Without Items In Cart")
    @Test (priority = 2)
    public void CheckoutWithoutItemsInCart(){
        LoginPage.typeinUsernameField("standard_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CheckoutPage.clickOnCartButton();
        CheckoutPage.clickOnCheckoutbutton();
        CheckoutPage.typeNameInFirstNameField("Test");
        CheckoutPage.typeLastNameInLastNameField("Testulet");
        CheckoutPage.typeInZipPostalCodeField("12334");
        CheckoutPage.clickOnContinueButton();
        CheckoutPage.clickOnFinishButton();

        String actualResult = driver.findElement(By.cssSelector("#checkout_complete_container > h2")).getText();
        Assert.assertTrue(actualResult.contains("Thank you for your order!"));

    }


    @Description("Checkout Without Type In First Name Field")
    @Test (priority = 3)
    public void CheckoutWithoutTypeInFirstNameField(){
        LoginPage.typeinUsernameField("standard_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CheckoutPage.clickOnCartButton();
        CheckoutPage.clickOnCheckoutbutton();
        CheckoutPage.typeNameInFirstNameField("");
        CheckoutPage.typeLastNameInLastNameField("Testulet");
        CheckoutPage.typeInZipPostalCodeField("12334");
        CheckoutPage.clickOnContinueButton();

        String actualResult = driver.findElement(By.cssSelector("#checkout_info_container > div > form > div.checkout_info > div.error-message-container.error > h3")).getText();
        Assert.assertTrue(actualResult.contains("Error: First Name is required"));

    }



    @Description("Checkout Without Type In Last Name Field")
    @Test (priority = 4)
    public void checkoutWithoutTypeInLastNameField(){
        LoginPage.typeinUsernameField("standard_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CheckoutPage.clickOnCartButton();
        CheckoutPage.clickOnCheckoutbutton();
        CheckoutPage.typeNameInFirstNameField("Test");
        CheckoutPage.typeLastNameInLastNameField("");
        CheckoutPage.typeInZipPostalCodeField("12334");
        CheckoutPage.clickOnContinueButton();

        String actualResult = driver.findElement(By.cssSelector("#checkout_info_container > div > form > div.checkout_info > div.error-message-container.error > h3")).getText();
        Assert.assertTrue(actualResult.contains("Error: Last Name is required"));
    }


    @Description("Checkout Without Type In Postal Code Field")
    @Test (priority = 5)
    public void CheckoutWithoutTypeInZipPostalCode(){
        LoginPage.typeinUsernameField("standard_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CheckoutPage.clickOnCartButton();
        CheckoutPage.clickOnCheckoutbutton();
        CheckoutPage.typeNameInFirstNameField("Test");
        CheckoutPage.typeLastNameInLastNameField("Testulet");
        CheckoutPage.typeInZipPostalCodeField("");
        CheckoutPage.clickOnContinueButton();

        String actualResult = driver.findElement(By.cssSelector("#checkout_info_container > div > form > div.checkout_info > div.error-message-container.error > h3")).getText();
        Assert.assertTrue(actualResult.contains("Error: Postal Code is required"));
    }

    @Description("Add 2 items in cart and check the total price")
    @Test (priority = 6)
    public void CheckTotalPriceBeforeFinishCheckout(){
        LoginPage.typeinUsernameField("standard_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CheckoutPage.clickOnAddToCartSauceLabsFleeceJacket();
        CheckoutPage.clickOnAddToCartSauceLabsBackpack();
        CheckoutPage.clickOnCartButton();
        CheckoutPage.clickOnCheckoutbutton();
        CheckoutPage.typeNameInFirstNameField("test");
        CheckoutPage.typeLastNameInLastNameField("testulet");
        CheckoutPage.typeInZipPostalCodeField("12345");
        CheckoutPage.clickOnContinueButton();

        String actualResult = driver.findElement(By.cssSelector("#checkout_summary_container > div > .summary_info > .summary_info_label.summary_total_label")).getText();
        Assert.assertTrue(actualResult.contains("Total: $86.38"));
    }

    @Description("Add 1 Item In Cart And Go To Checkout And Click Cancel button")
    @Test (priority = 7)
    public void GoToCheckoutAndClickCancel(){
        LoginPage.typeinUsernameField("standard_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CheckoutPage.clickOnAddToCartSauceLabsBackpack();
        CheckoutPage.clickOnCartButton();
        CheckoutPage.clickOnCheckoutbutton();
        CheckoutPage.clickOnCancelButton();

        String actuaResult = driver.findElement(By.cssSelector("#item_4_title_link > div")).getText();
        Assert.assertTrue(actuaResult.contains("Sauce Labs Backpack"));

    }
    @Description("Cancel The Checkout")
    @Test (priority = 8)
    public void CancelTheCheckout(){
        LoginPage.typeinUsernameField("standard_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CheckoutPage.clickOnAddToCartSauceLabsBackpack();
        CheckoutPage.clickOnCartButton();
        CheckoutPage.clickOnCheckoutbutton();
        CheckoutPage.typeNameInFirstNameField("test");
        CheckoutPage.typeLastNameInLastNameField("testulet");
        CheckoutPage.typeInZipPostalCodeField("12345");
        CheckoutPage.clickOnContinueButton();
        CheckoutPage.clickOnCancelButton();

        String actualResult = driver.findElement(By.cssSelector("#item_4_title_link > div")).getText();
        Assert.assertTrue(actualResult.contains("Sauce Labs Backpack"));
    }



}

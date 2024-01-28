package TestCases;

import Pages.BasePage;
import Pages.AddAndRemoveItemsFromCartPage;
import Pages.LoginPage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddAndRemoveItemsFromCartTests extends BasePage {
   private AddAndRemoveItemsFromCartPage AddAndRemoveItemsFromCartPage;
    private Pages.LoginPage LoginPage;

   @BeforeMethod
    public void setUp(){
        super.setUp();
        AddAndRemoveItemsFromCartPage = new AddAndRemoveItemsFromCartPage(driver);
       LoginPage = new LoginPage(driver);
    }

    @Description("Add All Items In Cart And Check Number Of The Cart")
    @Test (priority = 1)
    public void AddAllItemsInCartAndCheckNumberOfTheCart() {
        LoginPage.typeinUsernameField("standard_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        AddAndRemoveItemsFromCartPage.clickOnAddToCartSauceLabsBackpack();
        AddAndRemoveItemsFromCartPage.clickOnAddToCartSauceLabsBikeLight();
        AddAndRemoveItemsFromCartPage.clickOnAddToCartSauceLabsBoltTShirt();
        AddAndRemoveItemsFromCartPage.clickOnAddToCartSauceLabsOnesie();
        AddAndRemoveItemsFromCartPage.clickOnAddToCartSauceLabsFleeceJacket();
        AddAndRemoveItemsFromCartPage.clickOnAddToCartTestALlTheThingsTShirtRed();

        String actualResult = driver.findElement(By.cssSelector("#shopping_cart_container > a > span")).getText();
        Assert.assertTrue(actualResult.contains("6"));
    }


    @Description("Add 3 Items In Cart And Remove 2 Items And Check Number Of The Cart ")
    @Test (priority = 3)
    public void Add3ItemsInCartAndRemove2ItemsFromCart(){
        LoginPage.typeinUsernameField("standard_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        AddAndRemoveItemsFromCartPage.clickOnAddToCartSauceLabsBackpack();
        AddAndRemoveItemsFromCartPage.clickOnAddToCartSauceLabsBikeLight();
        AddAndRemoveItemsFromCartPage.clickOnAddToCartSauceLabsBoltTShirt();
        AddAndRemoveItemsFromCartPage.clickOnCartButton();
        AddAndRemoveItemsFromCartPage.clickOnRemoveSauceLabsBackpack();
        AddAndRemoveItemsFromCartPage.clickOnRemoveSauceLabsBikeLight();
        AddAndRemoveItemsFromCartPage.clickOnContinueShoppingButton();;

        String actualResult = driver.findElement(By.cssSelector("#shopping_cart_container > a > span")).getText();
        Assert.assertTrue(actualResult.contains("1"));

   }

   @Description("Add And Remove All Items From cart")
   @Test (priority = 2)
    public void RemoveAllItemsFromCart(){
       LoginPage.typeinUsernameField("standard_user");
       LoginPage.typeinPasswordField("secret_sauce");
       LoginPage.clickOnLoginButton();

       AddAndRemoveItemsFromCartPage.clickOnAddToCartSauceLabsBackpack();
       AddAndRemoveItemsFromCartPage.clickOnAddToCartSauceLabsBikeLight();
       AddAndRemoveItemsFromCartPage.clickOnAddToCartSauceLabsBoltTShirt();
       AddAndRemoveItemsFromCartPage.clickOnAddToCartSauceLabsOnesie();
       AddAndRemoveItemsFromCartPage.clickOnAddToCartSauceLabsFleeceJacket();
       AddAndRemoveItemsFromCartPage.clickOnAddToCartTestALlTheThingsTShirtRed();
       AddAndRemoveItemsFromCartPage.clickOnCartButton();

       AddAndRemoveItemsFromCartPage.clickOnRemoveSauceLabsBackpack();
       AddAndRemoveItemsFromCartPage.clickOnRemoveSauceLabsBikeLight();
       AddAndRemoveItemsFromCartPage.clickOnRemoveSauceLabsBoltTShirt();
       AddAndRemoveItemsFromCartPage.clickOnRemoveSauceLabsOnesie();
       AddAndRemoveItemsFromCartPage.clickOnRemoveSauceLabsFleeceJacket();
       AddAndRemoveItemsFromCartPage.clickOnRemoveTestAllTheThingsTSHirtRed();
       AddAndRemoveItemsFromCartPage.clickOnContinueShoppingButton();

       Assert.assertTrue(driver.getPageSource().contains("Products"));

   }

   @Description("Add 1 Item In Cart And Check The Cart")
   @Test (priority = 4)
    public void AddOneItemInCartAndCheckTheCart(){
       LoginPage.typeinUsernameField("standard_user");
       LoginPage.typeinPasswordField("secret_sauce");
       LoginPage.clickOnLoginButton();

       AddAndRemoveItemsFromCartPage.clickOnAddToCartSauceLabsBackpack();
       AddAndRemoveItemsFromCartPage.clickOnCartButton();

       Assert.assertTrue(driver.getPageSource().contains("Sauce Labs Backpack"));

   }
}

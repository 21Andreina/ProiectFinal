package TestCases;

import Pages.BasePage;
import Pages.LoginPage;
import Pages.SortPage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SortTests extends BasePage {
    private SortPage SortPage;
    private LoginPage LoginPage;

    ;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        SortPage = new SortPage(driver);
        LoginPage = new LoginPage(driver);
    }

    @Description("Sort Items From A To Z")
    @Test (priority = 1)
    public void clickOnSortAtoZOption() {
        LoginPage.typeinUsernameField("standard_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        SortPage.clickOnSortbutton();
        SortPage.clickOnSortAtoZOption();

        String actualResult = driver.findElement(By.cssSelector("#item_4_title_link > div")).getText();
        Assert.assertTrue(actualResult.contains("Sauce Labs Backpack"));
    }

    @Description("Sort Items From Z To A")
    @Test (priority = 2)
    public void clickOnSortZtoAOption() {

        LoginPage.typeinUsernameField("standard_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        SortPage.clickOnSortbutton();
        SortPage.clickOnSortZtoAOption();

        String actualResult = driver.findElement(By.cssSelector("#item_3_title_link > div")).getText();
        Assert.assertTrue(actualResult.contains("Test.allTheThings() T-Shirt (Red)"));
        }

    @Description("Sort Items By Price Low To High")
    @Test (priority = 3)
    public void clickOnSortLowtoHighOption(){
        LoginPage.typeinUsernameField("standard_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        SortPage.clickOnSortbutton();
        SortPage.clickOnSortLowtoHighOption();

        String actualResult = driver.findElement(By.cssSelector("#inventory_container > div > div:nth-child(1) > div.inventory_item_description > div.pricebar > div")).getText();
        Assert.assertTrue(actualResult.contains("$7.99"));

        }

        @Description("Sort Items By Price High To Low")
        @Test (priority = 4)
    public void clickOnSortHightoLowOption(){
            LoginPage.typeinUsernameField("standard_user");
            LoginPage.typeinPasswordField("secret_sauce");
            LoginPage.clickOnLoginButton();

            SortPage.clickOnSortbutton();
            SortPage.clickOnSortHightoLowOption();

            String actualResult = driver.findElement(By.cssSelector("#inventory_container > div > div:nth-child(1) > div.inventory_item_description > div.pricebar > div")).getText();
            Assert.assertTrue(actualResult.contains("$49.99"));
        }


}

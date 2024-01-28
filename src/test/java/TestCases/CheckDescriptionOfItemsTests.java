package TestCases;

import Pages.BasePage;
import Pages.CheckDescriptionOfItemsPage;
import Pages.LoginPage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckDescriptionOfItemsTests extends BasePage {
    private CheckDescriptionOfItemsPage CheckDescriptionOfItemsPage;
    private LoginPage LoginPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        CheckDescriptionOfItemsPage = new CheckDescriptionOfItemsPage(driver);
        LoginPage = new LoginPage(driver);
    }
    @Description("Check If The First Item Description Message Is The Same In Standard User")
    @Test (priority = 1)
    public void CheckDescriptionMessageInStandardUser(){
        LoginPage.typeinUsernameField("standard_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CheckDescriptionOfItemsPage.CheckDescriptionMessage();
        CheckDescriptionOfItemsPage.clickOnSauceLabsBackpack();

        String actualResult = CheckDescriptionOfItemsPage.CheckDescriptionMessageIn();
        String expectedResult = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
        Assert.assertEquals(actualResult,expectedResult, "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.");


    }
    @Description("Check If The First Item Description Message Is The Same In Error User")
    @Test (priority = 2)
    public void CheckDescriptionMessageInErrorUser(){
        LoginPage.typeinUsernameField("error_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CheckDescriptionOfItemsPage.CheckDescriptionMessage();
        CheckDescriptionOfItemsPage.clickOnSauceLabsBackpack();

        String actualResult = CheckDescriptionOfItemsPage.CheckDescriptionMessageIn();
        String expectedResult = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
        Assert.assertNotSame(actualResult,expectedResult, "A description should be here, but it failed to render! This error has been reported to Backtrace.");
    }

    @Description("Check If The First Item Description Message Is The Same In problem User")
    @Test (priority = 3)
    public void CheckDescriptionMessageInProblemUser(){
        LoginPage.typeinUsernameField("problem_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CheckDescriptionOfItemsPage.CheckDescriptionMessage();
        CheckDescriptionOfItemsPage.clickOnSauceLabsBackpack();

        String actualResult = CheckDescriptionOfItemsPage.CheckDescriptionMessageIn();
        String expectedResult = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
        Assert.assertNotSame(actualResult,expectedResult, "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.");


    }

}


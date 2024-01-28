package TestCases;

import Pages.BasePage;
import Pages.CompareTheTitlesOfItemsInProblemUserPage;
import Pages.LoginPage;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CompareTheTitlesOfItemsInProblemUserTests extends BasePage {
    private CompareTheTitlesOfItemsInProblemUserPage CompareTheTitlesOfItemsInProblemUserPage;
    private LoginPage LoginPage;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        CompareTheTitlesOfItemsInProblemUserPage = new CompareTheTitlesOfItemsInProblemUserPage(driver);
        LoginPage = new LoginPage(driver);
    }

    @Description("The Titles Of Items Not Match In Problem User")
    @Test (priority = 1)
    public void CompareTitleOfFirstItem(){
        LoginPage.typeinUsernameField("problem_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CompareTheTitlesOfItemsInProblemUserPage.clickOnSauceLabsBackpack();

        String actualResult = CompareTheTitlesOfItemsInProblemUserPage.CheckTitleMessage();
        String expectedResult = "Sauce Labs Backpack";
        Assert.assertNotEquals(actualResult,expectedResult, "Sauce Labs Fleece Jacket");
    }

    @Test (priority = 2)
    public void CompareTitleOfSecondItem(){
        LoginPage.typeinUsernameField("problem_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CompareTheTitlesOfItemsInProblemUserPage.clickOnSauceLabsBikeLight();

        String actualResult = CompareTheTitlesOfItemsInProblemUserPage.CheckTitleMessage2();
        String expectedResult = "Sauce Labs Bike Light";
        Assert.assertNotEquals(actualResult,expectedResult, "Sauce Labs Bolt T-Shirt");
    }

    @Test (priority =3)
    public void CompareTitleOfThirdItem(){
        LoginPage.typeinUsernameField("problem_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CompareTheTitlesOfItemsInProblemUserPage.clickOnSauceLabsBoltTShirt();

        String actualResult = CompareTheTitlesOfItemsInProblemUserPage.CheckTitleMessage3();
        String expectedResult = "Sauce Labs Bolt T-Shirt";
        Assert.assertNotEquals(actualResult,expectedResult, "Sauce Labs Onesie");
    }
    @Test (priority =4)
    public void CompareTitleOfFourthItem(){
        LoginPage.typeinUsernameField("problem_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CompareTheTitlesOfItemsInProblemUserPage.clickOnSauceLabsFleeceJacket();

        String actualResult = CompareTheTitlesOfItemsInProblemUserPage.CheckTitleMessage4();
        String expectedResult = "Sauce Labs Fleece Jacket";
        Assert.assertNotEquals(actualResult,expectedResult, "ITEM NOT FOUND ");
    }
    @Test (priority =5)
    public void CompareTitleOfFifthItem(){
        LoginPage.typeinUsernameField("problem_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CompareTheTitlesOfItemsInProblemUserPage.clickOnSauceLabsOnesie();

        String actualResult = CompareTheTitlesOfItemsInProblemUserPage.CheckTitleMessage5();
        String expectedResult = "Sauce Labs Onesie";
        Assert.assertNotEquals(actualResult,expectedResult, "Test.allTheThings() T-Shirt (Red)");
    }

    @Test (priority =6)
    public void CompareTitleOfSixthItem(){
        LoginPage.typeinUsernameField("problem_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        CompareTheTitlesOfItemsInProblemUserPage.clickOnTestAllTheThingsTShirtRed();

        String actualResult = CompareTheTitlesOfItemsInProblemUserPage.CheckTitleMessage6();
        String expectedResult = "Test.allTheThings() T-Shirt (Red)";
        Assert.assertNotEquals(actualResult,expectedResult, "Sauce Labs Backpack");

    }



}

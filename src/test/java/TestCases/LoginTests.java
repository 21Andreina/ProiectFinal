package TestCases;

import Pages.BasePage;
import Pages.LoginPage;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends BasePage {
    private LoginPage LoginPage;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        LoginPage = new LoginPage(driver);

    }

    @Description("Login With Standard User And Password")
    @Test (priority = 1)
    public void typeStandardUserAndPasswordInFieldsAndLogin() {
        LoginPage.typeinUsernameField("standard_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        String actualResult = driver.findElement(By.cssSelector("#inventory_container")).getText();
        Assert.assertTrue(actualResult.contains(" "));
    }

    @Description("Login with Locked Out User And Password")
    @Test (priority = 2)
    public void typeLockedOutUserAndPasswordInFieldsAndLogin() {
        LoginPage.typeinUsernameField("locked_out_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        String actualResult = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3")).getText();
        Assert.assertTrue(actualResult.contains("Epic sadface: Sorry, this user has been locked out."));
    }

    @Description("Login With Problem User And Password")
    @Test (priority = 3)
    public void typeProblemUserAndPasswordInFieldsAndLogin() {
        LoginPage.typeinUsernameField("problem_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();
        String actualResult = driver.findElement(By.cssSelector("#inventory_container")).getText();
        Assert.assertTrue(actualResult.contains(" "));
    }
    @Description("Login With Performance Glitch User And Password")
    @Test (priority = 4)
    public void typePerformanceGlitchUserAndPasswordInFieldsAndLogin() {
        LoginPage.typeinUsernameField("performance_glitch_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        String actualResult = driver.findElement(By.cssSelector("#inventory_container")).getText();
        Assert.assertTrue(actualResult.contains(" "));

        }
    @Description("Login With Error User And Password")
    @Test (priority = 5)
    public void typeErrorUserAndPasswordInFieldsAndLogin(){
        LoginPage.typeinUsernameField("error_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        String actualResult = driver.findElement(By.cssSelector("#inventory_container")).getText();
        Assert.assertTrue(actualResult.contains(" "));
        }

    @Description("Login With Visual User And Password")
    @Test (priority = 6)
    public void typeVisualUserAndPasswordInFieldsAndLogin(){
        LoginPage.typeinUsernameField("visual_user");
        LoginPage.typeinPasswordField("secret_sauce");
        LoginPage.clickOnLoginButton();

        String actualResult = driver.findElement(By.cssSelector("#inventory_container")).getText();
        Assert.assertTrue(actualResult.contains(" "));
        }

    @Description("Login With Random User And Password")
    @Test (priority = 7)
    public void typeRandomUserAndPasswordInFieldsAndLogin(){
        LoginPage.typeinUsernameField("test_user");
        LoginPage.typeinPasswordField("test123");
        LoginPage.clickOnLoginButton();

        String actualResult = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3")).getText();
        Assert.assertTrue(actualResult.contains("Epic sadface: Username and password do not match any user in this service"));
        }

}

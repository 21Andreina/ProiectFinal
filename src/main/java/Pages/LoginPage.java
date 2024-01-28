package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "user-name")
    private WebElement UsernameField;
    public void typeinUsernameField(String text){UsernameField.sendKeys(text);}

    @FindBy (id = "password")
    private WebElement PasswordField;
    public void typeinPasswordField(String text){PasswordField.sendKeys(text);}

    @FindBy (id = "login-button")
    private WebElement LoginButton;
    public void clickOnLoginButton(){LoginButton.click();}

    @FindBy  (css = "#login_button_container > div > form > div.error-message-container.error > h3")
    private WebElement ErrorMessage;
    public String getErrorMessage(){return ErrorMessage.getText();}


}

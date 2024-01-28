package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);

    }
    @FindBy (id = "add-to-cart-sauce-labs-backpack")
    private WebElement AddSauceLabsBackpackItem;
    public void clickOnAddToCartSauceLabsBackpack(){AddSauceLabsBackpackItem.click();}

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement AddSauceLabsFleeceJacket;
    public void clickOnAddToCartSauceLabsFleeceJacket(){AddSauceLabsFleeceJacket.click();}

    @FindBy (css = "#shopping_cart_container > a")
    private WebElement CartButton;
    public void clickOnCartButton(){CartButton.click();}

    @FindBy ( id = "checkout")
    private WebElement CheckoutButton;
    public void clickOnCheckoutbutton(){CheckoutButton.click();}

    @FindBy (id = "first-name")
    private WebElement FirstNameField;
    public void typeNameInFirstNameField(String text){
        FirstNameField.sendKeys(text);
    }

    @FindBy( id = "last-name")
    private WebElement LastNameField;
    public void typeLastNameInLastNameField(String text){
        LastNameField.sendKeys(text);
    }

    @FindBy( id = "postal-code" )
    private WebElement ZipPostalCodeField;
    public void typeInZipPostalCodeField(String text){
        ZipPostalCodeField.sendKeys(text);
    }
    @FindBy (id = "continue")
    private WebElement ContinueButton;
    public void clickOnContinueButton(){ContinueButton.click();}

    @FindBy(id = "finish")
    private WebElement FinishButton;
    public void clickOnFinishButton(){FinishButton.click();}

    @FindBy (id = "back-to-products")
    private WebElement BackHomeButton;
    public void clickOnBackHomeButton(){BackHomeButton.click();}

    @FindBy (id = "cancel")
    private WebElement CancelButton;
    public void clickOnCancelButton(){CancelButton.click();}








}

package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAndRemoveItemsFromCartPage extends BasePage {
    public AddAndRemoveItemsFromCartPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy (css = "#shopping_cart_container > a")
    private WebElement CartButton;
    public void clickOnCartButton(){CartButton.click();}

    @FindBy (id = "add-to-cart-sauce-labs-backpack")
    private WebElement AddSauceLabsBackpackItem;
    public void clickOnAddToCartSauceLabsBackpack(){AddSauceLabsBackpackItem.click();}

    @FindBy (id = "add-to-cart-sauce-labs-bike-light")
    private WebElement AddSauceLabsBikeLightItem;
    public void clickOnAddToCartSauceLabsBikeLight(){AddSauceLabsBikeLightItem.click();}

    @FindBy (id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement AddSauceLabsBoltTShirt;
    public void clickOnAddToCartSauceLabsBoltTShirt(){AddSauceLabsBoltTShirt.click();}

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement AddSauceLabsFleeceJacket;
    public void clickOnAddToCartSauceLabsFleeceJacket(){AddSauceLabsFleeceJacket.click();}

    @FindBy (id = "add-to-cart-sauce-labs-onesie")
    private WebElement AddSauceLabsOnesie;
    public void clickOnAddToCartSauceLabsOnesie(){AddSauceLabsOnesie.click();}

    @FindBy (css = "#add-to-cart-test\\.allthethings\\(\\)-t-shirt-\\(red\\)")
    private WebElement AddTestAllTheThingsTShirtRed;
    public void clickOnAddToCartTestALlTheThingsTShirtRed(){AddTestAllTheThingsTShirtRed.click();}

    @FindBy (id = "remove-sauce-labs-bike-light")
    private WebElement RemoveSauceLabsBikeLight;
    public void clickOnRemoveSauceLabsBikeLight(){RemoveSauceLabsBikeLight.click();}

    @FindBy( css = "#remove-sauce-labs-backpack")
    private WebElement RemoveSauceLabsBackpack;
    public void clickOnRemoveSauceLabsBackpack(){RemoveSauceLabsBackpack.click();}

    @FindBy ( css = "#remove-sauce-labs-bolt-t-shirt")
    private WebElement RemoveSauceLabsBoltTShirt;
    public void clickOnRemoveSauceLabsBoltTShirt(){RemoveSauceLabsBoltTShirt.click();}
     @FindBy (css = "#remove-sauce-labs-fleece-jacket")
     private WebElement RemoveSauceLabsFleeceJacket;
    public void clickOnRemoveSauceLabsFleeceJacket(){RemoveSauceLabsFleeceJacket.click();}

    @FindBy (css = "#remove-sauce-labs-onesie")
    private WebElement RemoveSauceLabsOnesie;
    public void clickOnRemoveSauceLabsOnesie(){RemoveSauceLabsOnesie.click();}

    @FindBy (css = "#remove-test\\.allthethings\\(\\)-t-shirt-\\(red\\)")
    private WebElement RemoveTestAllTheThingsTSHirtRed;
    public void clickOnRemoveTestAllTheThingsTSHirtRed(){RemoveTestAllTheThingsTSHirtRed.click();}

    @FindBy (id = "continue-shopping")
    private WebElement ContinueShoppingButton;
    public void clickOnContinueShoppingButton(){ContinueShoppingButton.click();}

}

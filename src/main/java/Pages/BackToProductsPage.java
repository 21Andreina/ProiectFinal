package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackToProductsPage extends BasePage{
    public BackToProductsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy (css = "#item_4_title_link > div")
    private WebElement SauceLabsBackpack;
    public void clickOnSauceLabsBackpack(){SauceLabsBackpack.click();}

    @FindBy( id = "back-to-products")
    private WebElement BackToProductsButton;
    public void clickOnBackToProductsButton(){BackToProductsButton.click();}




}

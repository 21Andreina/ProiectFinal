package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckDescriptionOfItemsPage extends BasePage{
    public CheckDescriptionOfItemsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }



    @FindBy(css = "#inventory_container > div > div:nth-child(1) > div.inventory_item_description > div.inventory_item_label > div")
    private WebElement DescriptionMessage;
    public String CheckDescriptionMessage(){
        return DescriptionMessage.getText();
    }

    @FindBy (css = "#item_4_title_link > div")
    private WebElement SauceLabsBackpack;
    public void clickOnSauceLabsBackpack(){SauceLabsBackpack.click();}

    @FindBy ( css = "#inventory_item_container > div > div > div.inventory_details_desc_container > div.inventory_details_desc.large_size")
    private WebElement DescriptionMessageIn;
    public String CheckDescriptionMessageIn(){
        return DescriptionMessageIn.getText();
    }


}

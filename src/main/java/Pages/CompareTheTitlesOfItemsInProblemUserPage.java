package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompareTheTitlesOfItemsInProblemUserPage extends BasePage{
    public CompareTheTitlesOfItemsInProblemUserPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy (css = "#item_4_title_link > div")
    private WebElement SauceLabsBackpack;
    public void clickOnSauceLabsBackpack(){SauceLabsBackpack.click();}

    @FindBy (css = "#item_0_title_link > div")
    private WebElement SauceLabsBikeLight;
    public void clickOnSauceLabsBikeLight(){SauceLabsBikeLight.click();}

    @FindBy (css = "#item_1_title_link > div")
    private WebElement SauceLabsBoltTShirt;
    public void clickOnSauceLabsBoltTShirt(){SauceLabsBoltTShirt.click();}

    @FindBy( css = "#item_5_title_link > div")
    private WebElement SauceLabsFleeceJacket;
    public void clickOnSauceLabsFleeceJacket(){SauceLabsFleeceJacket.click();}

    @FindBy (css = "#item_2_title_link > div")
    private WebElement SauceLabsOnesie;
    public void clickOnSauceLabsOnesie(){SauceLabsOnesie.click();}

    @FindBy (css = "#item_3_title_link > div")
    private WebElement TestAllTheThingsTShirtRed;
    public void clickOnTestAllTheThingsTShirtRed(){TestAllTheThingsTShirtRed.click();
    }

    @FindBy (css = "#inventory_item_container > div > div > div.inventory_details_desc_container > div.inventory_details_name.large_size")
    private WebElement SauceLabsFleeceJacketMessage;
    public String CheckTitleMessage(){
        return SauceLabsFleeceJacketMessage.getText();
    }

    @FindBy (css = "#inventory_item_container > div > div > div.inventory_details_desc_container > div.inventory_details_name.large_size")
    private WebElement SauceLabsBoltTShirtMessage;
    public String CheckTitleMessage2(){
        return SauceLabsBoltTShirtMessage.getText();
    }

    @FindBy (css = "#inventory_item_container > div > div > div.inventory_details_desc_container > div.inventory_details_name.large_size")
    private WebElement SauceLabsOnesieMessage;
    public String CheckTitleMessage3(){
        return SauceLabsOnesieMessage.getText();
    }

    @FindBy (css = "#inventory_item_container > div > div > div.inventory_details_desc_container > div.inventory_details_name.large_size")
    private WebElement ItemNotFoundMessage;
    public String CheckTitleMessage4(){
        return ItemNotFoundMessage.getText();
    }

    @FindBy (css = "#inventory_item_container > div > div > div.inventory_details_desc_container > div.inventory_details_name.large_size")
    private WebElement TestAllTheThingsTShirtRedMessage;
    public String CheckTitleMessage5(){
        return TestAllTheThingsTShirtRedMessage.getText();
    }

    @FindBy (css = "#inventory_item_container > div > div > div.inventory_details_desc_container > div.inventory_details_name.large_size")
    private WebElement SauceLabsBackpackMessage;
    public String CheckTitleMessage6(){
        return SauceLabsBackpackMessage.getText();
    }
}

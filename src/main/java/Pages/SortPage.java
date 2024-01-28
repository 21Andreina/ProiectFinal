package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortPage extends BasePage{
     public SortPage (WebDriver driver) {
         super(driver);
         PageFactory.initElements(driver,this);
     }

     @FindBy (css = "#header_container > div.header_secondary_container > div > span > select")
    private WebElement SortButton;
    public void clickOnSortbutton(){SortButton.click();}


    @FindBy (css = ".product_sort_container>option:nth-child(1)")
    private WebElement SortAtoZOption;
    public void clickOnSortAtoZOption(){SortAtoZOption.click();}

    @FindBy (css = "#header_container > div.header_secondary_container > div > span > select > option:nth-child(2)")
    private WebElement SortZtoAOption;
    public void clickOnSortZtoAOption(){SortZtoAOption.click();}

    @FindBy(css = ".product_sort_container>option:nth-child(3)")
    private WebElement SortLowtoHighOption;
    public void clickOnSortLowtoHighOption(){SortLowtoHighOption.click();}

    @FindBy (css = ".product_sort_container>option:nth-child(4)")
    private WebElement SortHightoLowOption;
    public void clickOnSortHightoLowOption(){SortHightoLowOption.click();}


}

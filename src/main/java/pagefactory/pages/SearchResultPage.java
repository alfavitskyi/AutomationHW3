package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pageobject.pages.BasePage;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//a[@class='btn-see-more js_show_more']")
    private WebElement showMoreButton;

    @FindBy(xpath = "//label[contains(text(),'Пилососи')]")
    private WebElement filterByVacuumCleaner;

    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> searchResultsProductListText;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSearchResultList(){
        return searchResultsProductListText;
    }

    public int getSearchResultListCount (){
        return  getSearchResultList().size();
    }

    public void setFilterByVacuumCleaner (){
        filterByVacuumCleaner.click();
    }

    public void clickOnMoreButton (){
        showMoreButton.click();

    }
}

package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class SearchResultPage extends BasePage {
    private static final String SEARCH_RESULTS_PRODUCTS_LIST_TEXT = "//div[@class='prod-cart__descr']";
    private static final String FILTER_BY_VACUUM_CLEANER = "//label[contains(text(),'Пилососи')]";
    private static final String SHOW_MORE_BUTTON = "//a[@class='btn-see-more js_show_more']";

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSearchResultList(){
        return driver.findElements(xpath(SEARCH_RESULTS_PRODUCTS_LIST_TEXT));
    }

    public int getSearchResultListCount (){
        return  getSearchResultList().size();
    }

    public void setFilterByVacuumCleaner (){
        driver.findElement(xpath(FILTER_BY_VACUUM_CLEANER)).click();
    }

    public void clickOnMoreButton (){
        WebElement element = driver.findElement(xpath(SHOW_MORE_BUTTON));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
        driver.findElement(xpath(SHOW_MORE_BUTTON)).click();

    }
}

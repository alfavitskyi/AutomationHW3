package pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class TvAndAccessoriesPage extends BasePage {
    private static final String TV_AND_ACCESSORIES_BUTTON = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'televizory-i-aksessuary1')]";
    private static final String TV_BUTTON = "//div[@class='brand-box__title']/a[contains(@href,'televizoryi')]";
    private static final String FIELD_MIN_AMOUNT_IN_FILTER = "//input[@class='form-control form-control-min']";
    private static final String FIELD_MAX_AMOUNT_IN_FILTER = "//input[@class='form-control form-control-max']";
    private static final String PRODUCT_LIST = "//div[@class='prod-cart__prise-new']";
    private static final String SHOW_FILTERED_PRODUCTS = "//div[@class='form-group filter-group js_filter_parent open-filter-tooltip']//*/span[@class='filter-tooltip-inner']";

    public TvAndAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnTvAndAccessoriesButton (){driver.findElement(xpath(TV_AND_ACCESSORIES_BUTTON)).click();}

    public void clickOnTvButton (){driver.findElement(xpath(TV_BUTTON)).click();}

    public void setMinAmountInFilter (String amount){driver.findElement(xpath(FIELD_MIN_AMOUNT_IN_FILTER)).sendKeys(amount);}

    public void setMaxAmountInFilter (String amount){driver.findElement(xpath(FIELD_MAX_AMOUNT_IN_FILTER)).sendKeys(amount);}

    public List<WebElement> webElementList (){
        return driver.findElements(xpath(PRODUCT_LIST));
    }

    public void showFilteredProducts (){driver.findElement(xpath(SHOW_FILTERED_PRODUCTS)).click();}
}

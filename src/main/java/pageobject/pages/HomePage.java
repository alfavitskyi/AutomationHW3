package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.xpath;

public class HomePage extends BasePage {

    private static final String SEARCH_INPUT = "//input[@id='input_search']";
    private static final String SEARCH_BUTTON = "//button[@class='button-reset search-btn']";
    private static final String PRODUCT_CATALOG_BUTTON = "//span[@class='sidebar-item']";
    private static final String PRODUCTS_IN_CART = "//div[contains(@class,'header-bottom__cart')]//div[contains(@class,'cart_count')]";
    private static final String GADGET_STORE_BUTTON = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'gadzhetyi1')]";
    private static final String KEEP_PURCHASING_FROM_CART = "//div[@class='btns-cart-holder']//a[contains(@class,'btn--orange')]";
    private static final String OPEN_CART = "//div[@class='header-bottom__cart active-cart flex-wrap middle-xs js-btn-open']//div[contains(@class,'active-cart-item js_cart_count')]";
    private static final String PLUS_ONE_PRODUCT_IN_CART = "//span[@class='js_plus btn-count btn-count--plus ']";
    private static final int TIME_OUT = 10;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        driver.findElement(xpath(SEARCH_INPUT)).sendKeys(keyword);
        clickByElement(xpath(SEARCH_BUTTON));
    }

    public void clickOnProductCatalogButton() {
        clickByElement(xpath(PRODUCT_CATALOG_BUTTON));
    }

    public void clickOnGadgetStoreButton() {
        clickByElement(xpath(GADGET_STORE_BUTTON));
    }

    public String getAmountOfProductsInCart() {
        return getTextFromElement(xpath(PRODUCTS_IN_CART));
    }

    public void clickOnKeepPurchasing() {
        clickByElement(xpath(KEEP_PURCHASING_FROM_CART));
    }

    public void clickOnCartButton() {
        clickByElement(xpath(OPEN_CART));
    }

    public void addOneMoreProductInCart() {
        clickByElement(xpath(PLUS_ONE_PRODUCT_IN_CART));
    }

    public String getNumberOfGoodsInCart() {
        return getTextFromElement(xpath(PRODUCTS_IN_CART));
    }

    public String getTextFromElement(By locator) {
        return new WebDriverWait(driver, TIME_OUT)
                .until(ExpectedConditions.presenceOfElementLocated(locator)).getText();
    }

    public void clickByElement(By locator) {
        new WebDriverWait(driver, TIME_OUT)
                .until(ExpectedConditions.presenceOfElementLocated(locator)).click();
    }

}

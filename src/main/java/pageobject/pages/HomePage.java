package pageobject.pages;

import org.openqa.selenium.WebDriver;

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


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword (final String keyword){
        driver.findElement(xpath(SEARCH_INPUT)).sendKeys(keyword);
        driver.findElement(xpath(SEARCH_BUTTON)).click();
    }

    public void clickOnProductCatalogButton (){
        driver.findElement(xpath(PRODUCT_CATALOG_BUTTON)).click();
    }

    public void clickOnGadgetStoreButton (){
        driver.findElement(xpath(GADGET_STORE_BUTTON)).click();
    }

    public String getAmountOfProductsInCart (){return driver.findElement(xpath(PRODUCTS_IN_CART)).getText();}

    public void clickOnKeepPurchasing (){driver.findElement(xpath(KEEP_PURCHASING_FROM_CART)).click();}

    public void clickOnCartButton (){driver.findElement(xpath(OPEN_CART)).click();}

    public void addOneMoreProductInCart (){driver.findElement(xpath(PLUS_ONE_PRODUCT_IN_CART)).click();}

    public String getNumberOfGoodsInCart(){return driver.findElement(xpath(PRODUCTS_IN_CART)).getText();}
}

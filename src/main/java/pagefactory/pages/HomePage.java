package pagefactory.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.pages.BasePage;


public class HomePage extends BasePage {



    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@id='input_search']")
    private WebElement searchInput;

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement productCatalogButton;

    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'gadzhetyi1')]")
    private WebElement gadgetStoreButton;

    @FindBy(xpath = "//div[contains(@class,'header-bottom__cart')]//div[contains(@class,'cart_count')]")
    private WebElement productsInCart;

    @FindBy(xpath = "//button[@class='button-reset search-btn']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@class='btns-cart-holder']//a[contains(@class,'btn--orange')]")
    private WebElement keepPurchasingFromCart;

    @FindBy(xpath = "//div[@class='header-bottom__cart active-cart flex-wrap middle-xs js-btn-open']//div[contains(@class,'active-cart-item js_cart_count')]")
    private WebElement openCart;

    @FindBy(xpath = "//span[@class='js_plus btn-count btn-count--plus ']")
    private WebElement plusOneProductInCart;


    public void searchByKeyword(final String keyword) {
       searchInput.sendKeys(keyword);
        searchButton.click();
    }

    public void clickOnProductCatalogButton() {
        productCatalogButton.click();
    }

    public void clickOnGadgetStoreButton() {
        gadgetStoreButton.click();
    }

    public String getAmountOfProductsInCart() {
        return getTextFromElement();
    }

    public void clickOnKeepPurchasing() {
        keepPurchasingFromCart.click();
    }

    public void clickOnCartButton() {
        openCart.click();
    }

    public void addOneMoreProductInCart() {
        plusOneProductInCart.click();
    }

    public String getNumberOfGoodsInCart() {
        return productsInCart.getText();
    }

    public String getTextFromElement() {
        return productsInCart.getText();
    }

}

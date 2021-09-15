package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobject.pages.BasePage;

import java.util.List;


public class TvAndAccessoriesPage extends BasePage {


    @FindBy(xpath = "//ul[contains(@class,'sidebar-list')]//a[contains(@href, 'televizory-i-aksessuary1')]")
    private WebElement tvAndAccessoriesButton;

    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(@href,'televizoryi')]")
    private WebElement tvButton;

    @FindBy(xpath = "//input[@class='form-control form-control-min']")
    private WebElement fieldMinAmountInFilter;

    @FindBy(xpath = "//input[@class='form-control form-control-max']")
    private WebElement fieldMaxAmountInFilter;

    @FindBy(xpath = "//div[@class='form-group filter-group js_filter_parent open-filter-tooltip']//*/span[@class='filter-tooltip-inner']")
    private WebElement filteredProducts;

    @FindBy(xpath = "//div[@class='prod-cart__prise-new']")
    private List<WebElement> productList;

    public TvAndAccessoriesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnTvAndAccessoriesButton (){
        tvAndAccessoriesButton.click();}

    public void clickOnTvButton (){
        tvButton.click();}

    public void setMinAmountInFilter (String amount){
        fieldMinAmountInFilter.sendKeys(amount);}

    public void setMaxAmountInFilter (String amount){
        fieldMaxAmountInFilter.sendKeys(amount);}

    public List<WebElement> webElementList (){
        return productList;
    }

    public void showFilteredProducts (){
        filteredProducts.click();}
}


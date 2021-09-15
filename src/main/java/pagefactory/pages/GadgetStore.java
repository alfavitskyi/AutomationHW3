package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobject.pages.BasePage;

import static org.openqa.selenium.By.xpath;

public class GadgetStore extends BasePage {

    @FindBy(xpath = "//div[@class='brand-box__title']/a[contains(@href,'smart-chasyi')]")
    private WebElement smartClocks;

    @FindBy(xpath = "//a[@class='prod-cart__buy'][contains(@data-ecomm-cart,'SM-R890NZKA')]")
    private WebElement exactSmartClock;
    public GadgetStore(WebDriver driver) {
        super(driver);
    }

    public void clickOnExactSmartClock(){
        exactSmartClock.click();}

    public void clickOnSmartClocks (){
        smartClocks.click();}

}

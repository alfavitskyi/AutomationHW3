package pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.xpath;

public class GadgetStore extends BasePage{
    private static final String SMART_CLOCKS = "//div[@class='brand-box__title']/a[contains(@href,'smart-chasyi')]";
    private static final String FIND_EXACT_CLOCK = "//a[@class='prod-cart__buy'][contains(@data-ecomm-cart,'SM-R890NZKA')]";


    public GadgetStore(WebDriver driver) {
        super(driver);
    }

    public void clickOnExactSmartClock(){driver.findElement(xpath(FIND_EXACT_CLOCK)).click();}

    public void clickOnSmartClocks (){driver.findElement(xpath(SMART_CLOCKS)).click();}

}

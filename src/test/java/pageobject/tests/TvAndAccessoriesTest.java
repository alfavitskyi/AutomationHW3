package pageobject.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class TvAndAccessoriesTest extends BaseTest {
    private String MIN_AMOUNT_FOR_FILTERING = "10000";
    private String MAX_AMOUNT_FOR_FILTERING = "20000";

    @Test
    public void checkFilterByAmount() {
        getHomePage().clickOnProductCatalogButton();
        getHomePage().implicitWait(5);
        getTvAndAccessoriesPage().clickOnTvAndAccessoriesButton();
        getHomePage().implicitWait(5);
        getTvAndAccessoriesPage().clickOnTvButton();
        getHomePage().implicitWait(5);
        getTvAndAccessoriesPage().setMinAmountInFilter(MIN_AMOUNT_FOR_FILTERING);
        getTvAndAccessoriesPage().setMaxAmountInFilter(MAX_AMOUNT_FOR_FILTERING);
        getTvAndAccessoriesPage().showFilteredProducts();
        List<WebElement> webElements = getTvAndAccessoriesPage().webElementList();
        for (WebElement webElement : webElements) {
            String[] fullPrice = webElement.getText().split(" ");
            String onlyPrice = fullPrice[0];
            int price = Integer.parseInt(onlyPrice);
            assertTrue(price > 10000);
        }
    }
}

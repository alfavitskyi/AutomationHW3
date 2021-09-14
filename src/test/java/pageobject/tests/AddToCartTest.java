package pageobject.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTest extends BaseTest {
    private String EXPECTED_GOODS_IN_CART = "2";

    @Test
    public void checkAddGoodsToCart (){
        getHomePage().clickOnProductCatalogButton();
        getHomePage().implicitWait(10);
        getHomePage().clickOnGadgetStoreButton();
        getHomePage().implicitWait(5);
        getGadgetStore().clickOnSmartClocks();
        getHomePage().implicitWait(5);
        getGadgetStore().clickOnExactSmartClock();
        getHomePage().implicitWait(5);
        getHomePage().clickOnKeepPurchasing();
        getHomePage().implicitWait(3);
        getHomePage().clickOnCartButton();
        getHomePage().implicitWait(3);
        getHomePage().addOneMoreProductInCart();
        getHomePage().implicitWait(5);
        assertEquals(getHomePage().getNumberOfGoodsInCart(),EXPECTED_GOODS_IN_CART);
    }
}

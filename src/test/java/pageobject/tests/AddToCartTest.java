package pageobject.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTest extends BaseTest {
    private String EXPECTED_GOODS_IN_CART = "2";

    @Test
    public void checkAddGoodsToCart (){
        getHomePage().clickOnProductCatalogButton();
        getHomePage().clickOnGadgetStoreButton();
        getGadgetStore().clickOnSmartClocks();
        getGadgetStore().clickOnExactSmartClock();
        getHomePage().clickOnKeepPurchasing();
        getHomePage().clickOnCartButton();
        getHomePage().addOneMoreProductInCart();
        assertEquals(getHomePage().getNumberOfGoodsInCart(),EXPECTED_GOODS_IN_CART);
    }
}

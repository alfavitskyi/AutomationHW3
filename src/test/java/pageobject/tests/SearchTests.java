package pageobject.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {
    private String SEARCH_KEYWORD = "Xiaomi Mi Robot";
    private String EXPECTED_SEARCH_QUERY = "query=Xiaomi";
    private int EXPECTED_NUMBER_OF_GOODS = 24;

    @Test(priority = 1)
    public void checkThatUrlContainsSearchWord(){
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));
    }

    @Test(priority = 2)
    public void checkNumberOfElementsOnPage() throws InterruptedException {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getSearchResultPage().setFilterByVacuumCleaner();
        getSearchResultPage().clickOnMoreButton();
        Thread.sleep(5000);
        assertEquals(getSearchResultPage().getSearchResultListCount(),EXPECTED_NUMBER_OF_GOODS);
    }


}

package pagefactory.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pageobject.pages.GadgetStore;
import pageobject.pages.HomePage;
import pageobject.pages.SearchResultPage;
import pageobject.pages.TvAndAccessoriesPage;

import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    private WebDriver driver;
    private static final String AVIC_URL = "https://avic.ua/ua";

    @BeforeTest
    public void profileSetUp() {
        chromedriver().setup();
    }
    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }
    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SearchResultPage getSearchResultPage() {
        return new SearchResultPage(getDriver());
    }

    public GadgetStore getGadgetStore() {
        return new GadgetStore(getDriver());
    }

    public TvAndAccessoriesPage getTvAndAccessoriesPage() {
        return new TvAndAccessoriesPage(getDriver());
    }
}


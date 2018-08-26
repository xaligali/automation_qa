import org.junit.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.openqa.selenium.WebDriver;
import static java.util.concurrent.TimeUnit.SECONDS;
import java.util.List;
import pages.MainPage;
import pages.PumpPage;
import pages.SearchResultsPage;


public class SearchTest {

    private static WebDriver driver;

    @Before
    public void setup() {
        driver = Driver.getChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
    }

    //проверяем что описание выбранного товара входит в список описания всех товаров
    @Test
    public void shouldTestSearchResults() {
        String text = "pumps";
        MainPage mainpage = new MainPage(driver);
        mainpage.open();
        mainpage.searchForText(text);

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.click_pump();
        PumpPage pumpPage = new PumpPage(driver);

        List<String> list_description = searchResultsPage.getSearchResultDescription();
        assertThat(list_description
                .stream()
                .allMatch(item -> item.contains(pumpPage.description())), is(true));

    }

    //проверяем, что товар добавился в корзину
    @Test
    public void add_to_cart() {
        String text = "pumps";
        MainPage mainpage = new MainPage(driver);
        mainpage.open();
        mainpage.searchForText(text);

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.click_pump();

        PumpPage pumpPage = new PumpPage(driver);
        pumpPage.add_cart();
        Assert.assertEquals("Added to Cart", pumpPage.test_add_cart());

    }

    @AfterClass
    public static void quit() {
        driver.manage().timeouts().implicitlyWait(2, SECONDS);//чтоб успеть посмотреть результат
        driver.close();
    }

}

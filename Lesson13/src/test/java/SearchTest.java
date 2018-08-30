import com.codeborne.selenide.Configuration;
import org.junit.*;
import pages.MainPage;
import pages.PumpPage;
import pages.SearchResultsPage;


public class SearchTest {

    SearchResultsPage searchResultsPage;
    PumpPage pumpPage;

    @BeforeClass
    public static void setup(){
        Configuration.browser ="chrome";
        Configuration.baseUrl = "https://www.amazon.com/";
    }

    //проверяем что описание выбранного товара входит в список описания всех товаров
    @Test
    public void shouldTestSearchResults() {
        String text = "pumps";
        MainPage mainpage = new MainPage();
        mainpage.openPage();
        searchResultsPage = mainpage.searchForText(text);
        pumpPage = searchResultsPage.click_pump();
        searchResultsPage
                .getSearchResultDescription(pumpPage.description());
    }

    //проверяем, что товар добавился в корзину
    @Test
    public void add_to_cart() {
        String text = "pumps";
        MainPage mainpage = new MainPage();
        mainpage.openPage();

        searchResultsPage = mainpage.searchForText(text);
        pumpPage = searchResultsPage.click_pump();
        pumpPage.add_cart();
        Assert.assertEquals("Added to Cart", pumpPage.test_add_cart());

    }


}

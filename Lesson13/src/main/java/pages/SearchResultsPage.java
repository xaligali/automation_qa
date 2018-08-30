package pages;

import org.junit.jupiter.api.Assertions;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {

    String css_pump = "#result_1 > div";
    String css_description_prod = "div > div.a-row.a-spacing-none.s-color-subdued > div.a-row.a-spacing-micro > a > h2";


    //получаем список описания товаров
    public SearchResultsPage getSearchResultDescription(String text){
        List<String> list_result = $$(css_description_prod).texts();
        Assertions.assertTrue(list_result
                .stream()
                .allMatch(item -> item.toLowerCase().contains(text.toLowerCase())));
        return this;
    }

    public PumpPage click_pump() {
        $(css_pump).click();
        return new PumpPage();
    }
}

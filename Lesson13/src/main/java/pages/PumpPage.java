package pages;

import static com.codeborne.selenide.Selenide.$;

public class PumpPage {

    String css_button_cart = "#submit\\2e add-to-cart";
    String css_add_cart = "#huc-v2-order-row-confirm-text > h1";
    String css_description= "#productTitle";

    public void add_cart() {
        $(css_button_cart).click();
    }

    public String test_add_cart() {
        return $(css_add_cart).getText();
    }

    public String description() {
        return $(css_description).getText();
    }

}

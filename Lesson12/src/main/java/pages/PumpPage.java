package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PumpPage {

    private WebDriver driver;
    String css_button_cart = "#submit\\2e add-to-cart";
    String css_add_cart = "#huc-v2-order-row-confirm-text > h1";
    String css_description= "#productTitle";

    public PumpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void add_cart() {
        WebElement button_cart = driver.findElement(By.cssSelector(css_button_cart));
        button_cart.click();
    }

    public String test_add_cart() {
        WebElement add_to_cart = driver.findElement(By.cssSelector(css_add_cart));
        return add_to_cart.getText();
    }

    public String description() {
        WebElement desc = driver.findElement(By.cssSelector(css_description));
        return desc.getText();
    }

}

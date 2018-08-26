package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResultsPage {

    private WebDriver driver;
    String css_pump = "#result_1 > div";
    String css_description_prod = "div > div.a-row.a-spacing-none.s-color-subdued > div.a-row.a-spacing-micro > a > h2";

    public SearchResultsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //получаем список описания товаров
    public List getSearchResultDescription(){
        List<WebElement> list_result = driver.findElements(By.cssSelector(css_description_prod));
        return list_result
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public void click_pump() {
        WebElement pump = driver.findElement(By.cssSelector(css_pump));
        Actions builder = new Actions(driver);
        builder.click(pump).build().perform();
        /*builder.moveToElement("тут элемент на который наводим").
                click("тут элемент по которому кликаем");
        Action mouseoverAndClick = builder.build();
        mouseoverAndClick.perform();*/
    }
}

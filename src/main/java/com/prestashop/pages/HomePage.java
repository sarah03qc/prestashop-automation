package com.prestashop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage { // pagina de inicio

    private static final String URL = "https://demo.prestashop.com/#/en/front";

    private final By searchBox = By.cssSelector("#search_widget input.ui-autocomplete-input");
    private final By artLink = By.cssSelector("#category-9 > a"); 
    private final By contactUsLink = By.cssSelector("#contact-link > a");

    public HomePage open() {
        driver.get(URL);
        new WebDriverWait(driver, Duration.ofSeconds(18))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("framelive"));
        $(searchBox);
        return this;
    }

    public SearchResultsPage search(String term) {
        WebElement box = driver.findElement(searchBox);
        box.clear();
        box.sendKeys(term + Keys.ENTER);
        return new SearchResultsPage();
    }

    public CategoryPage goToArtCategory() {
        click(artLink);
        return new CategoryPage();
    }

    public ContactPage goToContactUs() {
        click(contactUsLink);
        return new ContactPage();
    }

    public boolean isSearchVisible() { return driver.findElement(searchBox).isDisplayed(); }
}

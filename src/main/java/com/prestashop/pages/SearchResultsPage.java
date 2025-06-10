package com.prestashop.pages;

import org.openqa.selenium.*;
import java.util.List;

public class SearchResultsPage extends BasePage {

    private final By firstResultLink = By.cssSelector(".products article.product-miniature:first-of-type a.thumbnail");

    private final By resultItems = By.cssSelector(".products article.product-miniature"); // selector para los items de resultados de busqueda

    public boolean hasResults() {
        List<?> items = driver.findElements(resultItems);
        return !items.isEmpty();
    }
}

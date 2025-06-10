package com.prestashop.pages;

import org.openqa.selenium.By;

public class CategoryPage extends BasePage { // pagina de categoria

    private final By categoryTitle = By.cssSelector("#js-product-list-header > div > h1");

    public String getTitle() { return text(categoryTitle).trim(); }
}

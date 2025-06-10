package com.prestashop.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public abstract class BasePage { // clase base para todas las paginas

    protected static WebDriver driver;
    private static final Duration TIMEOUT = Duration.ofSeconds(20);

    public static void initDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new org.openqa.selenium.chrome.ChromeDriver();
            driver.manage().window().maximize();
        }
    }

    public static void quit() {
        if (driver != null) driver.quit();
        driver = null;
    }

    protected WebElement $(By locator) {
        return new WebDriverWait(driver, TIMEOUT)
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    protected void click(By locator) { $(locator).click(); }
    protected void type(By locator, String txt) { WebElement e = $(locator); e.clear(); e.sendKeys(txt); }
    protected String text(By locator) { return $(locator).getText(); }
}

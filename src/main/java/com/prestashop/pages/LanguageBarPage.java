package com.prestashop.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class LanguageBarPage extends BasePage { // pagina de la barra de idiomas

    private final By langToggle = By.cssSelector("#_desktop_language_selector button.hidden-sm-down"); // boton para abrir el menu de idiomas

    private final By frenchOpt = By.cssSelector("a.dropdown-item[data-iso-code='fr']"); // opcion para cambiar a frances

    private final By toggleLabel = By.cssSelector("#_desktop_language_selector button span.expand-more"); // etiqueta que muestra el idioma actual

    public LanguageBarPage switchToFrench() {

        click(langToggle);          // abre el menu
        click(frenchOpt);           // hace clic en “Français”

        driver.switchTo().defaultContent(); // salir del iframe actual

        new WebDriverWait(driver, Duration.ofSeconds(60))
            .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("framelive")); // volver al iframe principal
        new WebDriverWait(driver, Duration.ofSeconds(40))
            .until(ExpectedConditions.textToBe(toggleLabel, "Français")); // espera a que el idioma cambie a francés
        return this;
    }

    public boolean isFrench() {
        return "Français".equals(text(toggleLabel));
    }
}

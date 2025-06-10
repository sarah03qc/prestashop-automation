package com.prestashop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ContactPage extends BasePage { // pagina de contacto

    // encabezado “Store information”
    private final By storeInfoHeading =
            By.cssSelector("#left-column > div.contact-rich > h4");

    public boolean hasStoreInformation() { // revisa si el encabezado “Store information” esta visible

        // espera hasta 15seg a que aparezca
        new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOfElementLocated(storeInfoHeading));

        String heading = text(storeInfoHeading).trim();
        System.out.println("Texto heading: «" + heading + "»");
        return heading.equalsIgnoreCase("Store information");
    }
}

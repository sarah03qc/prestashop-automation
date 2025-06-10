package com.prestashop.tests;

import com.prestashop.pages.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactUsTest extends BaseTest {

    @Test void contact_us_page_shows_store_information() { // revisamos que la pagina de contacto se abre y muestra el bloque 'Store information'
        ContactPage contact = new HomePage()
                                  .open()
                                  .goToContactUs();

        assertTrue(contact.hasStoreInformation(),
                   "No se encontro el bloque 'Store information' en la pagina de contacto");
    }
}

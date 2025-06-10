package com.prestashop.tests;

import com.prestashop.pages.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MenuNavigationTest extends BaseTest {

    @Test void clicking_art_category_loads_art_page() { // revisamos que al hacer click en la categoria ART se carga la pagina de ART
        CategoryPage artPage = new HomePage()
                                  .open()
                                  .goToArtCategory();

        assertEquals("ART", artPage.getTitle(),
                     "No se cargo la pagina de la categoria ART");
    }
}

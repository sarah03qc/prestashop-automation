package com.prestashop.tests;

import com.prestashop.pages.HomePage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HomePageTest extends BaseTest {

    @Test void home_loads_and_searchbox_visible() { 
        // revisamos que la página de inicio se carga y el campo de busqueda es visible
        assertTrue(new HomePage().open().isSearchVisible(),
                   "El campo de busqueda no se mostro en la Home");
    }
}

package com.prestashop.tests;

import com.prestashop.pages.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchTest extends BaseTest {

    @Test void search_returns_results_for_sweater() { // revisamos que la busqueda de 'sweater' devuelve resultados
        SearchResultsPage results =
                new HomePage()
                        .open()
                        .search("sweater");

        assertTrue(results.hasResults(), "La busqueda de 'sweater' no devolvio resultados");
    }
}

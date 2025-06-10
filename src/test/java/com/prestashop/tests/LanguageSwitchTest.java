package com.prestashop.tests;

import com.prestashop.pages.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LanguageSwitchTest extends BaseTest {

    @Test void user_can_switch_to_french() { // revisamos que el usuario puede cambiar a frances
        new HomePage().open();
        boolean french = new LanguageBarPage()
                             .switchToFrench()
                             .isFrench();

        assertTrue(french, "La URL no cambio a /fr/");
    }
}

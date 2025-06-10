package com.prestashop.tests;

import com.prestashop.pages.BasePage;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BaseTest { // esta clase base inicializa y cierra el driver de Selenium para todas las pruebas

    @BeforeAll void setup()  { BasePage.initDriver(); }
    @AfterAll  void teardown(){ BasePage.quit(); }
}

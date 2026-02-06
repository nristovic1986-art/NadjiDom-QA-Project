package tests.negativeTests;

import base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.CreateAdPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NegativeCreateAdTest extends BaseTest {

    @BeforeEach
    void openNegativeCreateAdTest() {
        driver.get("https://test-php-56.volvox.rs/nadjidom/test/");

    }

    @Test
    void negativeCreateAdTest() {
        CreateAdPage createAdPage = new CreateAdPage(driver, wait);
        createAdPage.clickCreateAd();
        LoginPage loginPage = new LoginPage(driver, wait);
        assertEquals("Prijava", loginPage.getLoginText());

    }
}

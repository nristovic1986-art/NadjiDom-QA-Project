package tests.negativeTests;

import base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogInNegativeTest extends BaseTest {

    @BeforeEach
    void openLoginNegativePage() {
        driver.get("https://test-php-56.volvox.rs/nadjidom/test/");

    }

    @Test
    public void logInWithWrongEmail(){
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.clickLoginIcon();
        assertEquals("Prijava", loginPage.getLoginText());
        loginPage.enterEmail("Nemanja.ristovic.kg@hotmail.com");
        loginPage.enterPassword("TestiramSajt!");
        loginPage.clickLoginButton();

        String errorMessage = loginPage.getLoginEmailErrorMessage();
        assertEquals("Pogrešan login/lozinka", errorMessage,
                "User successfully logged in with incorrect credentials");


    }

    @Test
    public void logInWithWrongPassword(){
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.clickLoginIcon();
        assertEquals("Prijava", loginPage.getLoginText());
        loginPage.enterEmail("nemanja.ristovic.kg@hotmail.com");
        loginPage.enterPassword("TestiramSajt!!");
        loginPage.clickLoginButton();

        String errorMessage = loginPage.getLoginPasswordErrorMessage();
        assertEquals("Pogrešan login/lozinka", errorMessage, "User successfully logged in with incorrect credentials");
    }


}

package tests.positiveTests;

import base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest {

    @BeforeEach
    void openBrowser(){
        driver.get("https://test-php-56.volvox.rs/nadjidom/test/");

    }

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.clickLoginIcon();
        assertEquals("Prijava", loginPage.getLoginText());
        loginPage.enterEmail("nemanja.ristovic.kg@hotmail.com");
        loginPage.enterPassword("TestiramSajt!");
        loginPage.clickLoginButton();
        loginPage.openAccountPage();

        assertEquals("Nemanja Ristovic", loginPage.getAccLogin());
        assertEquals("ID: 40406", loginPage.getAccID());



    }
}

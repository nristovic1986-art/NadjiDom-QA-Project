package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import utils.DriverFactory;


import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;


    @BeforeEach
    public void setup(){
        DriverFactory driverFactory = new DriverFactory();
        driver = driverFactory.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    @AfterEach
    public void teardown(){
        driver.quit();
    }

    protected void login(){
        driver.get("https://test-php-56.volvox.rs/nadjidom/test/");
        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.clickLoginIcon();
        loginPage.enterEmail("nemanja.ristovic.kg@hotmail.com");
        loginPage.enterPassword("TestiramSajt!");
        loginPage.clickLoginButton();

    }
}

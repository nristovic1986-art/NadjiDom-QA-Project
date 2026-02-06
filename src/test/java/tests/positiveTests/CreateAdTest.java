package tests.positiveTests;

import base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.TimeoutException;
import pages.CreateAdPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateAdTest extends BaseTest {

    @BeforeEach
    public void openCreateAdPage() {
        driver.get("https://test-php-56.volvox.rs/nadjidom/test/");
        login();
    }

    @Test
    void testCreateAdPage() {
        CreateAdPage page = new CreateAdPage(driver, wait);
        page.clickCreateAd();
        assertEquals("Oglas", page.getCreateAdText());
        try{
            page.clickCookieAccept();
        }catch(TimeoutException e){

        }
        page.enterAdTitle();
        page.selectPurpose();
        page.selectType();
        page.enterPrice();
        page.clickCountry();
        page.clickCity();
        page.clickSettlement();
        page.enterSquareMeters();
        page.clickRoom();
        page.clickBaths();
        page.clickHeating();
        page.clickCondition();
        page.clickGarage();
        page.clickRegistered();
        page.uploadFile("c:\\Users\\neman\\Downloads\\stan.jpg");
        page.waitForUploadComplete();
        assertEquals("stan.jpg", page.getImageName());
        page.clickSaveButton();
        assertEquals("Promene su sačuvane", page.getSaveCompleteStatus());
    }
}

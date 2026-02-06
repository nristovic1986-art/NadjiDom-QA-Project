package tests.positiveTests;

import base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.PostedAdPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostedAdTest extends BaseTest {

    @BeforeEach
    public void openPostedAdPage(){
        driver.get("https://test-php-56.volvox.rs/nadjidom/test/");
        login();
    }

    @Test
    void testPostedAdPage(){
        PostedAdPage page = new PostedAdPage(driver, wait);
        page.clickAccIcon();
        page.clickYourAds();
        assertEquals("Vaši oglasi", page.getYourAdsHeader());
        String id = page.getAdId();
        System.out.println("ID from href:: " + id);
        page.clickOnAd(id);
        assertEquals("Dvosoban stan na Aerodromu", page.getActualAdTitle());
        assertEquals("Kragujevac, Aerodrom", page.getLocation());
        assertEquals("Cena:\n" +
                "Dogovor", page.getPriceText());
        assertEquals("Tip:\n" +
                "Stan", page.getTypeText());
        assertEquals("Kvadratura:\n" +
                "55 m2", page.getSquareMetersText());
        assertEquals("Grejanje:\n" +
                "Gas", page.getHeatingText());
        assertEquals("Broj soba:\n" +
                "2", page.getRoomsText());
        assertEquals("Nameštenost:\n" +
                "Nenamešten", page.getFurnishedText());
        assertEquals("Broj kupatila:\n" +
                "1", page.getBathroomsText());
        assertEquals("Garaža", page.getGarage());
        assertEquals("Uknjiženo", page.getRegistered());
    }

}

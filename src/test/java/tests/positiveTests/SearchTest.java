package tests.positiveTests;

import base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.SearchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTest extends BaseTest {

    @BeforeEach
    public void openSearchPage() {
        driver.get("https://test-php-56.volvox.rs/nadjidom/test/");
    }

    @Test
    public void searchTest() {
        SearchPage searchPage = new SearchPage(driver, wait);
        searchPage.clickMoreParametersLink();
        assertEquals("Nekretnine - Oglasi", searchPage.getSearchPageText());
        searchPage.clickSaleFilter();
        assertEquals("Prodaja", searchPage.getSaleFilterCheck());
        searchPage.clickLocation();
        searchPage.clickInputLocation();
        searchPage.clickInputSettlement();
        assertEquals("Kragujevac/Aerodrom", searchPage.getInputSettlementText());
        searchPage.clickTipFilter();
        searchPage.clickCheckStan();
        assertTrue(searchPage.getStanIsSelected(), "Not selected");
        searchPage.clickSquareMeters();
        assertEquals("Kvadratura",  searchPage.getCheckSquareMetersFilter());
        searchPage.enterMinSquareMeters();
        searchPage.enterMaxSquareMeters();
        searchPage.clickSquareMeters();
        assertEquals("55m2 - 55m2", searchPage.getSquareMetersInputCheck());
        searchPage.clickStructure();
        searchPage.clickStructureOption();
        assertTrue(searchPage.getStructureIsSelected(), "Not selected");
        searchPage.clickMoreParameters();
        searchPage.clickCondition();
        assertTrue(searchPage.getConditionIsSelected(), "Not selected");
        searchPage.clickHeathing();
        assertTrue(searchPage.getHeathingIsSelected(), "Not selected");
        searchPage.clcikRegisteredOption();
        assertTrue(searchPage.getRegisteredIsSelected(), "Not selected");
        searchPage.clickGarage();
        assertTrue(searchPage.getGarageIsSelected(), "Not selected");
        searchPage.clickSearchBtn();
        assertEquals("Stanovi - Prodaja - Oglasi", searchPage.getSearchResultPageTitle());
        assertTrue(searchPage.getHasResults(), "No results");
       assertTrue(searchPage.validateResultCount(),
                "The number of ads in the elements does not match the number in the text!");
        System.out.println("Number of ads in DOM: " + searchPage.getResultCountFromElements());
        System.out.println("Number of in-text ads: " + searchPage.getResultCountFromText());


    }
}

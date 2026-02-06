package tests;

import base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import pages.QuickSearchPage;
import pages.SearchPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuickSearchTest extends BaseTest {

    private QuickSearchPage quickSearchPage;
    private SearchPage searchPage;

    @BeforeEach
    public void openQuickSearch(){
        driver.get("https://test-php-56.volvox.rs/nadjidom/test/");
        quickSearchPage = new QuickSearchPage(driver, wait);
        searchPage = new SearchPage(driver, wait);
    }

    @ParameterizedTest
    @ValueSource(strings = {"stan", "STAN", "sTan", "stAn", "Stan", "stan%%", "stan?", "stan!"})
    void quickSearchShouldReturnResults(String query) {

        assertAll(
                () -> {
                    quickSearchPage.clickSrbija();
                    quickSearchPage.search(query);
                    assertTrue(searchPage.waitForResults(), "Expected results for Srbija: " + query);
                },

        () -> {
            quickSearchPage.clickDropDown();
            quickSearchPage.clickHrvatska();
            quickSearchPage.search(query);
            assertTrue(searchPage.waitForResults(), "Expected results for Hrvatska: " + query);

        },
                () -> {
                    quickSearchPage.clickDropDown();
                    quickSearchPage.clickCrnaGora();
                    quickSearchPage.search(query);
                    assertTrue(searchPage.waitForResults(), "Expected results for Crna Gora: " + query);

                },

                () -> {

                    quickSearchPage.clickDropDown();
                    quickSearchPage.clickBosna();
                    quickSearchPage.search(query);
                    assertTrue(searchPage.waitForResults(), "Expected results for Bosna: " + query);
                });

        //quickSearchPage.clickDropDown();
        //quickSearchPage.clickMakedonija();
        //quickSearchPage.search(query);
        //assertTrue(searchPage.waitForResults(), "Expected results for Makedonija: " + query);

    }

}







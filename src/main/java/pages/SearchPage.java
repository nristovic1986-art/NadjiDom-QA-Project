package pages;

import base.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchPage extends BasePage {

    private By moreParametersLink = By.xpath("//a[@id='detailSearchLinkBtn']");

    private By searchPageList = By.xpath("//h1[@class='h5 mb-0']");

    private By saleFilter = By.xpath("//span[@class='button-text-on-change' and text()='Prodaja']");

    private By saleFilterCheck = By.cssSelector("label[for='ds-radio-sale']");

    private By location = By.xpath("//button[@class='btn dropdown-toggle offcanvas-hidden']");

    private By inputLocation = By.xpath("//input[@id='autoComplete']");

    private By inputSettlement = By.xpath("//li[@id='autoComplete_result_1']");

    private By getInputSettlementText = By.xpath("//div[@data-id='4,32']");

    private By tipFilter = By.xpath("//div[@class='btn-group dropdown filters filters-estate-type']");

    private By checkStan = By.xpath("//input[@id='type-form-check-2']");

    private By stanIsSelected = By.xpath("//input[@id='type-form-check-2']");

    private By squareMetersFilter = By.xpath("//span[@class='button-text-on-change' and text()='Kvadratura']");

    private By checkSquareMetersFilter = By.xpath("//div[@class='h6 filters-title d-flex justify-content-between']/span[normalize-space(text())='Kvadratura']");

    private By minSquareMetersInput = By.xpath("//input[@id='detail_search_min_surface']");

    private By maxSquareMetersInput =  By.xpath("//input[@id='detail_search_max_surface']");

    private By squareMetersInputCheck = By.xpath("//span[@class='button-text-on-change' and normalize-space(text())='55m2 - 55m2']");

    private By structureFilter = By.xpath("//span[@class='button-text-on-change' and text()='Struktura']");

    private By clickStructure = By.xpath("//input[@id='structure-form-check-3']");

    private By structureIsSelected = By.xpath("//input[@id='structure-form-check-3']");

    private By moreParameters = By.xpath("//div[@class='btn-group dropdown filters filters-more-params']");

    private By condition = By.xpath("//label[@class='form-check-label' and normalize-space(text())='Nenamešten']");

    private By conditionIsSelected = By.xpath("//li[contains(@class,'selected')]//input[@type='checkbox']");

    private By heating = By.xpath("//label[@class='form-check-label' and normalize-space(text())='Gas']");

    private By heathingIsSelected = By.xpath("//input[@type='checkbox' and following-sibling::label[normalize-space(text())='Gas']]");

    private By registrated = By.xpath("//input[@id='form-check-registered']");

    private By registratedIsSelected = By.xpath("//input[@id='form-check-registered']");

    private By garage = By.xpath("//input[@id='form-check-garage']");

    private By garageIsSelected = By.xpath("//input[@id='form-check-garage']");

    private By searchBtn = By.xpath("//button[@id='detailSearchButton']");

    private By searchResultPage = By.xpath("//div[@class='d-flex align-items-center justify-content-between mb-3 list-page-title']");

    private By results = By.xpath("//span[contains(text(),'Pronađeno je')]");

    private By hasResults = By.cssSelector(".estate-loop.card.card-hover");

    public SearchPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickMoreParametersLink() {
        wait.until(ExpectedConditions.elementToBeClickable(moreParametersLink)).click();
    }

    public String getSearchPageText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(searchPageList)).getText();
    }

    public void clickSaleFilter() {
        wait.until(ExpectedConditions.elementToBeClickable(saleFilter)).click();
    }

    public String getSaleFilterCheck() {
       return wait.until(ExpectedConditions.visibilityOfElementLocated(saleFilterCheck)).getText();
    }

    public void clickLocation() {
        wait.until(ExpectedConditions.elementToBeClickable(location)).click();
    }

    public void clickInputLocation() {
        wait.until(ExpectedConditions.elementToBeClickable(inputLocation)).sendKeys("Kragujevac");
    }

    public void clickInputSettlement() {
        wait.until(ExpectedConditions.elementToBeClickable(inputSettlement)).click();
    }

    public String getInputSettlementText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(getInputSettlementText)).getText();
    }

    public void clickTipFilter() {
        wait.until(ExpectedConditions.elementToBeClickable(tipFilter)).click();
    }

    public void clickCheckStan() {
        wait.until(ExpectedConditions.elementToBeClickable(checkStan)).click();
    }

    public boolean getStanIsSelected() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(stanIsSelected)).isSelected();
    }

    public void clickSquareMeters() {
        wait.until(ExpectedConditions.elementToBeClickable(squareMetersFilter)).click();
    }

    public String getCheckSquareMetersFilter() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(checkSquareMetersFilter)).getText();
    }

    public void enterMinSquareMeters() {
        wait.until(ExpectedConditions.elementToBeClickable(minSquareMetersInput)).sendKeys("55");
    }

    public void enterMaxSquareMeters() {
        wait.until(ExpectedConditions.elementToBeClickable(maxSquareMetersInput)).sendKeys("55");
    }

    public String getSquareMetersInputCheck() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(squareMetersInputCheck)).getText();
    }

    public void clickStructure() {
        wait.until(ExpectedConditions.elementToBeClickable(structureFilter)).click();
    }

    public void clickStructureOption() {
        wait.until(ExpectedConditions.elementToBeClickable(clickStructure)).click();
    }

    public boolean getStructureIsSelected() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(structureIsSelected)).isSelected();
    }

    public void clickMoreParameters() {
        wait.until(ExpectedConditions.elementToBeClickable(moreParameters)).click();
    }

    public void clickCondition() {
        wait.until(ExpectedConditions.elementToBeClickable(condition)).click();
    }

    public boolean getConditionIsSelected() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(conditionIsSelected)).isSelected();
    }

    public void clickHeathing(){
        wait.until(ExpectedConditions.elementToBeClickable(heating)).click();
    }

    public boolean getHeathingIsSelected() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(heathingIsSelected)).isSelected();
    }

    public void clcikRegisteredOption(){
        wait.until(ExpectedConditions.elementToBeClickable(registrated)).click();
    }

    public boolean getRegisteredIsSelected() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(registratedIsSelected)).isSelected();
    }

    public void clickGarage(){
        wait.until(ExpectedConditions.elementToBeClickable(garage)).click();
    }

    public boolean getGarageIsSelected() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(garageIsSelected)).isSelected();
    }

    public void clickSearchBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
    }

    public String getSearchResultPageTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(searchResultPage)).getText();
    }

    public String getResults(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(results)).getText();
    }

    public boolean getHasResults(){
        List<WebElement> ads = driver.findElements(hasResults);
        return ads.size() > 0;
    }

    public boolean waitForResults() {
        try {
            wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(hasResults, 0));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }


    public int getResultCountFromText() {
        String resultsText = wait.until(ExpectedConditions.visibilityOfElementLocated(results)).getText();
        return Integer.parseInt(resultsText.replaceAll("\\D+", ""));
    }

    public int getResultCountFromElements() {
        List<WebElement> ads = driver.findElements(hasResults);
        return ads.size();
    }


    public boolean validateResultCount() {
        return getResultCountFromElements() == getResultCountFromText();
    }





}

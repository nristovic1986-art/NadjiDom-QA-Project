package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAdPage extends BasePage {



    private By createAdButton = By.id("create-estate-btn");
    private By getCreateAdText = By.xpath("//h1[text()='Oglas ']");

    private By cookieAccept = By.xpath("//a[@class='cc-btn cc-dismiss' and text()='Prihvatam']");

    private By adTitle = By.xpath("//input[@id='ap-title']");

    private By adPurpose = By.xpath("//select[@id='id_ad_type']/option[@value='1']");

    private By adType = By.xpath("//select[@id='id_type']/option[@value='2']");

    private By adPrice = By.xpath("//input[@id='ap-price']");

    private By country = By.xpath("//select[@id='ap-country']/option[@value='0']");

    private By city = By.xpath("//select[@id='ap-city']/option[@value='4']");

    private By settlement = By.xpath("//select[@id='ap-hood']/option[@value='32']");

    private By squareMeters = By.xpath("//input[@id='ap-surface']");

    private By room = By.xpath("//label[@for='ap-rooms-2']");

    private By baths = By.xpath("//label[@for='bathrooms-1']");

    private By heating = By.xpath("//select[@id='id_heating']/option[@value='2']");

    private By condition =  By.xpath("//select[@id='id_condition']/option[@value='3']");

    private By garage = By.xpath("//input[@id='estate-check-garage']");

    private By registered = By.xpath("//input[@id='estate-check-registered']");

    private By uploadButton = By.xpath("//input[@type='file']");

    private By uploadCompleteStatus = By.xpath("//span[@class='filepond--file-status-main' and text()='Upload complete']");

    private By imageName = By.xpath("//li[contains(@class,'filepond--item')]//span[@class='filepond--file-info-main' and text()='stan.jpg']");


    private By saveButton = By.xpath("//button[contains(@class,'add-estate-property-btn')]");

    private By savedAdMessage = By.xpath("//div[@id='adMessage']");


    public CreateAdPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickCreateAd() {
        clickWhenReady(createAdButton);
    }



    public String getCreateAdText() {
       return wait.until(ExpectedConditions.visibilityOfElementLocated(getCreateAdText)).getText();
    }

    public void clickCookieAccept() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cookieAccept)).click();
    }
    public void enterAdTitle(){
        wait.until(ExpectedConditions.elementToBeClickable(adTitle)).sendKeys("Dvosoban stan na Aerodromu");
    }

    public void selectPurpose(){
        wait.until(ExpectedConditions.elementToBeClickable(adPurpose)).click();
    }

    public void selectType(){
        wait.until(ExpectedConditions.elementToBeClickable(adType)).click();
    }

    public void enterPrice(){
        wait.until(ExpectedConditions.elementToBeClickable(adPrice)).sendKeys("0");
    }

    public void clickCountry(){
        wait.until(ExpectedConditions.elementToBeClickable(country)).click();
    }

    public void clickCity(){
        wait.until(ExpectedConditions.elementToBeClickable(city)).click();
    }

    public void clickSettlement(){
        wait.until(ExpectedConditions.elementToBeClickable(settlement)).click();
    }

    public void enterSquareMeters(){
        wait.until(ExpectedConditions.elementToBeClickable(squareMeters)).sendKeys("55");
    }

    public void clickRoom(){
        wait.until(ExpectedConditions.elementToBeClickable(room)).click();
    }

    public void clickBaths(){
        wait.until(ExpectedConditions.elementToBeClickable(baths)).click();
    }

    public void clickHeating(){
        wait.until(ExpectedConditions.elementToBeClickable(heating)).click();
    }

    public void clickCondition(){
        wait.until(ExpectedConditions.elementToBeClickable(condition)).click();
    }

    public void clickGarage(){
        wait.until(ExpectedConditions.elementToBeClickable(garage)).click();
    }

    public void clickRegistered(){
        wait.until(ExpectedConditions.elementToBeClickable(registered)).click();
    }

    public void uploadFile(String filePath){
        driver.findElement(uploadButton).sendKeys(filePath);
    }

    public void waitForUploadComplete() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploadCompleteStatus));
    }

    public String getImageName(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(imageName)).getText();
    }


    public void clickSaveButton(){
        WebElement saveBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(saveButton));
        new Actions(driver).moveToElement(saveBtn).perform();
        saveBtn.click();
    }

    public String getSaveCompleteStatus(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(savedAdMessage)).getText();
    }
}

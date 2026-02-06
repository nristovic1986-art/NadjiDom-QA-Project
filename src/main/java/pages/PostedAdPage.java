package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PostedAdPage extends BasePage {

    private By accInput = By.xpath("//div[@class='dropdown my-n2 ']");

    private By yourAdsLink = By.xpath("//a[contains(@class,'dropdown-item') and contains(.,'Vaši oglasi')]");

    private By yourAdsHeader = By.xpath("//h1[@class='h5 mb-0' and text()='Vaši oglasi']");

    //private By clickOglas =  By.xpath("//a[@class='nav-link stretched-link ad-title' and contains(@href,'925328')]");

    private By actualAdTitle = By.xpath("//h1[@class='h4 wordBreak details-title mb-2 ad-title']");

    private By location = By.xpath("//p[@class='details-subtitle mb-2 pb-1 fs-sm']");

    private By priceText = By.xpath("//ul[@class='list-group list-group-flush mb-0 fs-base']//li[span[normalize-space(text())='Cena:']]");

    private By typeText = By.xpath("//ul[@class='list-group list-group-flush mb-0 fs-base']//li[span[normalize-space(text())='Tip:']]");

    private By squareMetersText = By.xpath("//ul[@class='list-group list-group-flush mb-0 fs-base']//li[span[normalize-space(text())='Kvadratura:']]");

    private By heatingText = By.xpath("//ul[@class='list-group list-group-flush mb-0 fs-base']//li[span[normalize-space(text())='Grejanje:']]");

    private By roomsText = By.xpath("//ul[@class='list-group list-group-flush mb-0 fs-base']//li[span[normalize-space(text())='Broj soba:']]");

    private By furnishedText = By.xpath("//ul[@class='list-group list-group-flush mb-0 fs-base']//li[span[normalize-space(text())='Nameštenost:']]");

    private By bathroomsText = By.xpath("//ul[@class='list-group list-group-flush mb-0 fs-base']//li[span[normalize-space(text())='Broj kupatila:']]");

    private By garage = By.xpath("//li[@class='col' and contains(.,'Garaža')]");

    private By registered = By.xpath("//li[@class='col' and contains(.,'Uknjiženo')]");



    public PostedAdPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickAccIcon(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(accInput)).click();
    }

    public void clickYourAds(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(yourAdsLink)).click();
    }

    public String getYourAdsHeader(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(yourAdsHeader)).getText();
    }

    public String getAdId(){
        WebElement oglasLink = wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//a[@class='nav-link stretched-link ad-title']")));
        String href = oglasLink.getAttribute("href");
        return href.split("/details/")[1].split("/")[0];
    }


    public void clickOnAd(String id){
        By oglas = By.xpath("//a[@class='nav-link stretched-link ad-title' and contains(@href,'" + id + "')]");
        wait.until(ExpectedConditions.elementToBeClickable(oglas)).click();
    }



    public String getActualAdTitle(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(actualAdTitle)).getText();
    }

    public String getLocation(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(location)).getText();
    }

    public String getPriceText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(priceText)).getText();
    }

    public String getTypeText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(typeText)).getText();
    }

    public String getSquareMetersText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(squareMetersText)).getText();
    }

    public String getHeatingText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(heatingText)).getText();
    }

    public String getRoomsText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(roomsText)).getText();
    }

    public String getFurnishedText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(furnishedText)).getText();
    }

    public String getBathroomsText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(bathroomsText)).getText();
    }

    public String getGarage(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(garage)).getText();
    }

    public String getRegistered(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(registered)).getText();
    }



}

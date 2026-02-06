package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.QuickSearchPage;
public class QuickSearchPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By searchField = By.xpath("//input[@class='form-control autosuggest-input']");

    private By quickSearchButton = By.xpath("//i[@class='fi-search']");

    private By srbija = By.xpath("//img[@alt='Srbija']");

    private By hrvatska = By.xpath("//a[@class='dropdown-item me-3 ' and contains(@href,'/hrvatska/')]");

    private By crnaGora = By.xpath("//a[@class='dropdown-item me-3 ' and contains(@href,'/crna-gora/')]");

    private By dropDown = By.xpath("//button[@id='countryDropdownSearch']");

    private By bosna = By.xpath("//a[@class='dropdown-item me-3 ' and contains(@href,'/bosna-i-hercegovina/')]");

    private By makedonija = By.xpath("//a[@class='dropdown-item me-3 ' and contains(@href,'/makedonija/')]");

    public QuickSearchPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clickSrbija(){
        wait.until(ExpectedConditions.elementToBeClickable(srbija)).click();
    }

    public void clickDropDown(){
        wait.until(ExpectedConditions.elementToBeClickable(dropDown)).click();
    }

    public void clickHrvatska(){
        wait.until(ExpectedConditions.presenceOfElementLocated(hrvatska)).click();
    }

    public void clickCrnaGora(){
        wait.until(ExpectedConditions.presenceOfElementLocated(crnaGora)).click();
    }

    public void clickBosna(){
        wait.until(ExpectedConditions.presenceOfElementLocated(bosna)).click();
    }

    public void clickMakedonija(){
        wait.until(ExpectedConditions.presenceOfElementLocated(makedonija)).click();
    }

    public void enterSearchText(String text){
       WebElement input =  wait.until(ExpectedConditions.elementToBeClickable(searchField));
       input.clear();
       input.sendKeys(text);
    }

    public void clickQuickSearchButton(){
        wait.until(ExpectedConditions.elementToBeClickable(quickSearchButton)).click();
    }

    public void search(String text) {
        enterSearchText(text);
        clickQuickSearchButton();
    }

}

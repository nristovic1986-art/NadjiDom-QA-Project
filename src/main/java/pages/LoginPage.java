package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By loginIcon = By.xpath("//button[@id='signin-open-modal']");

    private By loginText = By.xpath("//h2[@class='h3 mb-4 mb-sm-5']");
    private By loginEmail = By.xpath("//input[@id='signin-email']");
    private By loginPassword = By.xpath("//input[@id='signin-password']");

    private By loginButton = By.xpath("//button[@class='btn btn-primary btn-lg w-100 login-form-submit']");


    private By accLoginPage = By.xpath("//div[@class='logo rounded-circle overflow-hidden']");

    private By accLogin = By.xpath("//h6[@class='fs-base mb-2']");

    private By accID = By.xpath("//div[contains(text(),'ID:')]");

    private By loginEmailError = By.xpath("//input[@id='signin-email']/following-sibling::div[@class='invalid-feedback']");

    private By loginPasswordError = By.xpath("//input[@id='signin-password']/following-sibling::div[@class='invalid-feedback']");





    public LoginPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;

    }

    public void clickLoginIcon(){
        wait.until(ExpectedConditions.elementToBeClickable(loginIcon)).click();
    }

    public String getLoginText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(loginText)).getText();
    }

    public void enterEmail(String email){
        wait.until(ExpectedConditions.elementToBeClickable(loginEmail)).sendKeys(email);
    }

    public void enterPassword(String password){
        wait.until(ExpectedConditions.elementToBeClickable(loginPassword)).sendKeys(password);
    }

    public void clickLoginButton(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public void openAccountPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(accLoginPage)).click();
    }

    public String getAccLogin(){
       return wait.until(ExpectedConditions.visibilityOfElementLocated(accLogin)).getText();
    }

    public String getAccID(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(accID)).getText();
    }

    public String getLoginEmailErrorMessage() {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(loginEmailError)).getText();
        } catch (Exception e) {
            return null;
        }
    }


    public String getLoginPasswordErrorMessage() {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(loginPasswordError)).getText();
        } catch (Exception e) {
            return null;
        }
    }


}




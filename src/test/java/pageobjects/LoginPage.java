package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class LoginPage extends BasePage{

    //Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    @FindBy(id="Email")
    @CacheLookup
    private WebElement txtEmail;

    @FindBy(id="Password")
    @CacheLookup
    private WebElement txtPassword;

    @FindBy(xpath="//button[text()='Log in']")
    @CacheLookup
    private WebElement btnLogin;

    @FindBy(linkText = "Logout")
    @CacheLookup
    private WebElement lnkLogout;

    //Action Methods
    public void setUserName(String userName) {
        txtEmail.clear();
        txtEmail.sendKeys(userName);
    }

    public void setPassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void clickLogin() {
        btnLogin.click();
    }

    public void clickLogout() {
        lnkLogout.click();
    }

}
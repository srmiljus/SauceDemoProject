package pom_classes.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoLoginComponent {
    WebDriver driver;

    public SauceDemoLoginComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginButton;

    public void login(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();

    }

    public void setUsername(String usernameValue) {
        username.sendKeys(usernameValue);
    }

    public void setPassword(String passwordValue) { password.sendKeys(passwordValue); }

    public void clickLoginButton() {
        loginButton.click();
    }

}


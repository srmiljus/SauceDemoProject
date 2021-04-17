package pom_classes;

import org.openqa.selenium.WebDriver;
import pom_classes.components.SauceDemoCredentialsComponent;
import pom_classes.components.SauceDemoLoginComponent;

public class SauceDemoLoginPage {
    WebDriver driver;
    SauceDemoLoginComponent sauceDemoLoginComponent;
    SauceDemoCredentialsComponent sauceDemoCredentialsComponent;


    public SauceDemoLoginPage(WebDriver driver) {
        this.driver = driver;
        sauceDemoLoginComponent = new SauceDemoLoginComponent(driver);
        sauceDemoCredentialsComponent = new SauceDemoCredentialsComponent(driver);

    }

    public void loginWithProvidedCredentials(String username, String password) {
        sauceDemoLoginComponent.login(username, password);
    }

}

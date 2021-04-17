package pom_classes.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDemoCredentialsComponent {
    WebDriver driver;

    public SauceDemoCredentialsComponent(WebDriver driver) {
        this.driver = driver;
    }

    public static By usernames = By.xpath("//div[@id='login_credentials']/h4");

    public String getStandardUsernames() {
        return driver.findElement(usernames).getText();
    }

}

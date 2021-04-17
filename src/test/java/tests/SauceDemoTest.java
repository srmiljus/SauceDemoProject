package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom_classes.SauceDemoLoginPage;

import java.io.IOException;

public class SauceDemoTest extends BaseTest {
    String URL = "https://www.saucedemo.com/";
    String username = "standard_user";
    String password = "secret_sauce";


    SauceDemoLoginPage sauceDemoLoginPage;

    @BeforeMethod
    public void setup() {
        init();
        driver.get(URL);
    }

    @AfterMethod
    public void tearDown() {
        quit();
    }

    @Test
    public void login() throws IOException {
        sauceDemoLoginPage = new SauceDemoLoginPage(driver);
        sauceDemoLoginPage.loginWithProvidedCredentials(username, password);
        reportScreenShot("TestAllure","ShortDescription");

    }
}

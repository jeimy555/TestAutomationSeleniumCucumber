package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameField= By.id("username");
    private By passwordField= By.id("password");
    private By buttonLogin= By.cssSelector("#login button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public SecureArea loginUser(String username, String password){
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(buttonLogin).click();
        return new SecureArea(driver);
    }
}

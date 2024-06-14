package pages;

import definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private By usernameField= By.id("username");
    private By passwordField= By.id("password");
    private By buttonLogin= By.cssSelector("#login button");


    public LoginPage(WebDriver driver) {
        this.driver = Hooks.driver;
    }

    public void loginUser(String username, String password){
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);


    }
    public SecureArea clickButtonLogin(){
        driver.findElement(buttonLogin).click();
        return new SecureArea(driver);
    }
}

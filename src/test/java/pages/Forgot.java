package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Forgot {
    private WebDriver driver;
    private By email = By.id("email");
    public Forgot(WebDriver driver) {
        this.driver = driver;
    }

    public void completeEmail(){
        driver.findElement(email).sendKeys("jeimy@gmail.com");
        sendEmail();
        getText();
    }
    public void sendEmail(){
        driver.findElement(By.id("form_submit")).click();
    }
    public String getText(){
       return driver.findElement(By.tagName("h1")).getText();
    }



}

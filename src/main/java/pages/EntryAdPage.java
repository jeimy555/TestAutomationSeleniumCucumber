package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EntryAdPage {
    private WebDriver driver;
    private By modalTitle= By.className("modal");
    private By modalBody= By.className("modal");
    private By modal = By.className("modal");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }


}

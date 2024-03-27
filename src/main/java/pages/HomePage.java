package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

    private WebDriver driver;
    public HomePage (WebDriver driver){
        this.driver=driver;
    }

    public LoginPage clickFormA(){
    clickLink("Form Authentication");
    return new LoginPage(driver);
    }
    public DropDownPage clickDrop(){
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }
    public Forgot clickForgot(){
        clickLink("Forgot Password");
        return new Forgot(driver);
    }
    public Hovers clickHovers(){
        clickLink("Hovers");
        return new Hovers(driver);
    }
    public KeyPressesPage KeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public UploadFilePage uploadFile(){
        clickLink("File Upload");
        return new UploadFilePage(driver);
    }
    public WysiwygEditorPage clickWysiwygEditor(){
        clickLink("WYSIWIG Editor");
        return new WysiwygEditorPage(driver);
    }

    public AlertsPage clickAlert(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public EntryAdPage clickEntryAd(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }


    private void clickLink(String link) {
        driver.findElement(By.linkText(link)).click();

    }
}

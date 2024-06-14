package pages;

import definitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    public HomePage (WebDriver driver){
        this.driver= Hooks.driver;
    }

    public HomePage (){

    }

    public LoginPage clickFormA(){
    clickLink("Form Authentication");
    return new LoginPage(Hooks.driver);
    }
    public DropDownPage clickDrop(){
        clickLink("tests/Dropdown");
        return new DropDownPage(driver);
    }
    public Forgot clickForgot(){
        clickLink("Forgot Password");
        return new Forgot(driver);
    }
    public Hovers clickHovers(){
        clickLink("tests/Hovers");
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
        Hooks.driver.findElement(By.linkText(link)).click();

    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private final WebDriver driver;
    private By drop=By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectOption(String option){
        findDropElement().selectByVisibleText(option);
    }
    public List<String> getOptionsSelect(){
        List<WebElement> selectedElements= findDropElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());

    }

    private Select findDropElement(){
        return new Select(driver.findElement(drop));
    }
}

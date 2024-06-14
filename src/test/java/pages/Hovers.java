package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hovers {
    private WebDriver driver;
    private By figure= By.className("figure");
    private By boxcaption= By.className("figcaption");

    public Hovers(WebDriver driver) {
        this.driver = driver;
    }

    /**
     *
     * @param index starts at 1
     */
    public FigureCaption HoverOverFigure(int index){
        WebElement figura= driver.findElements(figure).get(index);
        Actions actions= new Actions(driver);
        actions.moveToElement(figura).perform();
        return new FigureCaption(figura.findElement(boxcaption));
    }
    public class FigureCaption{
        private WebElement caption;
        private By header=By.tagName("h5");
        private By link =By.tagName("a");
        public FigureCaption(WebElement caption){
            this.caption =caption;
        }
        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }
        public String getTitle(){
            return caption.findElement(header).getText();
        }
        public String getLink(){
            System.out.println(caption.findElement(link).getAttribute("href"));
            return caption.findElement(link).getAttribute("href");
        }
        public String getLinkText(){
            return  caption.findElement(link).getText();
        }
    }

}

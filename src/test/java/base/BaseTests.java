package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        goHome();

        homePage= new HomePage(this.driver);

    }
    @BeforeMethod
    public void goHome(){
        this.driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterClass
    public void tearDown(){
        this.driver.quit();

    }
    /*public static void main(String[] args) {
        BaseTests test= new  BaseTests();
        test.setUp();
        test.tearDown();
    }*/
}

package KeyPresses;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeyPressesTest extends BaseTests {

    @Test
    @Parameters({"letra1", "letra2"})
    public void testKeysPressed(String letra1, String letra2){
        var keyPressesPage= homePage.KeyPresses();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        keyPressesPage.enterText(letra1);
         keyPressesPage.enterText(letra2);
         assertEquals(keyPressesPage.getResult(),
                "You entered: "+letra2);



    }
    @Test
    public void testPi(){
        var keyPage= homePage.KeyPresses();
        keyPage.enterPi();
        assertEquals(keyPage.getResult(),"You entered: 4");
    }
}

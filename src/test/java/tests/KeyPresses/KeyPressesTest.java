package tests.KeyPresses;

import tests.base.BaseTests;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressesTest extends BaseTests {

    @Test
    @Parameters({"letra1", "letra2"})
    public void testKeysPressed(String letra1, String letra2){
        var keyPressesPage= homePage.KeyPresses();
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

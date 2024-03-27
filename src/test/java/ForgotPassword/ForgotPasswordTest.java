package ForgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTest extends BaseTests {
    @Test
    public void ForgotTest(){
        var forg=homePage.clickForgot();
        forg.completeEmail();
        assertTrue(forg.getText().contains("Internal Server Error"),"error");
    }
}

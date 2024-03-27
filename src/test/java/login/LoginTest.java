package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureArea;

import static org.testng.Assert.*;

public class LoginTest extends BaseTests{

    @Test
    public void testLogin(){
        LoginPage loginPage= homePage.clickFormA();
        SecureArea secureArea = loginPage.loginUser("tomsmith","SuperSecretPassword!");
        assertTrue(secureArea.getAlert().contains("You logged into a secure area!"),"Alert is incorrect");

    }

}

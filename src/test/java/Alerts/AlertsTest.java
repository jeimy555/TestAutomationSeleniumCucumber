package Alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTest extends BaseTests {
    @Test
    public void testAccept(){
        var alertsPage=homePage.clickAlert();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(),"You successfully clicked an alert","Results text incorrect");
    }
    @Test
    public void testDissmis(){
        var alertsPage=homePage.clickAlert();
        alertsPage.triggerConfirm();
        String text=alertsPage.alert_getText();
        alertsPage.cancelAlert();
        assertEquals(text,"I am a JS Confirm","Results text incorrect");

    }

    @Test
    public void testPromt(){
        var alertsPage=homePage.clickAlert();
        alertsPage.triggerPrompt();
        alertsPage.inserText("I really good");
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(),"You entered: I really good","Results text incorrect");
    }
}

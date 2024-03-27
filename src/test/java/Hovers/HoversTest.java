package Hovers;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class HoversTest extends BaseTests {
    @Test
    public void testHoverUser1(){
        var hoversPage =homePage.clickHovers();
        var caption =hoversPage.HoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption not dis´played");
        assertEquals(caption.getTitle(),"name: user2", "Caption title incorrect");
        assertEquals(caption.getLinkText(),"View profile", "Caption link text");
        assertTrue(caption.getLink().endsWith("/users/2"), "link incorrect");

    }

}

package tests.Dropdown;

import tests.base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropDownTest extends BaseTests{

@Test
public void testSelection() {
    var drop=homePage.clickDrop();

    String option="Option 2";
    drop.selectOption("Option 2");
    var select=drop.getOptionsSelect();
    assertEquals(select.size(),1,"many options");
    assertTrue(select.contains(option), "option incorrect");
}

}

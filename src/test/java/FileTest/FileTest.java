package FileTest;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileTest extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage= homePage.uploadFile();
        uploadPage.uploadFile("C:\\Users\\jeimy.barbosa\\IdeaProjects\\untitled\\resources\\cornifer.jpg");

        assertEquals(uploadPage.getText(),"cornifer.jpg","mensaje incorrecto");


    }
}

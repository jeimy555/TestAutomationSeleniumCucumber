package tests.Example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Objects;
import java.util.logging.Logger;

public class ExampleTest {
    public Logger log = Logger.getLogger(ExampleTest.class.getName());

    @DataProvider(name="translateHello")
    public static Object [][] inputData(){
        return new Object [][] {{"hello","hola","ciao"}};
    }
    @Test(dataProvider = "translateHello")
    public void TestTranslation(String data){
        log.info(data);
    }

}

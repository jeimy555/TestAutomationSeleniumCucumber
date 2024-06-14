package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureArea;
public class TestSteps {

    private LoginPage loginPage;
    private SecureArea secureArea;

    public TestSteps() {
    }

    @Given("que estoy en la página de inicio de sesión")
    public void navigateToLoginPage() {
        HomePage homePage = new HomePage();
        loginPage = homePage.clickFormA();
    }

    @When("ingreso el nombre de usuario {string} y la contraseña {string}")
    public void enterCredentials(String username, String password) {
         loginPage.loginUser(username, password);
    }
    @When("hago clic en el botón de inicio de sesión")
    public void clickBotonInicio() {
        secureArea = loginPage.clickButtonLogin();
    }

    @Then("debería ver el mensaje {string}")
    public void verifyAlertMessage(String expectedMessage) {
        Assert.assertTrue(secureArea.getAlert().contains(expectedMessage), "El mensaje de alerta es incorrecto");
    }
}

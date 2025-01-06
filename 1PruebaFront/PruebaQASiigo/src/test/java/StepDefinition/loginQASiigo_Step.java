package StepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import pages.homeQASiigoPage;
import pages.loginQASiigoPage;

public class loginQASiigo_Step {

	
	WebDriver driver;
	
	loginQASiigoPage loginQA;
	homeQASiigoPage   homeQA;
	
	
	@Given("Ingresar a la URL QA Siigo")
	public void ingresar_a_la_url_qa_siigo()  {
		System.getProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
	    driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    driver.navigate().to("https://qastaging.siigo.com/#/login/");
	 }

	@And("^Diligenciar campos(.*) y (.*)$")
	public void diligenciar_campos_usuario_y_contrasena(String usuario, String contrasena) throws InterruptedException {
		loginQA = new loginQASiigoPage(driver);
		
		loginQA.ingresarUsuario(usuario);
		loginQA.ingresarContrasena(contrasena);	
		
		Thread.sleep(2000);
	}

	@When("Seleccionar boton Ingresar")
	public void seleccionar_boton_ingresar() throws InterruptedException {
		loginQA.seleccionarIngresar();
		Thread.sleep(5000);
	}

	
	@Then("Visualizar Home QA Siigo")
	public void visualizar_home_qa_siigo() throws InterruptedException {
	    homeQA = new homeQASiigoPage(driver);
	    
	    homeQA.seleccionarCrear();
	    Thread.sleep(3000);
	    homeQA.seleccionarLinkCliente();
	    Thread.sleep(3000);
	}
	
}

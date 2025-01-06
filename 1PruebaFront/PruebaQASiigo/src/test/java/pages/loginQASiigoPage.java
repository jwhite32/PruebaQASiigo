package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginQASiigoPage {

	//Localizadores 
	
	@FindBy(name="username-input")
	WebElement txtUsuario;
	
	@FindBy(name="password-input")
	WebElement txtContrasena;
	
	@FindBy(id="login-submit")
	WebElement btnIngresar;
	
	
	WebDriver driver;
	
	public loginQASiigoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ingresarUsuario(String usuario) {
		txtUsuario.click();
		txtUsuario.sendKeys(usuario);
	}
	
	public void ingresarContrasena(String contrasena) {
		txtContrasena.click();
		txtContrasena.sendKeys(contrasena);
	}
	
	public void seleccionarIngresar() {
		btnIngresar.click();
	}
	
}

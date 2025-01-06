package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class crearClienteQASiigoPage {
	
	//Atributos con SHADOW POM, No permite obtener el xpath de cada elemento WEB
	@FindBy(xpath="//*[@id=\"s0625481-5be7-4b71-9306-a14eaeeb0741\"]/div/div/div[1]/div[1]/div[1]/siigo-dropdownlist-web//div/div/div[1]")
	WebElement selTipoPersona;
	
	@FindBy(xpath="//*[@id=\"s0625481-5be7-4b71-9306-a14eaeeb0741\"]/div/div/div[1]/div[1]/div[2]/siigo-dropdownlist-web//div/div/div[1]")
	WebElement selTipoIdentificacion;
	
	@FindBy(xpath="//*[@id=\"identification\"]/input")
	WebElement txtIdentificacion;
	
	@FindBy(xpath="//*[@id=\"s798c133-ff33-4d82-87bf-0c376c7132ac\"]")
	WebElement txtNombre;
	
	@FindBy(xpath="//*[@id=\"s1835899-14d6-44a1-9ae3-5978f0e8263d\"]")
	WebElement txtApellido;
	
	@FindBy(xpath="//*[@id=\"sb3f57ab-12b8-4cf8-b04f-bc229091b089\"]")
	WebElement txtRazonSocial;
	
	@FindBy(xpath="//*[@id=\"s19d3f82-e58a-498b-8d36-229935f18372\"]")
	WebElement txtNombreComercial;
	
	@FindBy(xpath="//*[@id=\"labelAutocompleteSelectItemcity\"]")
	WebElement selCiudad;
	
	@FindBy(xpath="//*[@id=\"s4bf0fc7-b8df-4c86-8b22-c2dd3c4e9213\"]")
	WebElement txtDireccion;
	
	
	@FindBy(xpath="//*[@id=\"sticky\"]/div[2]/button[2]")
	WebElement btnGuardar;
	
	@FindBy(xpath="//*[@id=\"sticky\"]/div[2]/button[1]")
	WebElement btnCancelar;
	
	WebDriver driver;
	
	public crearClienteQASiigoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void seleccionarTipoPersona() {
		selTipoPersona.click();
	}
	
	public void seleccionarTipoIdentificacion() {
		selTipoIdentificacion.click();
	}
	
	public void enterIdentificacion(String identificacion) {
		txtIdentificacion.sendKeys(identificacion);
	}
	
	public void enterNombre(String nombre) {
		txtNombre.sendKeys(nombre);
	}
	
	public void enterApellido(String apellido) {
		txtNombre.sendKeys(apellido);
	}
	
	public void enterNombreComercial(String nombrecomercial) {
		txtNombre.sendKeys(nombrecomercial);
	}
	
	public void seleccionarCiudad() {
		selCiudad.click();
	}
	
	public void enterDireccion(String direccion) {
		txtDireccion.sendKeys(direccion);
	}
	
	public void guardarInformacionCliente() {
		btnGuardar.click();
	}
	
	
	public void cancelarInformacionCliente() {
		btnCancelar.click();
	}
	
	
	
	
	
	
	
	
	
}

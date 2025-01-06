package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homeQASiigoPage {

	
	//Localizadores 
		
	@FindBy(xpath="//*[@id=\"single-spa-application:react-dashboard\"]/div/div/div/div/div/div[1]/panel-atom/div/div/div[8]/div/img")
	WebElement btnCrear;
	
	@FindBy(xpath="//*[@id=\"wc-se3732f6-c39e-41f9-b4bc-4bfe6879b17f\"]/header/nav/div/div[2]/ul/li[5]/siigo-header-create-button-dropdown/div/div[2]/div[1]/li[3]/div/a")
	WebElement linkClientes;
	
	WebDriver driver;
	
	public homeQASiigoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
		
	public void seleccionarCrear() {
		btnCrear.click();
	}
	
	public void seleccionarLinkCliente() {
		linkClientes.click();
	}
	
}

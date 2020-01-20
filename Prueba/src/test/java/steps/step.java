package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.thucydides.core.annotations.Step;
import pageobject.ChoucairPageObject;

public class step {

	WebDriver driver;
	ChoucairPageObject Objeto;
	
	public step() {
		
		
	}
	
	@Step
	public void instanceWebBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.choucairtesting.com/");
		driver.manage().window().maximize();
		Objeto.setDriver(driver);
	}
	
	@Step
	public void ModuloEmpleo() {
		Objeto.IngresarModuloEmpleos();
	}
	
	@Step
	public void BusquedaEmpleo(String PalabraClave, String LocalidadEmpleo) {
		Objeto.IngresarPalabraClave(PalabraClave);
		Objeto.IngresarCiudad(LocalidadEmpleo);
		Objeto.BuscarEmpleo();
	}
	
	@Step
	public void CheckBusquedaEncontrada() {
		Objeto.CheckBusquedaEncontrada();
	}
	
	@Step
	public void CheckBusquedaFallida() {
		Objeto.CheckBusquedaFallida();
	}
}

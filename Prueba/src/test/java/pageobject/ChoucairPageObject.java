package pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat; 

public class ChoucairPageObject extends PageObject{

	public ChoucairPageObject() {
		
		
	}
	
	//Ingresando al modulo Empleos	
	@FindBy(xpath="//li[@id='menu-item-550']")
	private WebElementFacade ClickEmpleos;
	
	@FindBy(xpath="//input[@id='search_keywords']")
	private WebElementFacade InputPalabraClave;
	
	@FindBy(xpath="//input[@id='search_location']")
	private WebElementFacade InputCiudad;
	
	@FindBy(xpath="//div/input[@value='Buscar trabajos']")
	private WebElementFacade ClickBusqueda;
	
	@FindBy(xpath="//span[contains(text(),'squeda completada')]")
	private WebElementFacade TextoEncontrado;
	
	@FindBy(xpath="//li[contains(text(),'No hay trabajos correspondientes a tu b')]")
	private WebElementFacade TextoNoEncontrado;
	
	
	public void IngresarModuloEmpleos() {
		ClickEmpleos.click();
	}
	
	public void IngresarPalabraClave(String Palabra) {
		InputPalabraClave.clear();
		InputPalabraClave.sendKeys(Palabra);
	}
	
	public void IngresarCiudad(String Ciudad) {
		InputCiudad.clear();
		InputCiudad.sendKeys(Ciudad);
	}
	
	public void BuscarEmpleo() {
		ClickBusqueda.click();
	}
	
	public void CheckBusquedaEncontrada() {
		String expectedMsg = "squeda completada";
		String message = TextoEncontrado.getText();
		assertThat(message, containsText(expectedMsg));
	}
	
	public void CheckBusquedaFallida() {
		String expectedMsg = "No hay trabajos correspondientes a tu b";
		String message = TextoNoEncontrado.getText();
		assertThat(message, containsText(expectedMsg));
	}
}

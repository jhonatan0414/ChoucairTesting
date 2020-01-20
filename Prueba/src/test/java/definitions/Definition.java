package definitions;


import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.step;

public class Definition {

	@Steps
	step ChoucairStep;

	
@Given("^que ingresa a la pagina de choucair testing$")
public void que_ingresa_a_la_pagina_de_choucair_testing() {
    // Write code here that turns the phrase above into concrete actions
    ChoucairStep.instanceWebBrowser();
}


@When("^ingreso al modulo empleos$")
public void ingreso_al_modulo_empleos() {
    ChoucairStep.ModuloEmpleo();
}

@When("^busco vacantes$")
public void busco_vacantes(DataTable Busqueda) {
	List<Map<String,String>> data = Busqueda.asMaps(String.class,String.class);
	ChoucairStep.BusquedaEmpleo(data.get(0).get("empleo"), data.get(0).get("ciudad"));
}

@Then("^se obtiene el resultado$")
public void se_obtiene_el_resultado() {
	ChoucairStep.CheckBusquedaEncontrada();
}

@Then("^no se obtiene el resultado$")
public void no_se_obtiene_el_resultado() {
	ChoucairStep.CheckBusquedaFallida();
}

}

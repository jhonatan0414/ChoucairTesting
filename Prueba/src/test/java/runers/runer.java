package runers;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions (
	plugin		= {"pretty"},
	features	= {"src/test/resources/features/resourse.feature"},
	glue		= {"definitions"},
	tags		= {"@Busqueda-de-empleo-exitosa, @Busqueda-de-empleo-fallida"}
)
public class runer {

}

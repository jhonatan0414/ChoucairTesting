Feature: Prueba de admision para QA Automation Analyst en Choucair Testing
Validar busqueda de empleo en el modulo empleo de la pagina de ChoucairTesting

  @Busqueda-de-empleo-exitosa
  Scenario: Validar la busqueda de empleo exitosa
    Given que ingresa a la pagina de choucair testing
    When ingreso al modulo empleos
    And busco vacantes
    | empleo  | ciudad  |
	  | testing | medellin|
    Then se obtiene el resultado
    
 @Busqueda-de-empleo-fallida
  Scenario: Validar la busqueda de empleo fallida
    Given que ingresa a la pagina de choucair testing
    When ingreso al modulo empleos
    And busco vacantes
    | empleo  | ciudad  |
	  | fallo   | Brasil  |
    Then no se obtiene el resultado
  
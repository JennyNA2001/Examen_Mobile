Feature: Login de SwagLabs
  @prueba
  Scenario: Logeo correcto
  Given me encuentro en la app de login de SwagsLabs
  When ingreso el usuario correcto "standard_user"
    And ingreso la contraseña correcta "secret_sauce"
    And se da click en el boton LOGIN
    Then se valida que debe aparecer el titulo "PRODUCTS"
    And se valida que al menos exista un item

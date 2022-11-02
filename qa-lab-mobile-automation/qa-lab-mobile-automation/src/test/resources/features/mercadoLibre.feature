Feature: Busqueda en Mercado Libre
  Scenario: Busqueda simple
    Given estoy en la APP de Mercado Libre
    When selecciono la barra de busqueda
   And ingreso la busqueda "televisores"
    And selecciono el primer resultado de busqueda

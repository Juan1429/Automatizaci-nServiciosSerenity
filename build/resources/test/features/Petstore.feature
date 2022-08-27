#lenguage:en
  Feature: Creacion exitosa de usuario y orden
    Scenario: Creacion de la orden
      When se envien las peticiones al servicio
      Then se valida que el codigo de status sea 200


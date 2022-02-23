Feature: Inicio de sesion
  Como cliente de Hibot
  necesito inicar sesion
  para configurar mis canales

  Background:
    Given que el cliente está en la página de inicio de sesion de hibot

  @Scenario1
  Scenario Outline: inicio de sesion valido
    When el cliente llene los siguentes datos
      | correo    | <correo>     |
      | contasena | <contrasena> |
    Then la pagina le debe mostrar las novedades de la app

    Examples:
      | correo                           | contrasena   |
      |claudia.valencia.qa@sofka.com.co|Pruebas2022@|
# new feature
# Tags: optional

Feature: Inicio de sesion
  Como cliente de Hibot
  necesito inicar sesion
  para configurar mis canales

  Background:
    Given que el cliente está en la página principal de hibot

  @Scenario1
  Scenario Outline: inicio de sesion valido
    When el cliente navegue hasta el boton iniciar sesión y llena los siguentes datos
    |correo|<correo>|
    |contaseña|<contrasena>|
    Then la pagina le debe mostrar las novedades de la app

Examples:
  |correo|contrasena|
  |claudia.valencia.qa@sofka.com.co|Pruebas2022@|
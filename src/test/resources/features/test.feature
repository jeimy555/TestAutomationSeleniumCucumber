Feature: Inicio de sesión en la aplicación

Scenario: Iniciar sesión con credenciales válidas
  Given que estoy en la página de inicio de sesión
  When ingreso el nombre de usuario "tomsmith" y la contraseña "SuperSecretPassword!"
  And hago clic en el botón de inicio de sesión
  Then debería ver el mensaje "You logged into a secure area!"
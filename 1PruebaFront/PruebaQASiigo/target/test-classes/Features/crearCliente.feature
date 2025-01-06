Feature: Creacion de cliente

  Scenario Outline: Realizar inicio de sesion exitoso
    Given Ingresar a la URL QA Siigo
    And Diligenciar campos <usuario> y <contrasena>
    When Seleccionar boton Ingresar
    Then Visualizar Home QA Siigo

    Examples: 
      | usuario                         | contrasena               |
      | retoautomationsiigo@yopmail.com | T4b4ck0ff1c3P455w0rd658* |

  
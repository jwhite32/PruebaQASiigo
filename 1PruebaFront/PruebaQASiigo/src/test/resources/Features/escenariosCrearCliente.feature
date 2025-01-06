@PruebaE2E
Feature: Creacion de cliente

  Scenario Outline: Realizar inicio de sesion exitoso
    Given Ingresar a la URL QA Siigo
    And Diligenciar campos <usuario> y <contrasena>
    When Seleccionar boton Ingresar
    Then Visualizar Home QA Siigo

    Examples: 
      | usuario                         | contrasena               |
      | retoautomationsiigo@yopmail.com | T4b4ck0ff1c3P455w0rd658* |

@PruebaUnidad
  Scenario: Realizar validación campo Tipo de identificacion
    Given Que el usuario selecciona el campo Tipo de identificacion
    When Selecciona una de las opciones: CC o NIT
    Then Visualizar opción seleccionada

  @PruebaIntegracion
  Scenario: Verificar validación campo Identificación, de acuerdo a la seleccion del campo Tipo de identificacion
    Given Que el campo Tipo de identificacion esta seleccionado con la opcion CC
    When Diligenciar el campo identificación ingresando letras y caracteres especiales
    Then El campo identificacón no debe permitir el ingreso de letras y caracteres especiales

  @PruebaSistema
  Scenario Outline: Crear cliente, ingresando los datos obligatorios
    Given Al ingresar al formulario Crear un tercero
    And Diligenciar los campos obligatorios Tipo de identificacion, Identificacion, Nombres, Apellidos
    When Seleccionar el boton Guardar
    And Validar que los campos estén bien diligenciados
    Then Visualizar mensaje de Creacion Exitosa del Cliente

  @PruebaAceptacion
  Scenario: Visualizar alerta, si el cliente ingresado ya existe
    Given Al ingresar al formulario Crear un tercero
    And Diligenciar los campos obligatorios Tipo de identificacion, Identificacion, Nombres, Apellidos, de un usuario ya registrado
    When Seleccionar el boton Guardar
    And Validar que los campos estén bien diligenciados
    Then Visualizar mensaje de Alerte Cliente Ya Creado

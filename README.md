# Identity Data 

Identity Data 

## Requisitos

1. Java >= 1.7
2. Maven >= 3.3

## Instalación

Para la instalación de las dependencias se deberá ejecutar el siguiente comando:

```shell
mvn install -Dmaven.test.skip=true
```

> **NOTA:** Este fragmento del comando *-Dmaven.test.skip=true* evitará que se lance la prueba unitaria.


## Guía de inicio

### Paso 1. Agregar el producto a la aplicación

Al iniciar sesión seguir los siguientes pasos:

1. Dar clic en la sección "**Mis aplicaciones**".
2. Seleccionar la aplicación.
3. Ir a la pestaña de "**Editar '@tuApp**' ".
   <p align="center">
     <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/edit_applications.jpg" width="900">
   </p>
4. Al abrirse la ventana, seleccionar el producto.
5. Dar clic en el botón "**Guardar App**":
   <p align="center">
     <img src="https://github.com/APIHub-CdC/imagenes-cdc/blob/master/selected_product.jpg" width="400">
   </p>

### Paso 2. Capturar los datos de la petición

Los siguientes datos a modificar se encuentran en ***src/main/java/io/identityData/client/ApiClient.java***

Es importante contar con el setUp() que se encargará de inicializar la url. Modificar la URL ***('URL_API')***, como se muestra en el siguiente fragmento de código:

```java
 @Before
    public void setUp() {
        this.apiClient = api.getApiClient();
        this.apiClient.setBasePath("URL_API");
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(new SignerInterceptor())
                .build();
        apiClient.setHttpClient(okHttpClient);
    }
```

En el archivo **VerifyCedulaApiTest.java**, que se encuentra en ***src/test/java/io/identityData/client/api/VerifyCedulaApiTest..java*** se deberá modificar el siguiente fragmento de código con los datos correspondientes:

```java

 @Test
    public void retrieveVerifyCedulaTest() throws Exception {
        String xApiKey = this.xApiKey;
        String username = this.username;
        String password = this.password;
        String inquiryId = "YOUR_INQUIRY_ID";
        VerifyCedulaGetResponse response = api.retrieveVerifyCedula(xApiKey, username, password, inquiryId);
        Assert.assertNotNull(response);
        logger.info(response.toString());
    }

    @Test
    public void verifyCedulaTest() throws Exception {
        IdentityCedulaValidationRequest body =  new IdentityCedulaValidationRequest();
        String xApiKey = this.xApiKey;
        String username = this.username;
        String password = this.password;
        
        
        PrivacyNotice privacyNotice = new PrivacyNotice();
        privacyNotice.setTermsAcceptedAt("");
        
        FullName fullName = new FullName();
        fullName.setNames("");
        fullName.setPaternalSurname("");
        fullName.setMaternalSurname("");
        fullName.setBirthDate("");
        
        Address address = new Address();
        address.setStreet("");
        address.setNeighborhood("");
        address.setCity("");
        address.setMunicipality("");
        address.setState(StateEnum.AGU);
        address.setPostalCode("");
        
        privacyNotice.setFullName(fullName);
        privacyNotice.setAddress(address);
        
        body.setPrivacyNotice(privacyNotice);
        
        AllOfIdentityCedulaValidationRequestCedulaValidator cedulaValidator = new AllOfIdentityCedulaValidationRequestCedulaValidator();
        cedulaValidator.setExternalId("");
        cedulaValidator.setSubscriptionId("");
        cedulaValidator.setCurp("");
        cedulaValidator.setNames("");
        cedulaValidator.setLastName("");
        cedulaValidator.setSecondLastName("");
        
        body.setCedulaValidator(cedulaValidator);
        
        IdentityCedulaValidationResponse response = api.verifyCedula(body, xApiKey, username, password);
        Assert.assertNotNull(response);
        logger.info(response.toString());

    }
```

### Paso 3. Ejecutar la prueba unitaria

Teniendo los pasos anteriores ya solo falta ejecutar la prueba unitaria, con el siguiente comando:

```shell
mvn test -Dmaven.install.skip=true
```
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

Es importante contar con el setUp() que se encargará de inicializar la url. Modificar la URL ***('the_url')***, como se muestra en el siguiente fragmento de código:

```java
  private String basePath = "the_url";
```

En el archivo **FimpeApiTest.java**, que se encuentra en ***src/test/java/io/identityData/client/api/FimpeApiTest..java*** se deberá modificar el siguiente fragmento de código con los datos correspondientes:

```java

@Test
public void createCredentialTest() throws Exception {
        String xSignature = null;
        String xApiKey = this.xApiKey;
        String username = this.username;
        String password = this.password;
        Request body = new Request();
        body.setInfoProvider(Request.InfoProviderEnum.INE);
        body.setCic("YOUR_CIC");
        body.setOcr("YOUR_OCR");
        body.setReferencia("YOUR_REFERENCIA");
        body.setInstitucion("C_CREDITO");
        body.setFecha("YOUR_DATE");
        body.setRequestId("3842184a-89b6-4307-ab87-dc5d830819fa");


        ResponseINE response = api.callIneWithHttpInfo( xApiKey, username, password, body).getData();

        }


@Test
public void renapoGet() throws Exception {
        String xSignature = null;
        String xApiKey = this.xApiKey;
        String username = this.username;
        String password = this.password;
        Request body = new Request();
        body.setInfoProvider(Request.InfoProviderEnum.RENAPO);
        body.setCurp("YOUR_CuRP");
        body.setReferencia("YOUR_REFERENCIA");
        body.setFecha("YOUR_DATE");
        body.setRequestId("3842184a-89b6-4307-ab87-dc5d830819fa");


        ResponseRenapo response = api.callRENAPO( xApiKey, username, password, body).getData();

        }

@Test
public void sepet() throws Exception {
        String xSignature = null;
        String xApiKey = this.xApiKey;
        String username = this.username;
        String password = this.password;
        Request body = new Request();
        body.setInfoProvider(Request.InfoProviderEnum.SEP);
        body.setNumeroCedula("YOUR_CEDULA");
        body.setReferencia("YOUR_REFERENCIA");
        body.setInstitucion("YOUR_INSTITuTION");
        body.setFecha("YOUR_DATE");
        body.setRequestId("3842184a-89b6-4307-ab87-dc5d830819fa");


        ResponseSEP response = api.callSEP( xApiKey, username, password, body).getData();

        }
```

### Paso 3. Ejecutar la prueba unitaria

Teniendo los pasos anteriores ya solo falta ejecutar la prueba unitaria, con el siguiente comando:

```shell
mvn test -Dmaven.install.skip=true
```
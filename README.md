# SOAP Integration

Proyecto Spring Boot que implementa un servicio web SOAP para gestionar puntuaciones de usuarios.

## Descripcion

soapIntegration es una aplicacion web construida con Spring Boot y Spring-WS que proporciona un endpoint SOAP para consultar puntuaciones. El servicio procesa solicitudes de puntuacion de usuarios y retorna respuestas con estadisticas de juego (victorias, derrotas, empates).

## Requisitos

- Java 17 o superior
- Maven 3.6+
- Spring Boot 4.0.1

## Tecnologias

- Spring Boot 4.0.1
- Spring-WS (Web Services)
- JAXB (Java Architecture for XML Binding)
- WSDL4J

## Estructura del Proyecto

```
src/
├── main/
│   ├── java/org/example/
│   │   ├── soap/
│   │   │   ├── ScoreEndpoint.java       # Endpoint SOAP principal
│   │   │   ├── WebserviceConfigurations.java  # Configuracion de Spring-WS
│   │   │   └── SoapIntegrationApplication.java # Clase principal
│   │   └── soapintegration/
│   │       ├── GetScoreRequest.java     # DTO para solicitud (generado)
│   │       ├── GetScoreResponse.java    # DTO para respuesta (generado)
│   │       ├── Score.java               # Modelo de puntuacion (generado)
│   │       └── ObjectFactory.java       # Factory JAXB (generado)
│   └── resources/
│       └── score.xsd                    # Esquema XML para generacion de clases
└── test/
    └── java/org/example/soapintegration/
        └── SoapIntegrationApplicationTests.java
```

## Configuracion

### Compilacion

```bash
mvn clean install
```

### Ejecucion

```bash
mvn spring-boot:run
```

La aplicacion se inicia en `http://localhost:8080`

## Endpoints

### WSDL
- **URL**: `http://localhost:8080/ws/score.wsdl`

### SOAP Endpoint
- **URI**: `/ws`
- **Namespace**: `http://www.soapintegration.example.org/`
- **Operacion**: `getScoreRequest`

## Uso

### Ejemplo de Solicitud SOAP

```xml
<?xml version="1.0" encoding="UTF-8"?>
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/"
                   xmlns:ns="http://www.soapintegration.example.org/">
    <SOAP-ENV:Body>
        <ns:getScoreRequest>
            <ns:user>admin</ns:user>
        </ns:getScoreRequest>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

### Ejemplo de Respuesta SOAP

```xml
<?xml version="1.0" encoding="UTF-8"?>
<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
    <SOAP-ENV:Body>
        <ns:getScoreResponse xmlns:ns="http://www.soapintegration.example.org/">
            <ns:score>
                <ns:wins>100</ns:wins>
            </ns:score>
        </ns:getScoreResponse>
    </SOAP-ENV:Body>
</SOAP-ENV:Envelope>
```

## Generacion de Clases JAXB

Las clases del modelo se generan automaticamente a partir del archivo `score.xsd` usando el plugin `jaxb2-maven-plugin`. Para regenerar las clases:

```bash
mvn org.codehaus.mojo:jaxb2-maven-plugin:xjc
```

## Pruebas

Ejecutar las pruebas unitarias:

```bash
mvn test
```

## Notas de Desarrollo

- El endpoint SOAP esta decorado con `@Endpoint` y `@PayloadRoot`
- La configuracion de Spring-WS se define en `WebserviceConfigurations` que extiende `WsConfigurationSupport`
- El `MessageDispatcherServlet` se registra en la ruta `/ws/*` para procesar solicitudes SOAP
- La logica de negocio retorna puntuaciones diferentes segun el usuario: el usuario "admin" obtiene 100 victorias, mientras que otros usuarios obtienen 99 victorias, 66 derrotas y 7 empates

## Licencia

Este proyecto es de codigo abierto.

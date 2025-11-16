# Geo API

Proyecto base para exponer endpoints geoespaciales simples apoyados en OSRM.

## Estructura principal

```
src/main/java/ar/edu/utn/frc/grupo114/geoapi
├── GeoapiApplication.java
├── config
│   └── WebClientConfig.java
├── controller
│   └── GeoController.java
├── model
│   ├── DistanceResponse.java
│   └── RouteInfo.java
└── service
    └── OsrmService.java
```

## Ejecución

1. `./mvnw spring-boot:run`
2. Accedé a `http://localhost:8080/swagger-ui.html` para probar los endpoints.

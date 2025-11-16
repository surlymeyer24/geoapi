package ar.edu.utn.frc.grupo114.geoapi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import ar.edu.utn.frc.grupo114.geoapi.model.RouteInfo;

@Service
public class OsrmService {

    private final WebClient client;

    public OsrmService(WebClient client) {
        this.client = client;
    }

    public RouteInfo getRoute(double lon1, double lat1, double lon2, double lat2) {

        String coords = lon1 + "," + lat1 + ";" + lon2 + "," + lat2;

        return client.get()
                .uri("/route/v1/driving/{coords}?overview=false", coords)
                .retrieve()
                .bodyToMono(RouteInfo.class)
                .block();
    }
}

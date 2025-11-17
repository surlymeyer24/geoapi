package ar.edu.utn.frc.grupo114.geoapi.service;

import ar.edu.utn.frc.grupo114.geoapi.model.OsrmResponse;
import ar.edu.utn.frc.grupo114.geoapi.model.RouteInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class OsrmService {

    private final WebClient client;

    public OsrmService(WebClient client) {
        this.client = client;
    }

    public RouteInfo getRoute(double lon1, double lat1, double lon2, double lat2) {

        String coords = lon1 + "," + lat1 + ";" + lon2 + "," + lat2;

        OsrmResponse response = client.get()
                .uri("/route/v1/driving/{coords}?overview=false", coords)
                .retrieve()
                .bodyToMono(OsrmResponse.class)
                .block();

        // OSRM siempre devuelve al menos 1 route
        double distance = response.getRoutes().get(0).getDistance();
        double duration = response.getRoutes().get(0).getDuration();

        return new RouteInfo(distance, duration);
    }
}

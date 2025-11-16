package ar.edu.utn.frc.grupo114.geoapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.utn.frc.grupo114.geoapi.model.RouteInfo;
import ar.edu.utn.frc.grupo114.geoapi.service.OsrmService;

@RestController
@RequestMapping("/api/rutas")
public class GeoController {

    private final OsrmService osrmService;

    public GeoController(OsrmService osrmService) {
        this.osrmService = osrmService;
    }

    @GetMapping
    public RouteInfo obtenerRuta(
        @RequestParam double lon1,
        @RequestParam double lat1,
        @RequestParam double lon2,
        @RequestParam double lat2
    ) {
        return osrmService.getRoute(lon1, lat1, lon2, lat2);
    }
}

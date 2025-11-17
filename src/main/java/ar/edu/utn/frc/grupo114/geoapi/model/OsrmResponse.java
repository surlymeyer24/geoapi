package ar.edu.utn.frc.grupo114.geoapi.model;

import java.util.List;

public class OsrmResponse {
    private String code;
    private List<OsrmRoute> routes;

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public List<OsrmRoute> getRoutes() { return routes; }
    public void setRoutes(List<OsrmRoute> routes) { this.routes = routes; }
}

package ar.edu.utn.frc.grupo114.geoapi.model;

public class DistanceResponse {

    private double distanciaKm;
    private double duracionMin;

    public DistanceResponse(double distanciaKm, double duracionMin) {
        this.distanciaKm = distanciaKm;
        this.duracionMin = duracionMin;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public double getDuracionMin() {
        return duracionMin;
    }
}

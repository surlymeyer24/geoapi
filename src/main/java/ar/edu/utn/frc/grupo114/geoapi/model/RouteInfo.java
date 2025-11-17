package ar.edu.utn.frc.grupo114.geoapi.model;

public class RouteInfo {

    private double distance;
    private double duration;

    public RouteInfo() {}

    public RouteInfo(double distance, double duration) {
        this.distance = distance;
        this.duration = duration;
    }

    public double getDistance() { return distance; }
    public void setDistance(double distance) { this.distance = distance; }

    public double getDuration() { return duration; }
    public void setDuration(double duration) { this.duration = duration; }
}

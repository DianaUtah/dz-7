public enum SolarSystemPlanet {
    MERCURY(1, 0, 0.39, 2439, null, Planet.VENUS),
    VENUS(2, 0.39, 0.72, 6052, Planet.MERCURY, Planet.EARTH),
    EARTH(3, 0.72, 1, 6371, Planet.VENUS, Planet.MARS),
    MARS(4, 1, 1.52, 3389, Planet.EARTH, null);

    private final int orderFromSun;
    private final double distanceFromPreviousPlanet;
    private final double distanceFromSun;
    private final int radius;
    private final Planet previousPlanet;
    private final Planet nextPlanet;

    SolarSystemPlanet(int orderFromSun, double distanceFromPreviousPlanet, double distanceFromSun, int radius,
                      Planet previousPlanet, Planet nextPlanet) {
        this.orderFromSun = orderFromSun;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        this.distanceFromSun = distanceFromSun;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.nextPlanet = nextPlanet;
    }

    public int getOrderFromSun() {
        return orderFromSun;
    }

    public double getDistanceFromPreviousPlanet() {
        return distanceFromPreviousPlanet;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getRadius() {
        return radius;
    }

    public Planet getPreviousPlanet() {
        return previousPlanet;
    }

    public Planet getNextPlanet() {
        return nextPlanet;
    }
}

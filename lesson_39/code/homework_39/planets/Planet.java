package homework_39.planets;

/* Задача 2.
Занести планеты солнечной системы в список, содержащий:
порядок расположения планет;
наименование планеты;
расстояние до Солнца;
массу планеты;
количество спутников;

Вывести список планет отсортированный по:
порядку расположения в солнечной системе;
алфавиту;
массе;
количеству спутников. */

import java.util.Objects;

public class Planet implements Comparable<Planet> {
    private int locationId;
    private String name;
    private double distanceToSun;
    private double planetMass;
    private int quantityOfSatellites;

    public Planet(int locationId, String name, double distanceToSun, double planetMass, int quantityOfSatellites) {
        this.locationId = locationId;
        this.name = name;
        this.distanceToSun = distanceToSun;
        this.planetMass = planetMass;
        this.quantityOfSatellites = quantityOfSatellites;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public double getPlanetMass() {
        return planetMass;
    }

    public void setPlanetMass(double planetMass) {
        this.planetMass = planetMass;
    }

    public int getQuantityOfSatellites() {
        return quantityOfSatellites;
    }

    public void setQuantityOfSatellites(int quantityOfSatellites) {
        this.quantityOfSatellites = quantityOfSatellites;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "locationId=" + locationId +
                ", name='" + name + '\'' +
                ", distanceToSun=" + distanceToSun +
                ", planetMass=" + planetMass +
                ", quantityOfSatellites=" + quantityOfSatellites +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planet planet)) return false;
        return locationId == planet.locationId && Double.compare(distanceToSun, planet.distanceToSun) == 0 && Double.compare(planetMass, planet.planetMass) == 0 && quantityOfSatellites == planet.quantityOfSatellites && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationId, name, distanceToSun, planetMass, quantityOfSatellites);
    }

    @Override
    public int compareTo(Planet o) {
        int res = Integer.compare(quantityOfSatellites, o.quantityOfSatellites); // сортировка по количеству планет
        return res != 0 ? res : Long.compare((int) planetMass, (int) o.planetMass); // сортировка по массе
    }
}


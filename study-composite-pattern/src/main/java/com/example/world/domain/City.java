package com.example.world.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "cityId")
public class City implements Statistics {
    private int cityId;
    private String name;
    private int population;
    private double gnp;
    private double surfaceArea;
    @JsonBackReference
    private Country country;

    public City() {
    }

    public City(int cityId, String name, int population, double gnp, double surfaceArea) {
        this.cityId = cityId;
        this.name = name;
        this.population = population;
        this.gnp = gnp;
        this.surfaceArea = surfaceArea;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getGnp() {
        return gnp;
    }

    public void setGnp(double gnp) {
        this.gnp = gnp;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        return cityId == city.cityId;
    }

    @Override
    public int hashCode() {
        return cityId;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", gnp=" + gnp +
                ", surfaceArea=" + surfaceArea +
                '}';
    }
}

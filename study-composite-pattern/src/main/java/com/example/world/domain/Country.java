package com.example.world.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.ArrayList;
import java.util.List;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "code")
public class Country implements Statistics {
    // ISO3
    private String code; // TUR
    @JsonManagedReference
    private List<City> cities = new ArrayList<>();
    @JsonManagedReference
    private City capital;

    public Country() {
    }

    public Country(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getPopulation() {
        return this.cities.stream().mapToInt(City::getPopulation).sum();
    }

    public void setPopulation(int population) {
    }

    public void setGnp(double gnp) {
    }

    public void setSurfaceArea(double surfaceArea) {
    }

    public double getGnp() {
        return this.cities.stream().mapToDouble(City::getGnp).sum();
    }

    public double getSurfaceArea() {
        return this.cities.stream().mapToDouble(City::getSurfaceArea).sum();
    }


    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
        this.cities.forEach(city -> city.setCountry(this));
    }

    public void addCity(City city) {
        this.cities.add(city);
    }

    public void removeCity(City city) {
        this.cities.remove(city);
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
        capital.setCountry(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return code != null ? code.equals(country.code) : country.code == null;
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", population=" + getPopulation() +
                ", gnp=" + getGnp() +
                ", surfaceArea=" + getSurfaceArea() +
                ", capital.name=" + capital.getName() +
                '}';
    }
}

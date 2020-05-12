package com.example;

import com.example.world.domain.City;
import com.example.world.domain.Country;
import com.example.world.domain.Statistics;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) throws JsonProcessingException {
        Country turkey = new Country("TUR");
        City ankara = new City(1,"Ankara",4_500_000,7000,1000000);
        City istanbul = new City(2,"Istanbul",20_000_000,9000,1500000);
        ankara.setCountry(turkey);
        istanbul.setCountry(turkey);
        turkey.addCity(ankara);
        turkey.addCity(istanbul);
        turkey.setCapital(ankara);
        aiFun(turkey);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(turkey);
        System.out.println(json);
        Country country = mapper.readValue(json,Country.class);
        System.out.println(country);
    }

    public static void aiFun(Statistics statistics){
        // do intelligent processing
    }
}

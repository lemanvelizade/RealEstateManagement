package org.example.repository;

import org.example.model.House;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HouseRepository {
    private List<House> houses;
    private List<House> villas;
    private List<House> summerHouses;

    public HouseRepository() {
        this.houses = new ArrayList<>(Arrays.asList(
                new House("House", 100000, 120, 3, 1),
                new House("House", 150000, 150, 4, 1),
                new House("House", 200000, 200, 5, 2)
        ));

        this.villas = new ArrayList<>(Arrays.asList(
                new House("Villa", 300000, 350, 6, 2),
                new House("Villa", 350000, 400, 7, 3),
                new House("Villa", 400000, 450, 8, 3)
        ));

        this.summerHouses = new ArrayList<>(Arrays.asList(
                new House("SummerHouse", 500000, 250, 5, 2),
                new House("SummerHouse", 550000, 300, 6, 2),
                new House("SummerHouse", 600000, 350, 7, 3)
        ));
    }

    public List<House> getHouseList() {
        return houses;
    }

    public List<House> getVillaList() {
        return villas;
    }

    public List<House> getSummerHouseList() {
        return summerHouses;
    }
}
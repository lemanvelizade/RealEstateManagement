package org.example.service;

import org.example.model.House;
import org.example.repository.HouseRepository;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    private HouseRepository houseRepository;

    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public double getTotalPriceOfHouses() {
        return houseRepository.getHouseList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfVillas() {
        return houseRepository.getVillaList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfSummerHouses() {
        return houseRepository.getSummerHouseList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfAllHouses() {
        return getTotalPriceOfHouses() + getTotalPriceOfVillas() + getTotalPriceOfSummerHouses();
    }

    public double getAverageAreaOfHouses() {
        return houseRepository.getHouseList().stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public double getAverageAreaOfVillas() {
        return houseRepository.getVillaList().stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public double getAverageAreaOfSummerHouses() {
        return houseRepository.getSummerHouseList().stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public double getAverageAreaOfAllHouses() {
        List<House> allHouses = new ArrayList<>(houseRepository.getHouseList());
        allHouses.addAll(houseRepository.getVillaList());
        allHouses.addAll(houseRepository.getSummerHouseList());
        return allHouses.stream().mapToDouble(House::getArea).average().orElse(0);
    }

    public List<House> filterHousesByRoomsAndLivingRooms(int rooms, int livingRooms) {
        List<House> allHouses = new ArrayList<>(houseRepository.getHouseList());
        allHouses.addAll(houseRepository.getVillaList());
        allHouses.addAll(houseRepository.getSummerHouseList());
        return allHouses.stream()
                .filter(house -> house.getRooms() == rooms && house.getLivingRooms() == livingRooms)
                .toList();
    }
}
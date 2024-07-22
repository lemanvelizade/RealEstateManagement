package org.example;

import org.example.model.House;
import org.example.repository.HouseRepository;
import org.example.service.HouseService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseRepository houseRepository = new HouseRepository();
        HouseService houseService = new HouseService(houseRepository);

        System.out.println("Total price of houses: " + houseService.getTotalPriceOfHouses());
        System.out.println("Total price of villas: " + houseService.getTotalPriceOfVillas());
        System.out.println("Total price of summer houses: " + houseService.getTotalPriceOfSummerHouses());
        System.out.println("Total price of all houses: " + houseService.getTotalPriceOfAllHouses());

        System.out.println("Average area of houses: " + houseService.getAverageAreaOfHouses());
        System.out.println("Average area of villas: " + houseService.getAverageAreaOfVillas());
        System.out.println("Average area of summer houses: " + houseService.getAverageAreaOfSummerHouses());
        System.out.println("Average area of all houses: " + houseService.getAverageAreaOfAllHouses());

        List<House> filteredHouses = houseService.filterHousesByRoomsAndLivingRooms(5, 2);
        System.out.println("Filtered houses with 5 rooms and 2 living rooms: ");
        filteredHouses.forEach(house -> System.out.println(house.getType() + " - " + house.getPrice()));
    }
}
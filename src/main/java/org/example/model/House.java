package org.example.model;

public class House {
    private String type;
    private double price;
    private double area;
    private int rooms;
    private int livingRooms;

    public House(String type, double price, double area, int rooms, int livingRooms) {
        this.type = type;
        this.price = price;
        this.area = area;
        this.rooms = rooms;
        this.livingRooms = livingRooms;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getArea() {
        return area;
    }

    public int getRooms() {
        return rooms;
    }

    public int getLivingRooms() {
        return livingRooms;
    }
}

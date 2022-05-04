package ua.lviv.iot.military_equipment.types;

import ua.lviv.iot.military_equipment.AnotherMilitaryEquipment;

public class Tank extends AnotherMilitaryEquipment {
    private int weight;
    private double length;
    private double width;
    private double height;
    private int groundClearance;

    public Tank(int weight, double length, double width, double height, int groundClearance, int max_speed,
                int number_in_the_crew, String type_of_armor) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.groundClearance = groundClearance;
        super.maxSpeed = max_speed;
        super.numberInTheCrew = number_in_the_crew;
        super.typeOfArmor = type_of_armor;

    }

    public Tank() {
    }

    @Override
    public String toString() {
        return "Tank{" +
                "weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", ground_clearance=" + groundClearance + "number in the crew = " + super.numberInTheCrew +
                '}';
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", groundClearance";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + groundClearance;
    }
}

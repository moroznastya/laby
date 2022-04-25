package ua.lviv.iot.military_equipment.types;

import ua.lviv.iot.military_equipment.AnotherMilitaryEquipment;

public class Tank extends AnotherMilitaryEquipment {
    private int weight;
    private double length;
    private double width;
    private double height;
    private int ground_clearance;

    public Tank(int weight, double length, double width, double height, int ground_clearance, int max_speed,
                int number_in_the_crew, String type_of_armor) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.ground_clearance = ground_clearance;
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
                ", ground_clearance=" + ground_clearance + "number in the crew = " + super.numberInTheCrew +
                '}';
    }
}

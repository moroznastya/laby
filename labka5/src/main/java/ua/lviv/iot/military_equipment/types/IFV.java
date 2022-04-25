package ua.lviv.iot.military_equipment.types;

import ua.lviv.iot.military_equipment.AnotherMilitaryEquipment;

public class IFV extends AnotherMilitaryEquipment {
    private int weight;
    private double length;
    private double width;

    @Override
    public String toString() {
        return "IFV{" +
                "weight=" + weight +
                ", length=" + length +
                ", width=" + width + "number in the crew = " + super.numberInTheCrew +
                '}';
    }

    public IFV(int weight, double length, double width, int max_speed, int number_in_the_crew, String type_of_armor) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        super.maxSpeed = max_speed;
        super.numberInTheCrew = number_in_the_crew;
        super.typeOfArmor = type_of_armor;


    }
}

package ua.lviv.iot.military_equipment.types;

import ua.lviv.iot.military_equipment.Another_military_equipment;

public class IFV extends Another_military_equipment {
    private int weight;
    private double length;
    private double width;

    @Override
    public String toString() {
        return "IFV{" +
                "weight=" + weight +
                ", length=" + length +
                ", width=" + width + "number in the crew = " + super.number_in_the_crew +
                '}';
    }

    public IFV(int weight, double length, double width, int max_speed, int number_in_the_crew, String type_of_armor) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        super.max_speed = max_speed;
        super.number_in_the_crew = number_in_the_crew;
        super.type_of_armor = type_of_armor;


    }
}

package ua.lviv.iot.military_equipment.types;

import ua.lviv.iot.military_equipment.Another_military_equipment;

public class CRV extends Another_military_equipment {
    private int trunk_length;

    @Override
    public String toString() {
        return "CRV{" +
                "trunk_length=" + trunk_length +  "number in the crew = " + super.number_in_the_crew +
                '}';
    }

    public CRV(int weight, double length, double width, double height, int trunk_length, int number_in_the_crew, String type_of_armor) {
        super.weight = weight;
        super.length = length;
        super.width = width;
        super.height = height;
        this.trunk_length = trunk_length;
        super.number_in_the_crew = number_in_the_crew;
        super.type_of_armor = type_of_armor;


    }
}

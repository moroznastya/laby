package ua.lviv.iot.military_equipment.types;

import ua.lviv.iot.military_equipment.Wheeled_military_equipment;

public class APC extends Wheeled_military_equipment {
    private String name;

    public APC(String name, int max_speed, int number_in_the_crew, int fuel_consumption, String type_of_armor) {
        this.name = name;
        super.max_speed = max_speed;
        super.number_in_the_crew = number_in_the_crew;
        super.fuel_consumotion = fuel_consumption;
        super.type_of_armor = type_of_armor;
    }

    @Override
    public String toString() {
        return "APC{" +
                "name='" + name + '\'' + "number in the crew = " + super.number_in_the_crew +
                '}';
    }
}

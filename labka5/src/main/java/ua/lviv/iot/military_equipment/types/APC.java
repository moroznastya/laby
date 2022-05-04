package ua.lviv.iot.military_equipment.types;

import ua.lviv.iot.military_equipment.WheeledMilitaryEquipment;

public class APC extends WheeledMilitaryEquipment {
    private String name;

    public APC(String name, int max_speed, int number_in_the_crew, int fuel_consumption, String type_of_armor) {
        this.name = name;
        super.maxSpeed = max_speed;
        super.numberInTheCrew = number_in_the_crew;
        super.fuelConsumption = fuel_consumption;
        super.typeOfArmor = type_of_armor;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", name";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + name;
    }

    @Override
    public String toString() {
        return "APC{" +
                "name='" + name + '\'' + "number in the crew = " + super.numberInTheCrew +
                '}';
    }
}

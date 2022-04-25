package ua.lviv.iot.military_equipment.types;

import ua.lviv.iot.military_equipment.WheeledMilitaryEquipment;

public class CRPV extends WheeledMilitaryEquipment {
    private int specific_power;
    private int weight;
    private double length;
    private double width;
    private double height;

    @Override
    public String toString() {
        return "CRPV{" +
                "specific_power=" + specific_power +
                ", weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height + "number in the crew = " + super.numberInTheCrew +
                '}';
    }

    public CRPV(int specific_power, int weight, double length, double width, double height, int number_in_the_crew,
                int fuel_consumption, String type_of_armor) {
        this.specific_power = specific_power;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        super.numberInTheCrew = number_in_the_crew;
        super.fuelConsumption = fuel_consumption;


    }
}

package ua.lviv.iot.military_equipment.types;

import ua.lviv.iot.military_equipment.Wheeled_military_equipment;

public class CRPV extends Wheeled_military_equipment {
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
                ", height=" + height + "number in the crew = " + super.number_in_the_crew +
                '}';
    }

    public CRPV(int specific_power, int weight, double length, double width, double height, int number_in_the_crew,
                int fuel_consumption, String type_of_armor) {
        this.specific_power = specific_power;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        super.number_in_the_crew = number_in_the_crew;
        super.fuel_consumotion = fuel_consumption;


    }
}

package ua.lviv.iot.military_equipment.types;

import ua.lviv.iot.military_equipment.WheeledMilitaryEquipment;

public class CRPV extends WheeledMilitaryEquipment {
    private int specificPower;
    private int weight;
    private double length;
    private double width;
    private double height;

    @Override
    public String toString() {
        return "CRPV{" +
                "specific_power=" + specificPower +
                ", weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height + "number in the crew = " + super.numberInTheCrew +
                '}';
    }

    public CRPV(int specificPower, int weight, double length, double width, double height, int number_in_the_crew,
                int fuel_consumption, String type_of_armor, int maxSpeed) {
        this.specificPower = specificPower;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        super.numberInTheCrew = number_in_the_crew;
        super.fuelConsumption = fuel_consumption;
        super.typeOfArmor = type_of_armor;
        super.maxSpeed = maxSpeed;


    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", specificPower";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + specificPower;
    }
}

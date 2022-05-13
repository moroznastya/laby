package ua.lviv.iot.military_equipment.types;

import ua.lviv.iot.military_equipment.AnotherMilitaryEquipment;

public class CRV extends AnotherMilitaryEquipment {
    private int trunkLength;

    @Override
    public String toString() {
        return "CRV{" +
                "trunk_length=" + trunkLength +  "number in the crew = " + super.numberInTheCrew +
                '}';
    }

    public CRV(int weight, double length, double width, double height, int trunkLength, int numberInTheCrew,
               String typeOfArmor, int maxSpeed) {
        super.weight = weight;
        super.length = length;
        super.width = width;
        super.height = height;
        this.trunkLength = trunkLength;
        super.numberInTheCrew = numberInTheCrew;
        super.typeOfArmor = typeOfArmor;
        super.maxSpeed = maxSpeed;


    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", trunkLength";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + trunkLength;
    }
}

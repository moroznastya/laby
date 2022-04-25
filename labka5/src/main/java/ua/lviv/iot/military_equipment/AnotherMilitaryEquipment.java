package ua.lviv.iot.military_equipment;

public class AnotherMilitaryEquipment extends MilitaryEquipment {
    protected int weight;
    protected double length;
    protected double width;
    protected double height;

    @Override
    public String toString() {
        return "Another_military_equipment{" +
                "weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}

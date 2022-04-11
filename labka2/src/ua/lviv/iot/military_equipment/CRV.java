package ua.lviv.iot.military_equipment;

public class CRV extends SABRE{
    private int trunk_length;

    public CRV(int weight, double length, double width, double height, int trunk_length) {
        super.weight = weight;
        super.length = length;
        super.width = width;
        super.height = height;
        this.trunk_length = trunk_length;
    }
}

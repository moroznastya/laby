package ua.lviv.iot.military_equipment;

public class CRPV extends SABRE{
    private int specific_power;

    public CRPV(int specific_power, int weight, double length, double width, double height) {
        this.specific_power = specific_power;
        super.weight = weight;
        super.length = length;
        super.width = width;
        super.height = height;
    }
}

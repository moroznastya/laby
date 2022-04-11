package ua.lviv.iot.military_equipment;

public class IFV extends Military_equipment {
    private int weight;
    private double length;
    private double width;

    public IFV(int weight, double length, double width, int max_speed) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        super.max_speed = max_speed;
    }
}

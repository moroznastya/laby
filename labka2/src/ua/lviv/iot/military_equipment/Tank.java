package ua.lviv.iot.military_equipment;

public class Tank extends Military_equipment {
    private int weight;
    private double length;
    private double width;
    private double height;
    private int ground_clearance;

    public Tank(int weight, double length, double width, double height, int ground_clearance, int max_speed ) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.ground_clearance = ground_clearance;
        super.max_speed = max_speed;
    }

    public Tank() {}
}

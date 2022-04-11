package ua.lviv.iot.military_equipment;

public class APC extends Military_equipment {
    private String name;

    public APC(String name, int max_speed) {
        this.name = name;
        super.max_speed = max_speed;
    }
}

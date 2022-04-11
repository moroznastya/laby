package ua.lviv.iot.military_equipment;

public class Main {

    public static void main(String[] args) {
	Tank tank = new Tank(38, 8.75, 3.415, 2.154, 500, 70);
    APC apc = new APC("btr60", 100);
    IFV ifm = new IFV(13, 6.375, 2.94, 56);
    CRV crv = new CRV(13, 6.76, 2.94, 1.92, 29);
    CRPV crpv = new CRPV(20, 7, 5.75, 2.35, 2.395);
    }
}

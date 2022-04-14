package ua.lviv.iot.military_equipment;

import ua.lviv.iot.military_equipment.types.APC;
import ua.lviv.iot.military_equipment.types.CRPV;

import java.util.ArrayList;

public class Wheeled_military_equipment extends Military_equipment{
    public int fuel_consumotion; //na 100 km

    ArrayList<Wheeled_military_equipment> wheeled_military_equipments = new ArrayList<Wheeled_military_equipment>();

    public void addWheeled_military_equipment(){
        wheeled_military_equipments.add(new APC("btr60", 100, 2, 116, "streeled_rolled"));
        wheeled_military_equipments.add(new CRPV(20, 7, 5.75, 2.35, 2.395, 4,
                30, "combined_multilayer") );
    }

    ArrayList<Wheeled_military_equipment> found = new ArrayList<Wheeled_military_equipment>();



    public void foundMilitary_equipment() {

        for (Wheeled_military_equipment wheeled_military_equipment : wheeled_military_equipments) {
            if (wheeled_military_equipment.fuel_consumotion <= 30) {
                found.add(wheeled_military_equipment);
            }
        }
        for (int i = 0; i < found.size(); i++) {
            System.out.println(found.get(i));
        }


    }


}
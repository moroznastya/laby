package ua.lviv.iot.military_equipment;

import ua.lviv.iot.military_equipment.types.APC;
import ua.lviv.iot.military_equipment.types.CRPV;

import java.util.ArrayList;

public class WheeledMilitaryEquipment extends MilitaryEquipment {
    public int fuelConsumption; //na 100 km


    @Override
    public String getHeaders() {
        return super.getHeaders() + ", fuelConsumption";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + fuelConsumption;
    }


    public ArrayList<WheeledMilitaryEquipment> addWheeledMilitaryEquipment(){
        ArrayList<WheeledMilitaryEquipment> wheeledMilitaryEquipments = new ArrayList<WheeledMilitaryEquipment>();
                wheeledMilitaryEquipments.add(new APC("btr60", 100, 2, 116, "streeled_rolled"));
        wheeledMilitaryEquipments.add(new CRPV(20, 7, 5.75, 2.35, 2.395, 4,
                30, "combined_multilayer", 50) );
        return wheeledMilitaryEquipments;

    }





    public ArrayList<WheeledMilitaryEquipment> foundMilitaryEquipment(int n) {
        ArrayList<WheeledMilitaryEquipment> found = new ArrayList<WheeledMilitaryEquipment>();

        for (int i=0; i< addWheeledMilitaryEquipment().size(); i++) {

            if (addWheeledMilitaryEquipment().get(i).fuelConsumption <= n) {
                //System.out.println("function is here");
                found.add(addWheeledMilitaryEquipment().get(i));
            }
        }
        return found;


    }



}
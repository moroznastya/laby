package ua.lviv.iot.military_equipment;

import ua.lviv.iot.military_equipment.types.*;

import java.util.ArrayList;
import java.util.Comparator;


public class MilitaryEquipment {
    public int maxSpeed;
    protected int numberInTheCrew;
    protected String typeOfArmor;


    public String getHeaders() {
        return "maxSpeed, numberInTheCrew, typeOfArmor";
    }

    public String toCSV() {
        return this.getMaxSpeed() + ", " + this.getNumberInTheCrew() + ", " + this.getTypeOfArmor();
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getTypeOfArmor() {
        return typeOfArmor;
    }

    public int getNumberInTheCrew() {
        return numberInTheCrew;
    }




    public ArrayList<MilitaryEquipment> addMilitary_equipment() {
        ArrayList<MilitaryEquipment> militaryEquipments = new ArrayList<>();

        militaryEquipments.add(new Tank(38, 8.75, 3.415, 2.154, 500, 70,
                3, "combined_multilayer"));
        militaryEquipments.add(new APC("btr60", 100, 2,
                116, "streeled_rolled"));
        militaryEquipments.add(new IFV(13, 6.375, 2.94, 56, 3,
                "streeled_rolled"));
        militaryEquipments.add(new CRV(13, 6.76, 2.94, 1.92, 29, 6,
                "bulletproof", 60));
        militaryEquipments.add(new CRPV(20, 7, 5.75, 2.35, 2.395,
                4, 30, "combined_multilayer", 50));

     return militaryEquipments;
    }


    public void sortByNumber_in_the_crewAsc(ArrayList<MilitaryEquipment> militaryEquipments) {


         militaryEquipments.sort(Comparator.comparing(MilitaryEquipment::getNumberInTheCrew));



    }

    public void sortByNumberInTheCrewDesc(ArrayList<MilitaryEquipment> militaryEquipments) {
        militaryEquipments.sort(Comparator.comparing(MilitaryEquipment::getNumberInTheCrew).reversed());

    }


    public ArrayList<MilitaryEquipment> sortByTypeOfArmorStreeledRolled() {
        ArrayList<MilitaryEquipment> equipments_streeled_rolled = new ArrayList<>();

        for (MilitaryEquipment militaryEquipment : addMilitary_equipment()) {

            if (militaryEquipment.typeOfArmor.equals("streeled_rolled")) {
                equipments_streeled_rolled.add(militaryEquipment);
            }
        }

        return equipments_streeled_rolled;


    }

    public ArrayList<MilitaryEquipment> sortByTypeOfArmorBulletProof() {
        ArrayList<MilitaryEquipment> equipments_bulletproof = new ArrayList<>();
        for (MilitaryEquipment militaryEquipment : addMilitary_equipment()) {

            if (militaryEquipment.typeOfArmor.equals("bulletproof")) {
                equipments_bulletproof.add(militaryEquipment);
            }
        }
        return equipments_bulletproof;
    }

    public ArrayList<MilitaryEquipment> sortByTypeOfArmorCombinedMultilayer() {
        ArrayList<MilitaryEquipment> equipments_combined_multilayer = new ArrayList<>();
        for (MilitaryEquipment militaryEquipment : addMilitary_equipment()) {

            if (militaryEquipment.typeOfArmor.equals("combined_multilayer")) {
                equipments_combined_multilayer.add(militaryEquipment);
            }
        }
        return equipments_combined_multilayer;
    }


    @Override
    public String toString() {
        return "Military_equipment{" +
                "max_speed=" + maxSpeed +
                ", number_in_the_crew=" + numberInTheCrew +
                ", type_of_armor='" + typeOfArmor +
                '}';
    }
}


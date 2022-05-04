package ua.lviv.iot.military_equipment;

import ua.lviv.iot.military_equipment.types.*;

import java.util.ArrayList;
import java.util.Comparator;

public class MilitaryEquipment {
    public int maxSpeed;
    public int numberInTheCrew;
    public String typeOfArmor;




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



    ArrayList<MilitaryEquipment> militaryEquipments = new ArrayList<MilitaryEquipment>();

    public ArrayList<MilitaryEquipment> addMilitary_equipment() {


        militaryEquipments.add(new Tank(38, 8.75, 3.415, 2.154, 500, 70,
                3, "combined_multilayer" ));
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



    public void sortByNumber_in_the_crewAsc() {


        militaryEquipments.sort(Comparator.comparing(MilitaryEquipment::getNumberInTheCrew));

        for (MilitaryEquipment count : militaryEquipments) {
            System.out.println(count);
        }
    }

    public void sortByNumberInTheCrewDesc() {

        militaryEquipments.sort(Comparator.comparing(MilitaryEquipment::getNumberInTheCrew).reversed());

        for (MilitaryEquipment count : militaryEquipments) {
            System.out.println(count);
        }
    }





    public ArrayList<MilitaryEquipment> sortByTypeOfArmorStreeledRolled(){
        ArrayList<MilitaryEquipment> equipments_streeled_rolled = new ArrayList<MilitaryEquipment>();
        /*ArrayList<MilitaryEquipment> equipments_combined_multilayer = new ArrayList<MilitaryEquipment>();
        ArrayList<MilitaryEquipment> equipments_bulletproof = new ArrayList<MilitaryEquipment>();*/
        for (MilitaryEquipment militaryEquipment: militaryEquipments) {

            if (militaryEquipment.typeOfArmor == "streeled_rolled") {
                equipments_streeled_rolled.add(militaryEquipment);

            /*} else if (militaryEquipment.typeOfArmor == "combined_multilayer"){
                equipments_combined_multilayer.add(militaryEquipment);
            } else if (militaryEquipment.typeOfArmor == "bulletproof"){
                equipments_bulletproof.add(militaryEquipment);
            };*/
            }
        }

        return equipments_streeled_rolled;


        /*System.out.println("\n");
        System.out.println("Equipments with bulletproof armor ");
        for (int i = 0; i < equipments_bulletproof.size(); i++) {
            System.out.println(equipments_bulletproof.get(i));
        }
        System.out.println("\n");
        System.out.println("Equipments with combined multilayer armor ");
        for (int i = 0; i < equipments_combined_multilayer.size(); i++) {
            System.out.println(equipments_combined_multilayer.get(i));
        }
        System.out.println("\n");
        System.out.println("Equipments with streeled_rolled armor ");
        for (int i = 0; i < equipments_streeled_rolled.size(); i++) {
            System.out.println(equipments_streeled_rolled.get(i));
        }*/
    }

    public ArrayList<MilitaryEquipment> sortByTypeOfArmorBulletProof(){
        ArrayList<MilitaryEquipment> equipments_bulletproof = new ArrayList<MilitaryEquipment>();
        for (MilitaryEquipment militaryEquipment: militaryEquipments) {

            if (militaryEquipment.typeOfArmor == "bulletproof") {
                equipments_bulletproof.add(militaryEquipment);
            }
        }
        return equipments_bulletproof;
    }

    public ArrayList<MilitaryEquipment> sortByTypeOfArmorCombinedMultilayer(){
        ArrayList<MilitaryEquipment> equipments_combined_multilayer = new ArrayList<MilitaryEquipment>();
        for (MilitaryEquipment militaryEquipment: militaryEquipments) {

            if (militaryEquipment.typeOfArmor == "combined_multilayer") {
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

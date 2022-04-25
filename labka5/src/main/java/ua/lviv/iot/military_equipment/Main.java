package ua.lviv.iot.military_equipment;

import ua.lviv.iot.military_equipment.types.*;

public class Main {

    public static void main(String[] args) {
	Tank tank = new Tank(38, 8.75, 3.415, 2.154, 500, 70,
            3, "combined_multilayer");
    APC apc = new APC("btr60", 100, 2, 116, "streeled_rolled");
    IFV ifm = new IFV(13, 6.375, 2.94, 56, 3,"streeled_rolled");
    CRV crv = new CRV(13, 6.76, 2.94, 1.92, 29, 6,
            "bulletproof");
    CRPV crpv = new CRPV(20, 7, 5.75, 2.35, 2.395, 4,
            30, "combined_multilayer");


    WheeledMilitaryEquipment wheeledMilitaryEquipment = new WheeledMilitaryEquipment();
    wheeledMilitaryEquipment.addWheeledMilitaryEquipment();
    System.out.println("Found wheeled equipment which consumes less than 30 liters per 100 km ");
    wheeledMilitaryEquipment.foundMilitaryEquipment(30);

    System.out.println("\n");
    MilitaryEquipment militaryEquipment = new MilitaryEquipment();
    militaryEquipment.addMilitary_equipment();
    System.out.println("Sort military equipments by number in the crew by ascending");
    militaryEquipment.sortByNumber_in_the_crewAsc();
    System.out.println("\n");
    System.out.println("Sort military equipments by number in the crew by descending");
    militaryEquipment.sortByNumberInTheCrewDesc();
    System.out.println("\n");
    System.out.println("Sort military equipments by type of armor");
    militaryEquipment.sortByTypeOfArmorStreeledRolled();


    }


}

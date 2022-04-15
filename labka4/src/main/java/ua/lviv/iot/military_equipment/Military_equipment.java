package ua.lviv.iot.military_equipment;

import ua.lviv.iot.military_equipment.types.*;

import java.util.ArrayList;
import java.util.Comparator;

public class Military_equipment {
    public int max_speed;
    public int number_in_the_crew;
    public String type_of_armor;

    public String getType_of_armor() {
        return type_of_armor;
    }

    public int getNumber_in_the_crew() {
        return number_in_the_crew;
    }

    ArrayList<Military_equipment> military_equipments = new ArrayList<Military_equipment>();

    public void addMilitary_equipment() {

        military_equipments.add(new Tank(38, 8.75, 3.415, 2.154, 500, 70,
                3, "combined_multilayer" ));
        military_equipments.add(new APC("btr60", 100, 2,
                116, "streeled_rolled"));
        military_equipments.add(new IFV(13, 6.375, 2.94, 56, 3,
                "streeled_rolled"));
        military_equipments.add(new CRV(13, 6.76, 2.94, 1.92, 29, 6,
                "bulletproof"));
        military_equipments.add(new CRPV(20, 7, 5.75, 2.35, 2.395,
                4, 30, "combined_multilayer"));
    }



    public void sortByNumber_in_the_crewAsc() {

        military_equipments.sort(Comparator.comparing(Military_equipment::getNumber_in_the_crew));

        for (Military_equipment count : military_equipments) {
            System.out.println(count);
        }
    }

    public void sortByNumber_in_the_crewDesc() {

        military_equipments.sort(Comparator.comparing(Military_equipment::getNumber_in_the_crew).reversed());

        for (Military_equipment count : military_equipments) {
            System.out.println(count);
        }
    }



    ArrayList<Military_equipment> equipments_streeled_rolled = new ArrayList<Military_equipment>();
    ArrayList<Military_equipment> equipments_combined_multilayer = new ArrayList<Military_equipment>();
    ArrayList<Military_equipment> equipments_bulletproof = new ArrayList<Military_equipment>();

    public void sortByType_of_armor(){
        for (Military_equipment military_equipment: military_equipments) {
            /*switch (military_equipment.type_of_armor) {
                case "streeled_rolled":
                    equipments_streeled_rolled.add(military_equipment);
                    break;

                case "combined_multilayer":
                    equipments_combined_multilayer.add(military_equipment);
                    break;

                case "bulletproof":
                    equipments_bulletproof.add(military_equipment);
                    break;

            }*/
            if (military_equipment.type_of_armor == "streeled_rolled"){
                equipments_streeled_rolled.add(military_equipment);
            } else if (military_equipment.type_of_armor == "combined_multilayer"){
                equipments_combined_multilayer.add(military_equipment);
            } else if (military_equipment.type_of_armor == "bulletproof"){
                equipments_bulletproof.add(military_equipment);
            };
        }
        System.out.println("\n");
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
        }
    }



    @Override
    public String toString() {
        return "Military_equipment{" +
                "max_speed=" + max_speed +
                ", number_in_the_crew=" + number_in_the_crew +
                ", type_of_armor='" + type_of_armor +
                '}';
    }
}

package ua.lviv.iot.military_equipment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.military_equipment.types.*;


import java.util.ArrayList;

class MilitaryEquipmentTest {
private MilitaryEquipment militaryEquipment;
private ArrayList<MilitaryEquipment> militaryEquipments;
    @BeforeEach
    void setUp() throws Exception{
        militaryEquipment = new MilitaryEquipment();
        militaryEquipments = new ArrayList<MilitaryEquipment>();
        militaryEquipments.add(new Tank(38, 8.75, 3.415, 2.154, 500, 70,
                3, "combined_multilayer" ));
        militaryEquipments.add(new APC("btr60", 100, 2,
                116, "streeled_rolled"));
        militaryEquipments.add(new IFV(13, 6.375, 2.94, 56, 3,
                "streeled_rolled"));
        militaryEquipments.add(new CRV(13, 6.76, 2.94, 1.92, 29, 6,
                "bulletproof"));
        militaryEquipments.add(new CRPV(20, 7, 5.75, 2.35, 2.395,
                4, 30, "combined_multilayer"));
    }

    @AfterEach
    void tearDown () {
    }

    @Test
    void addMilitary_equipment() {
        MilitaryEquipment militaryEquipment1 = new MilitaryEquipment();
        var result = militaryEquipment1.addMilitary_equipment();
        Assertions.assertEquals(militaryEquipments.get(0).maxSpeed,
                result.get(0).maxSpeed);
        Assertions.assertEquals(militaryEquipments.get(1).maxSpeed,
                result.get(1).maxSpeed);
        Assertions.assertEquals(militaryEquipments.get(2).maxSpeed,
                result.get(2).maxSpeed);
        Assertions.assertEquals(militaryEquipments.get(3).maxSpeed,
                result.get(3).maxSpeed);
        Assertions.assertEquals(militaryEquipments.get(4).maxSpeed,
                result.get(4).maxSpeed);
    }

    @Test
    void sortByNumber_in_the_crewAsc() {
        MilitaryEquipment militaryEquipment1 = new MilitaryEquipment();
        militaryEquipment1.addMilitary_equipment();
        militaryEquipment1.sortByNumber_in_the_crewAsc();
        var result = militaryEquipment1.militaryEquipments;
        Assertions.assertEquals(militaryEquipments.get(1).numberInTheCrew,
                result.get(0).numberInTheCrew);
        Assertions.assertEquals(militaryEquipments.get(0).numberInTheCrew,
                result.get(1).numberInTheCrew);
        Assertions.assertEquals(militaryEquipments.get(2).numberInTheCrew,
                result.get(2).numberInTheCrew);
        Assertions.assertEquals(militaryEquipments.get(4).numberInTheCrew,
                result.get(3).numberInTheCrew);
        Assertions.assertEquals(militaryEquipments.get(3).numberInTheCrew,
                result.get(4).numberInTheCrew);
    }

    @Test
    void sortByNumberInTheCrewDesc() {
        MilitaryEquipment militaryEquipment1 = new MilitaryEquipment();
        militaryEquipment1.addMilitary_equipment();
        militaryEquipment1.sortByNumberInTheCrewDesc();
        var result = militaryEquipment1.militaryEquipments;
        Assertions.assertEquals(militaryEquipments.get(3).numberInTheCrew,
                result.get(0).numberInTheCrew);
        Assertions.assertEquals(militaryEquipments.get(4).numberInTheCrew,
                result.get(1).numberInTheCrew);
        Assertions.assertEquals(militaryEquipments.get(2).numberInTheCrew,
                result.get(2).numberInTheCrew);
        Assertions.assertEquals(militaryEquipments.get(0).numberInTheCrew,
                result.get(3).numberInTheCrew);
        Assertions.assertEquals(militaryEquipments.get(1).numberInTheCrew,
                result.get(4).numberInTheCrew);

    }

    @Test
    void sortByTypeOfArmorStreeledRolled() {
        MilitaryEquipment militaryEquipment1 = new MilitaryEquipment();
        militaryEquipment1.addMilitary_equipment();
        var result = militaryEquipment1.sortByTypeOfArmorStreeledRolled();
        Assertions.assertTrue(result.get(0).typeOfArmor == "streeled_rolled");
        Assertions.assertTrue(result.get(1).typeOfArmor == "streeled_rolled");
    }

    @Test
    void sortByTypeOfBulletproof() {
        MilitaryEquipment militaryEquipment1 = new MilitaryEquipment();
        militaryEquipment1.addMilitary_equipment();
        var result = militaryEquipment1.sortByTypeOfArmorBulletProof();
        Assertions.assertTrue(result.get(0).typeOfArmor == "bulletproof");

    }

    @Test
    void sortByTypeOfCombinedMultilayer() {
        MilitaryEquipment militaryEquipment1 = new MilitaryEquipment();
        militaryEquipment1.addMilitary_equipment();
        var result = militaryEquipment1.sortByTypeOfArmorCombinedMultilayer();
        Assertions.assertTrue(result.get(0).typeOfArmor == "combined_multilayer");


    }
}
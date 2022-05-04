package ua.lviv.iot.military_equipment;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.military_equipment.types.*;
import ua.lviv.iot.military_equipment.WheeledMilitaryEquipment;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class WheeledMilitaryEquipmentTest {
    private WheeledMilitaryEquipment wheeledMilitaryEquipment;
    private ArrayList<WheeledMilitaryEquipment> wheeledMilitaryEquipments;


    @BeforeEach
    void setUp() throws Exception{
        wheeledMilitaryEquipment = new WheeledMilitaryEquipment();
        wheeledMilitaryEquipments = new ArrayList<WheeledMilitaryEquipment>();
        wheeledMilitaryEquipments.add(new APC("btr60", 100, 2, 116,
                "streeled_rolled"));
        wheeledMilitaryEquipments.add(new CRPV(20, 7, 5.75, 2.35, 2.395,
                4, 30, "combined_multilayer", 50) );

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addWheeledMilitaryEquipment() {
        WheeledMilitaryEquipment wheeledMilitaryEquipment1 = new WheeledMilitaryEquipment();
        wheeledMilitaryEquipment1.addWheeledMilitaryEquipment();
        var result = wheeledMilitaryEquipment1.addWheeledMilitaryEquipment();
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(wheeledMilitaryEquipments.get(0).fuelConsumption,
                result.get(0).fuelConsumption);
        Assertions.assertEquals(wheeledMilitaryEquipments.get(1).fuelConsumption,
                result.get(1).fuelConsumption);


    }

    @Test
    void foundMilitaryEquipment() {
        WheeledMilitaryEquipment wheeledMilitaryEquipment1 = new WheeledMilitaryEquipment();
    var result =
        wheeledMilitaryEquipment1.foundMilitaryEquipment(30);
    Assertions.assertEquals(1, result.size());
    Assertions.assertEquals(wheeledMilitaryEquipments.get(1).fuelConsumption,
            result.get(0).fuelConsumption);

    }
}
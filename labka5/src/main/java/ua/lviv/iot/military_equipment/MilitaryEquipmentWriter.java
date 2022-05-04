package ua.lviv.iot.military_equipment;

import ua.lviv.iot.military_equipment.types.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class MilitaryEquipmentWriter {

        public static void writeCSV() throws IOException {
            try (FileWriter writer = new FileWriter("result.csv")) {
                String previousClassName = "";
                ArrayList<MilitaryEquipment> militaryEquipments = new ArrayList<>();
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
                for (var militaryEquipment : militaryEquipments) {
                    if (!militaryEquipment.getClass().getSimpleName().equals(previousClassName)) {
                        writer.write(militaryEquipment.getHeaders());
                        writer.write("\r\n");
                        previousClassName = militaryEquipment.getClass().getSimpleName();
                    }

                    writer.write(militaryEquipment.toCSV());
                    writer.write("\r\n");


                }
            }
        }
    }


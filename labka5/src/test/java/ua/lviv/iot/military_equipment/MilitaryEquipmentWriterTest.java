package ua.lviv.iot.military_equipment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
class MilitaryEquipmentWriterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void writeCSV() throws IOException {
        try (FileReader expectedReader = new FileReader("src/test/resources/expectedResult.csv");
             BufferedReader expectedBR = new BufferedReader(expectedReader);
             FileReader actualReader = new FileReader("result.csv");
             BufferedReader actualBR = new BufferedReader(actualReader);) {
            Assertions.assertEquals(expectedBR.readLine(), actualBR.readLine());
        }
    }

//    public String getAllLines(String fileName) throws IOException {
//        FileReader fr = new FileReader(fileName);
//        BufferedReader br = new BufferedReader(fr);
//        String line;
//        StringBuilder allLines = new StringBuilder();
//        while ((line = br.readLine()) != null) {
//            allLines.append(line);
//        }
//        return allLines.toString();
//    }
//
//    @Test
//    public void writeCSV()throws IOException{
//        Assertions.assertEquals(getAllLines("src/test/resources/expectedResult.csv"),
//                getAllLines("result.csv"));

    //}
}
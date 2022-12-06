package fhtw.inch_to_centimeter_yard_to_meter.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class YardToMeterTest {

    private final YardToMeterService yardToMeterService = new YardToMeterService();


    /**
     * Tests that the message was sent to the server
     */
    @Test
    void testPost() {


        //Given
        Double testNum = 1.0;

        //When
        yardToMeterService.setYard(testNum);

        //Then
        assertEquals(testNum, yardToMeterService.getYard());

    }

    /**
     * Tests that the message was deleted
     */
    @Test
    void testMeter () {

        //Given
        Double testNum = 1.0;
        Double testNumConverted = (testNum / 1.094);

        //When
        yardToMeterService.setYard(testNum);
        yardToMeterService.calculateYardToMeter();

        //Then
        assertEquals(testNumConverted, yardToMeterService.getYard());
    }

}

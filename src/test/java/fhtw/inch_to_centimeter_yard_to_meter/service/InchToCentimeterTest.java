package fhtw.inch_to_centimeter_yard_to_meter.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InchToCentimeterTest {

    private final InchToCentimeterService inchToCentimeterService = new InchToCentimeterService();


    /**
     * Tests that the message was sent to the server
     */
    @Test
    void testPost() {


        //Given
        Double testNum = 1.0;

        //When
        inchToCentimeterService.setNumber(testNum);

        //Then
        assertEquals(testNum, inchToCentimeterService.getNumber());

    }

    /**
     * Tests that the message was deleted
     */
    @Test
    void testCentimeter () {

        //Given
        Double testNum = 1.0;
        Double testNumConverted = (testNum * 2.54);

        //When
        inchToCentimeterService.setNumber(testNum);
        inchToCentimeterService.calculateInchToCentimeter();

        //Then
        assertEquals(testNumConverted, inchToCentimeterService.getNumber());
    }

}

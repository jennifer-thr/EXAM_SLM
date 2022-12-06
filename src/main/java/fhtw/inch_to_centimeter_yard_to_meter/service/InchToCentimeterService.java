package fhtw.inch_to_centimeter_yard_to_meter.service;

import fhtw.inch_to_centimeter_yard_to_meter.dto.InchToCentimeter;
import org.springframework.stereotype.Service;

@Service
public class InchToCentimeterService {

    private final InchToCentimeter inchToCentimeter = new InchToCentimeter();

    /**
     * @param toCentimeter The message to set on the controller.
     */
    public void setNumber(Double toCentimeter) {
        this.inchToCentimeter.setNumber(toCentimeter);
    }

    public float getNumber() {
        return inchToCentimeter.getNumber();
    }

    public void deleteNumber() {
        inchToCentimeter.resetNumber();
    }

    public Float calculateInchToCentimeter() {

        return inchToCentimeter.calculateInchToCentimeter();

    }

}

package fhtw.inch_to_centimeter_yard_to_meter.service;

import fhtw.inch_to_centimeter_yard_to_meter.dto.YardToMeter;
import org.springframework.stereotype.Service;

@Service
public class YardToMeterService {

    private final YardToMeter yardToMeter = new YardToMeter();

    /**
     * @param toMeter The message to set on the controller.
     */
    public void setNumber(Double toMeter) {
        this.yardToMeter.setNumber(toMeter);
    }

    public float getNumber() {
        return yardToMeter.getNumber();
    }

    public void deleteNumber() {
        yardToMeter.resetNumber();
    }

    public Float calculateYardToMeter() {

        return yardToMeter.calculateYardToMeter();

    }

}

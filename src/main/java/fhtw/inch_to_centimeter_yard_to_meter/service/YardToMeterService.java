package fhtw.inch_to_centimeter_yard_to_meter.service;

import fhtw.inch_to_centimeter_yard_to_meter.dto.YardToMeter;
import org.springframework.stereotype.Service;

@Service
public class YardToMeterService {

    private final YardToMeter yardToMeter = new YardToMeter();

    /**
     * @param toMeter The message to set on the controller.
     */
    public void setYard(Double toMeter) {
        this.yardToMeter.setYard(toMeter);
    }

    public float getYard() {
        return yardToMeter.getYard();
    }

    public void deleteNumber() {
        yardToMeter.resetNumber();
    }

    public Float calculateYardToMeter() {

        return yardToMeter.calculateYardToMeter();

    }

}

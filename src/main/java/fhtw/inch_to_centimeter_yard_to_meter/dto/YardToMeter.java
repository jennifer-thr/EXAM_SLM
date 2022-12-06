package fhtw.inch_to_centimeter_yard_to_meter.dto;

public class YardToMeter {

    private double yardToMeter = 0;

    /**
     * @param toCentimeter The message to set on the controller.
     */
    public void setNumber(double toCentimeter) {
        yardToMeter = toCentimeter;
    }

    public float getNumber() {
        return (float) yardToMeter;
    }

    public void resetNumber() {
        this.yardToMeter = 0;
    }

    public float calculateYardToMeter() {
        this.yardToMeter = (this.yardToMeter / 1.094);
        return (float) yardToMeter;
    }

}

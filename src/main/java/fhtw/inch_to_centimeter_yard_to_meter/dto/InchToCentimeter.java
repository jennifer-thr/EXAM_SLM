package fhtw.inch_to_centimeter_yard_to_meter.dto;

public class InchToCentimeter {

    private double inchToCentimeter = 0;

    /**
     * @param toCentimeter The message to set on the controller.
     */
    public void setNumber(double toCentimeter) {
        inchToCentimeter = toCentimeter;
    }

    public float getNumber() {
        return (float) inchToCentimeter;
    }

    public void resetNumber() {
        this.inchToCentimeter = 0;
    }

    public float calculateInchToCentimeter() {
        this.inchToCentimeter = (this.inchToCentimeter * 2.54);
        return (float) inchToCentimeter;
    }

}

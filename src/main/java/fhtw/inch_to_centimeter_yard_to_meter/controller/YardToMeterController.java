package fhtw.inch_to_centimeter_yard_to_meter.controller;

import fhtw.inch_to_centimeter_yard_to_meter.service.YardToMeterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YardToMeterController {

    private final YardToMeterService yardToMeterService;

    public YardToMeterController(YardToMeterService yardToMeterService) {

        this.yardToMeterService = yardToMeterService;

    }

    @PostMapping("/setYard/{toMeter}")
    Float setYard(@PathVariable Float toMeter) {

        yardToMeterService.setYard(Double.valueOf(toMeter));

        return toMeter;

    }

    @GetMapping("/getYard")
    Float getYard() {

        return yardToMeterService.getYard();

    }

    @GetMapping("/doConversionMeter")
    Float calculateYardToMeter() {

        return yardToMeterService.calculateYardToMeter();

    }

}

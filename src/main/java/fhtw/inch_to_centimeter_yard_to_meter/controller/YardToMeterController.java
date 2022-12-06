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

    @PostMapping("/setNumber/{toMeter}")
    Float setNumber(@PathVariable Float toMeter) {

        yardToMeterService.setNumber(Double.valueOf(toMeter));

        return toMeter;

    }

    @GetMapping("/getNumber")
    Float getNumber() {

        return yardToMeterService.getNumber();

    }

    @GetMapping("/doConversion")
    Float calculateYardToMeter() {

        return yardToMeterService.calculateYardToMeter();

    }

}

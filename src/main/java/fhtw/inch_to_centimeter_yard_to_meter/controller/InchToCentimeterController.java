package fhtw.inch_to_centimeter_yard_to_meter.controller;

import fhtw.inch_to_centimeter_yard_to_meter.service.InchToCentimeterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InchToCentimeterController {

    private final InchToCentimeterService inchToCentimeterService;

    public InchToCentimeterController(InchToCentimeterService inchToCentimeterService) {

        this.inchToCentimeterService = inchToCentimeterService;

    }

    @PostMapping("/setNumber/{toCentimeter}")
    Float setNumber(@PathVariable Float toCentimeter) {

        inchToCentimeterService.setNumber(Double.valueOf(toCentimeter));

        return toCentimeter;

    }

    @GetMapping("/getNumber")
    Float getNumber() {

        return inchToCentimeterService.getNumber();

    }

    @GetMapping("/doConversion")
    Float calculateInchToCentimeter() {

        return inchToCentimeterService.calculateInchToCentimeter();

    }

}

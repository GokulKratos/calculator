package com.calc.controller;

import com.calc.model.Calculator;
import com.calc.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/doMath")
    public Integer doMath(@RequestBody Calculator calculator){
        return calculatorService.doMath(calculator);
    }
}

package com.calc.service;

import com.calc.model.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Integer doMath(Calculator calc){
        return switch (calc.getOperation()) {
            case "+" -> calc.getFirstNumber() + calc.getSecondNumber();
            case "-" -> calc.getFirstNumber() - calc.getSecondNumber();
            case "*" -> calc.getFirstNumber() * calc.getSecondNumber();
            case "/" -> calc.getFirstNumber() / calc.getSecondNumber();
            default -> null;
        };
    }
}

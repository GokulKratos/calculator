package com.calc.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Calculator {

    private Integer firstNumber;
    private Integer secondNumber;
    private String operation;
}

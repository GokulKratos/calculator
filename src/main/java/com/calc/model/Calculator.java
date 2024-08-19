package com.calc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class Calculator {

    private Integer firstNumber;
    private Integer secondNumber;
    private String operation;
}

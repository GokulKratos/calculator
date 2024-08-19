package com.calc.service;

import com.calc.model.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceTest {

    @Test
    public void testDoMath(){
        CalculatorService calculatorService = new CalculatorService();
        int add = calculatorService.doMath(new Calculator(Integer.valueOf(5),Integer.valueOf(5),"+"));
        int sub = calculatorService.doMath(new Calculator(Integer.valueOf(5),Integer.valueOf(5),"-"));
        int mul = calculatorService.doMath(new Calculator(Integer.valueOf(5),Integer.valueOf(5),"*"));
        int div = calculatorService.doMath(new Calculator(Integer.valueOf(5),Integer.valueOf(5),"/"));
        assertEquals(10,add);
        assertEquals(0,sub);
        assertEquals(25,mul);
        assertEquals(1,div);
    }
}

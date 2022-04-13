package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataProviders;

public class MultiplicationTest extends CalculatorTest{

    private Calculator calculator = new Calculator();

    @Test(dataProvider = "numberForCalculatorMultiplicationData", dataProviderClass = DataProviders.class, description = "Тут мы умножаем.",
            priority = 3, invocationCount = 5, threadPoolSize = 4)
    public void multiplicationTest(int a, int b, int expected) {
        Assert.assertEquals(calculator.multiplication(a, b), expected);
    }
}

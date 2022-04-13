package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataProviders;

public class SubtractionTest extends CalculatorTest{

    private Calculator calculator = new Calculator();

    @Test(dataProvider = "numberForCalculatorSubtractionData", dataProviderClass = DataProviders.class, description = "Тут мы вычитаем.",
            priority = 2, invocationCount = 5, threadPoolSize = 5)
    public void subtractionTest(int a, int b, int expected) {
        Assert.assertEquals(calculator.subtraction(a, b), expected);
    }
}

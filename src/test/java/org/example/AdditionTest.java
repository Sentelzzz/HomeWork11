package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataProviders;

public class AdditionTest extends CalculatorTest{

    private Calculator calculator = new Calculator();

    @Test(dataProvider = "numberForCalculatorAdditionData", dataProviderClass = DataProviders.class, description = "Тут мы складываем.",
            priority = 1, invocationCount = 5, threadPoolSize = 2)
    public void additionTest(int a, int b, int expected) {
        Assert.assertEquals(calculator.addition(a,b), expected);
    }

    @Test(priority = 2)
    public void additionSecondTest() {
        Assert.assertEquals(calculator.addition(4, 6), 10);
    }

}

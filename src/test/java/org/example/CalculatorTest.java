package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.TestListener;

@Listeners(TestListener.class)
public class CalculatorTest {

    private static int numberOfTest = 1;


    @BeforeMethod
    public void startLine() {
        System.out.println("______________________________TEST" + " " + numberOfTest + " " + "START______________________________");
    }

    @AfterMethod
    public void finishLine() {
        System.out.println("______________________________TEST" + " " + numberOfTest++ + " " + "FINISH_____________________________");
    }


}

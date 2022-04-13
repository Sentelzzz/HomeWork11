package utils;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider
    public static Object[][] numberForCalculatorAdditionData() {
        return new Object[][] {
                {2, 2, 4},
                {3, 4, 7},
                {4, 7, 11},
                {5, 5, 10},
                {4, 8, 12},
        };
    }

    @DataProvider
    public static Object[][] numberForCalculatorSubtractionData() {
        return new Object[][] {
                {2, 2, 0},
                {4, 2, 2},
                {7, 4, 3},
                {10, 9, 1},
                {4, 3, 1},
        };
    }

    @DataProvider
    public static Object[][] numberForCalculatorMultiplicationData() {
        return new Object[][] {
                {2, 2, 4},
                {3, 3, 9},
                {2, 4, 8},
                {4, 4, 16},
                {5, 5, 25},
        };
    }

    @DataProvider
    public static Object[][] numberForCalculatorDivisionData() {
        return new Object[][] {
                {2, 2, 1},
                {2, 0, 0},
                {4, 2, 2},
                {9, 3, 3},
                {8, 4, 2},
        };
    }

}

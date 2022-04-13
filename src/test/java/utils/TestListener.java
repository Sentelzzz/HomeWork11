package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.concurrent.TimeUnit;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(String.format("================ STARTING TEST %s ================", result.getName()));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(String.format("================ FINISHED TEST %s Duration: %ss ================", result.getName(),
                result.getEndMillis()));
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(String.format("================ FAILED TEST %s Duration: %ss ================", result.getName(),
                getExecutionTame(result)));
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println(String.format("================ SKIPPING TEST %s Duration: %ss ================", result.getName(),
                getExecutionTame(result)));
    }

    private long getExecutionTame(ITestResult result) {
        return TimeUnit.MILLISECONDS.toSeconds(result.getEndMillis() - result.getStartMillis());
    }
}

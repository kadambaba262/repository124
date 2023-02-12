package demowebshop_Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import demowebshop_baseclass.Demo_baseclass;

//public class Listners extends Demo_baseclass implements ITestListener {
public class Listners extends TestListenerAdapter {
	public void onTestStart(ITestResult itr) {

		System.out.println("Listeners class --- onTestStart");
	}

	public void onTestSuccess(ITestResult itr) {

		System.out.println("Listeners class --- onTestSuccess");

	}

	public void onTestFailure(ITestResult itr) {

		System.out.println("Listeners class --- onTestFailure");

	}

}

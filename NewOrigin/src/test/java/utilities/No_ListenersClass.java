package utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import test.No_Basetest;

public class No_ListenersClass extends No_Basetest implements ITestListener {
	No_Screenshot ref;

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("t3f");
		
		String name=result.getName();
		
		 ref=new No_Screenshot ();
		 try {
			ref.screen(driver, name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}

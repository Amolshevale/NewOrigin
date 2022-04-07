package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.No_Page1;

//NewOrigin

public class No_Page1test extends No_Basetest {
	No_Page1 page1;
	@Test
	public void test1() throws InterruptedException {
		
		page1=new No_Page1();
		
		page1.initElement(driver);


	}
	
	@Test
	public void test2() throws InterruptedException {
		page1.cred(user, pass);
		Assert.assertTrue(false);

	}
		
	

}

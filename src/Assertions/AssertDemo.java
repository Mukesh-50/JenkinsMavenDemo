package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	
	
	@Test(description="This TC verify Home Page Title")
	public void test1(){
		
		// Case Sensitive
		try
		{
			Assert.assertEquals("Toolsqa", "Toolsqa.com");
		} 
		catch (Error e) 
		{
			System.out.println("Verification Failed");
		}
		
		/*
		 * 
		 * Continue 
		 * 
		 */
		
	}
	
	@Test(description="This TC verify dropdown Count")
	public void test2(){
		
		Assert.assertEquals(10, 12,"Dropdown Verification failed");
		
	}
	
	
	@Test(description="This TC verify whether checkbox is enabled")
	public void test3(){
		
		Assert.assertTrue(true);
		
		
	}

}

package testngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test123 {
	
	
	@Test
	@Parameters({"firstname","lastname","email"})
	public void test1(String first,String last, String email){
		
		System.out.println(first);
		System.out.println(last);
		System.out.println(email);
	
	}
	
	
	@Test
	@Parameters({"email"})
	public void test2( String email){	
	System.out.println("running test case 2 "+email);
		
	}

}

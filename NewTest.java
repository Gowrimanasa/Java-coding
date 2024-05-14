package testNGtestcases;

import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testing.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class NewTest {
	
	boolean res;
	
	@DataProvider	
	public Object[][] dp() {
	 return new Object[][] 
			 new bject [] {"abc","ddd"},
			 new object [] {"tomsmith" , "SuperSecretPassword!"};
			 
			 }
	
Public void login(String u, String p) {
	  
	System.out.println("Username:" + "password " + p);
		
 res = u.equals("tomsmith") ? true: false;
	
AssertJUnit.assertEquals(true,res);

}
}
	
	
		

	

	

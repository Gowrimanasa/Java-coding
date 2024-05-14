package testNGtestcases;

import org.testng.annotations.parameters;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
   public class secondClass {
	
	@parameters({"browser"})
	
    @Test
    public void d(string browserchoice) {
	  
    System.out.println("I am in second method d + browserchoice");
    
    public void e(string browserchoice1) {
    	
     System.out.println(" I am in Second method e +browserchoice");
    
  }
  
     
 } 
}

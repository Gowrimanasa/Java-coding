package HKpages1;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LandingPage1 {
	static WebDriver driver;
	boolean res;
	public void LandingPage(WebDriver driver)
	{
		LandingPage.driver=driver;
		
	}
By flashsuccess = By.xpath("//*[@class=\"flash success\"]");

//method to check if success msg is displayed

public boolean isLoginSuccess()
{
	
  try
  {
     
	   driver.findElement(flashsuccess );
	   res = true;
  }
  
  catch (NoSuchElementException n )
  {
	  res = false;
	  
  }
  return res;  

}


}



package HKPages;

import org.openqa.Selenium.By;
import org.openqa.selenim.NoSuchElementException;
import org.openqa.selenium.WebDriver;



public class LandingPage {
	static WebDriver driver;
	boolean res;
	public LandingPage(WebDriver driver)
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
package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch_Swiggy_Test
{
	@Test
	public  void sugar() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		Reporter.log("swiggy launched sucessfully",true);
		Thread.sleep(2000);
		driver.quit();
		

	}
}

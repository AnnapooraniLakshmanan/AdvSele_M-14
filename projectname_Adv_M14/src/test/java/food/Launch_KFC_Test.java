package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch_KFC_Test 
{
	@Test
	public  void sugar() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.kfc.co.in/");
		Reporter.log("KFC launched sucessfully",true);
		Thread.sleep(2000);
		driver.quit();
		

	}
}

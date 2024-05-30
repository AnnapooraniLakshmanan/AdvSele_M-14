package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch_Zomato_Test 
{
	@Test
	public  void sugar() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/chennai");
		Reporter.log("zomato launched sucessfully",true);
		Thread.sleep(2000);
		driver.quit();
		

	}
}

package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch_purple_Test 
{
	@Test
	public  void sugar() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.purplle.com/");
		String url=System.getProperty("url");
		driver.get(url);
		Reporter.log("purple launched sucessfully",true);
		Thread.sleep(2000);
		driver.quit();
		

	}
}

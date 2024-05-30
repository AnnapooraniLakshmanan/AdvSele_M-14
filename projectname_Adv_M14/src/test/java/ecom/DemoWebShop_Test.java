package ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoWebShop_Test 
{
	@Test
	public void launch() throws InterruptedException
	{
	Reporter.log("testNG installed",true);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Reporter.log("window is maximized!!!",true);
	driver.get("https://demowebshop.tricentis.com/");
	Reporter.log("Demowebshop is launched",true);
	Thread.sleep(2000);
	driver.quit();
	Reporter.log("browser is closed",true);
	}
}

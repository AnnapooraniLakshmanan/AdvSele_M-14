package ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Script02_Test
{
	@Test
	public void launch() throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.partialLinkText("Computers")).click();
	driver.findElement(By.partialLinkText("Desktops")).click();
	driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[1]")).click();
	driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[1]")).click();
	Thread.sleep(2000);
	driver.quit();
	}
}

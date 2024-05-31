package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch_Lakme 
{
	@Test
	public  void lakme() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lakmeindia.com/?utm_source=google&utm_medium=cpc&utm_campaign=PUB_Lakme-Colours_Google_DTC_Search_Brand_NA_Sales_NA_Overall_23rdJan2024&utm_content=Brand_Exact&utm_term=lakme&gad_source=1&gclid=CjwKCAjwx-CyBhAqEiwAeOcTdWjRf6tJ8XqNvoFq8uEsc53lupsq1Rp_C4zlrgNqsgtCFWFw-WbQcBoCAKoQAvD_BwE");
		Reporter.log("Lakme launched sucessfully",true);
		Thread.sleep(2000);
		driver.quit();
		

	}
}

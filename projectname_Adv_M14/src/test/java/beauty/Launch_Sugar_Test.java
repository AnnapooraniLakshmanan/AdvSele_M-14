package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch_Sugar_Test
{
	@Test
	public  void sugar() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.sugarcosmetics.com/?utm_source=google&utm_medium=search&utm_campaign=17164953316&adgroupid=136382391996&utm_content=646586460881&utm_term=sugar%20cosmetics&gad_source=1&gclid=Cj0KCQjw6PGxBhCVARIsAIumnWb-Eq_DsbTycpr9tQ_zmfeZElMSfyrOK9v11V7EeRQigYRLsYJ17oQaAnKZEALw_wcB");
		Reporter.log("sugar launched sucessfully",true);
		Thread.sleep(2000);
		driver.quit();
		

	}
}

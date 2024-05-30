package beauty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Launch_Nykaa_Test {

	@Test
	public  void nykaa() throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/sp/pink-summer-coming-soon/pink-summer-coming-soon?utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa&gad_source=1&gclid=Cj0KCQjw6PGxBhCVARIsAIumnWYA8rrsZiCeBqdhplGLLQy3tLbfycg4DHJ9YPswYVDq8biD14Dp2m4aAs7wEALw_wcB");
		Reporter.log("Nykaa launched sucessfully",true);
		Thread.sleep(2000);
		driver.quit();
		

	}

}

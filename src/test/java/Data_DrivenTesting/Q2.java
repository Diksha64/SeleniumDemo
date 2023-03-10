package Data_DrivenTesting;


import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Q2 {
	
	WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	public void open(String br) {
		if(br.equals("Chrome")) {
			  driver =new ChromeDriver();
			  driver.get("https://flipkart.com");
			  driver.manage().window().maximize();
		  }
		  else if(br.equals("Edge")) {
			  driver =new EdgeDriver();
			  driver.get("https://flipkart.com");
			  driver.manage().window().maximize();
		  }
		  else {
			  driver =new FirefoxDriver();
			  driver.get("https://flipkart.com");
			  driver.manage().window().maximize();
		  }
		
	}
  @Test(priority =1)
  public void Count() {
	 List<WebElement> lc=driver.findElements(By.tagName("a"));
	 System.out.println("Number of links on the homepage of flipkart: "+lc.size());
  }
  
  @Test(priority =1)
  public void link_URL() {
	 List<WebElement> lu=driver.findElements(By.tagName("a"));
	 
	 for(WebElement x:lu) {
		 System.out.println("Text: "+x.getText());
		 System.out.println("URL: "+x.getAttribute("href"));
	 }
	 
  }
  
  
  @AfterClass
  public void exit() {
	  driver.close();
  }
}

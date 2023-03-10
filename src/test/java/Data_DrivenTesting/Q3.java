package Data_DrivenTesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q3 {
	
	WebDriver driver;
  @BeforeClass
  @Parameters("browser")
  public void openB(String br) {
	  if(br.equals("Chrome")) {
		  WebDriverManager.chromedriver().setup();
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
	  }
	  else if(br.equals("Edge")) {
		  WebDriverManager.edgedriver().setup();
		  driver =new EdgeDriver();
		  driver.manage().window().maximize();
	  }
	  else {
		  WebDriverManager.firefoxdriver().setup();
		  driver =new FirefoxDriver();
		  driver.manage().window().maximize();
	  }
  }
  @Test
  public void OUrl() {
	  driver.get("http://www.fb.com");
	  System.out.println(driver.getTitle());
  }
  @AfterClass
  public void Clo() {
	  driver.quit();
  }
}

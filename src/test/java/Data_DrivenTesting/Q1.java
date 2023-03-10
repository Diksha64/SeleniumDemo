package Data_DrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Q1 {
	WebDriver driver;
  @BeforeClass
  public void Login() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.fb.com");
  }
  @Test(priority =1)
  public void URLS() {
	  String a=driver.getCurrentUrl();
	  Assert.assertEquals(a,"https://www.facebook.com/");
  }
  
  @Test(priority = 2)
  public void CA() {
	  driver.findElement(By.linkText("Create new account")).isDisplayed(); 
  }
  
  @Test(priority = 3)
  public void Values() {
	  driver.findElement(By.linkText("Create new account")).click();
	  driver.findElement(By.linkText("First name")).sendKeys("Diksha");
	  driver.findElement(By.linkText("Surname")).sendKeys("Jaswal");
	  driver.findElement(By.xpath("//input[@id='u_3_g_Lr']")).sendKeys("768772366");
	  driver.findElement(By.xpath("//input[@id='u_3_g_Lr']")).sendKeys("7625243111");
	  driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("H$GFDF#shh1");
  }
  
  @Test(priority = 4)
  public void DOB() {
	  Select drp1 = new Select(driver.findElement(By.xpath("//select[@id='day']")));
	  drp1.selectByIndex(14); 
	  Select drp2 = new Select(driver.findElement(By.xpath("//select[@id='month']")));
	  drp2.selectByValue("Mar"); 
	  Select drp3 = new Select(driver.findElement(By.xpath("//select[@id='year']")));
	  drp3.selectByValue("2002"); 
	  
  }
  @Test(priority = 5)
  public void Gen() {
	  driver.findElement(By.xpath("//label[@for='u_3_4_JE']")).click();
	  
  }
  @Test(priority = 6)
  public void Signup() {
	  driver.findElement(By.xpath("//button[@id='u_3_s_Fh']")).click();
	  
  }
 
  @Test(priority = 7)
  public void AC() {
	  if(driver.getTitle()!= "https://www.facebook.com/") {
		  System.out.println("Page Created successfully!!");
	  }
  }
  @AfterClass
  public void Exit() {
	  driver.close();
  }
}

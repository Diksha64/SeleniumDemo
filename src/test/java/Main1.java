import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
				//Open url https://auth.geeksforgeeks.org/
				driver.get("https://auth.geeksforgeeks.org/");
				
				//Enter user name 
				WebElement usernametxt = driver.findElement(By.id("luser"));
				usernametxt.sendKeys("isha623834@gmail.com");
				//driver.findElement(By.id("luser")).sendKeys("diksha@bebotechnologies.com");
				
				//Enter password
				driver.findElement(By.id("password"));
				usernametxt.sendKeys("Er.ishasharma@;");
				
				//Click on login
				driver.findElement(By.className("signin-button")).click();
				
				//Capture title of the page
				String title = driver.getTitle();
				String actualTitle = "Login GeeksforGeeks";
				
				System.out.println(title);
				
				//Verifying the title 
				if(actualTitle.equals(title)) {
					System.out.println("Test passed");
				}
				else {
					System.out.println("Test failed");
				}
				driver.close();
				//Close driver
				//driver.close();

	}

}

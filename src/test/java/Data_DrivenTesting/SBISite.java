package Data_DrivenTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SBISite {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		
		driver.manage().window().maximize();
		
		String file = System.getProperty("user.dir")+"\\DataFiles\\SBI.xls";
		int rows =XUtil.getRow(file,"Sheet1");
		
		for(int i=1;i<=rows;i++) {
			String princ = XUtil.getCellData(file,"Sheet1",i,0);
			String roi = XUtil.getCellData(file,"Sheet1",i,1);
			String per1 = XUtil.getCellData(file,"Sheet1",i,2);
			String per2 = XUtil.getCellData(file,"Sheet1",i,3);
			String fre = XUtil.getCellData(file,"Sheet1",i,4);
			String mv = XUtil.getCellData(file,"Sheet1",i,5);
			
			driver.findElement(By.id("principal")).sendKeys(princ);
			driver.findElement(By.id("interest")).sendKeys(roi);
			driver.findElement(By.id("tenure")).sendKeys(per1);
			
			Select perdrp = new Select(driver.findElement(By.id("tenurePeriod")));
			perdrp.selectByVisibleText(per2);
			
			Select fredrp = new Select(driver.findElement(By.id("frequency")));
			perdrp.selectByVisibleText(fre);
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement cal_btn = driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']"));
			
			
		}

	}

}

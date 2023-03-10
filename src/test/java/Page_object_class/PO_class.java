package Page_object_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PO_class {
	
	WebDriver driver;
	
	PO_class(String driver) {
		//this.driver=driver;
		//PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(xpath="//img[@alt='company-branding']")//image
	WebElement img_logo;
	
	@FindBy(name="username")//name
	WebElement u_name;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit_btn;
	
	//Actions
	public void setuname(String name) {
		u_name.sendKeys("abc");
	}
	
	
}

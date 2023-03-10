package Annotations_Sel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
  @BeforeMethod
  public void Login() {
	  System.out.println("login");
  }
  
  @Test(priority=1)
  public void search() {
	  System.out.println("Search");
  }
  
  @AfterMethod
  public void Logout() {
	  System.out.println("Logout");
  }
  
  @Test
  public void l1() {
	  System.out.println("Login1");
  }
  @Test(priority=2)
  public void ADSearch() {
	  System.out.println("Advanced search");
  }
  
  @Test(priority = 3)
  public void lo1() {
	  System.out.println("Logout1");
  }
  
  
}

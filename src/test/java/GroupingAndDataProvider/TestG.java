package GroupingAndDataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestG {
  @Test(priority=1,groups = {"Sanity","Regression"})
  public void LoginByEmail() {
	  System.out.println("Login by email");
  }
  @Test(priority=2,groups = {"Sanity"})
  public void LoginByFB() {
	  System.out.println("Login by facebook");
  }
  @Test(priority=3,groups = {"Sanity"})
  public void LoginByTwitter() {
	  System.out.println("Login by Twitter");
  }

}

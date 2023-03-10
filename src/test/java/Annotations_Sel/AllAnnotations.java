package Annotations_Sel;

import org.testng.annotations.*;

public class AllAnnotations {
	@BeforeTest
	public void BT() {
	  System.out.println("Executing before test");
	}
	@AfterTest
	public void AT() {
	  System.out.println("Executing after test");
	}
	@BeforeSuite
	public void BS() {
	  System.out.println("Executing before suite");
	}
	@AfterSuite
	public void AS() {
	  System.out.println("Executing After suite");
	}
  @BeforeClass
	public void BC() {
	  System.out.println("Executing before class");
	}
	@AfterClass
	public void AC() {
	  System.out.println("Executing After class");
	}
	@BeforeMethod
	public void BM() {
	  System.out.println("Hello");
	}
	@AfterMethod
	public void AM() {
	  System.out.println("Bye");
	}
	 @Test
	  public void f1() {
		  System.out.println("Test1");
	  }
  @Test
  public void f2() {
	  System.out.println("Test2");
  }
}

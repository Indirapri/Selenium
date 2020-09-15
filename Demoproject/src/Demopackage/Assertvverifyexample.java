package Demopackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertvverifyexample {
   /* @Test
	public void asserttest() {
		System.out.println("before assertion");
		Assert.assertEquals(false, true);
		System.out.println("after assertion");*/
		
	
	//}
	
	@Test
	public void verify() {
		System.out.println("before verify statement");
		SoftAssert assert1=new SoftAssert();
		System.out.println("before verify statement");
		assert1.fail();
		System.out.println("after verify statement");
	}

	@Test
	  public void test1() {
		  
		  System.out.println("test");
	  }
}

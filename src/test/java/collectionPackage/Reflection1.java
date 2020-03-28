package collectionPackage;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Reflection1 {
	
	@BeforeMethod
	public void before(Method m)
	{
		System.out.println(m.getName()+" started execution");
	}
	
	@AfterMethod
	public void after(ITestResult result)
	{
		System.out.println(result.getName()+" finished execution");
	}
	
	@Test
	public void login()
	{
		System.out.println("Login to the tool");
	}
	
	
}

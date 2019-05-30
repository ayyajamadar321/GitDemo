package qaclickacademy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng2Test 
{

	@Test
	public void Desktop()
	{
		System.out.println("Desktop");
	}
	
	@Test
	public void Laptop()
	{
		System.out.println("Laptop");
	}
	
	@Test
	public void Mobile()
	{
		System.out.println("Mobile");
	}
}

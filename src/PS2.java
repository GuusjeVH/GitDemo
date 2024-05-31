import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS2 extends PS {
//the extends method makes sure that that PS is the parent class, so the child class can acquire the properties of its parent class
	//inheritance
	//single responsibility principle
	
	@Test
	public void testRun()
	{
		//parameterized constructor
		PS3 ps3 = new PS3(3); //create an object of our class PS3, so that we can use the methods that are present in the PS3 class
		int a = 3;
		doThis();  //we can call this method even though it's in another class (without creating an object), because we used the EXTENDS key word
		System.out.println(ps3.increment());
		System.out.println(ps3.decrement());
		
		System.out.println(ps3.multiplyThree());
		
		
	}

}


public class PS3 extends PS4 {
	
	int a; //this is a class variable
	
	
	public PS3(int a) { //this int a is an instance variable, so it is not the same as the one above, the class variable
		//so to execute the methods below, increment and decrement and adding the correct variable, you need to call the THIS. method. 
		// TODO Auto-generated constructor stub
		//this is a constructor, this has been created because we created an object of this class in our other class PS2 and gave it a parameter
		super(a); //when you call SUPER, your parent class instructor is invoked > so Super will got to parent class (class after EXTENDS in current class)
		//super keyword is only used when there is inheritance in place
		//you always have to make sure your super keyword is invoked first in your constructor, so it should be the first line
		this.a = a; //the THIS key word refers to the class variable
	}
	public int increment()
	{
		a = a + 1;
		return a;
		
	}
	public int decrement()
	{
		a = a - 1;
		return a;
	}
	

}

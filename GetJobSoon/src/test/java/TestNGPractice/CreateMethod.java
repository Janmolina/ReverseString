package TestNGPractice;

public class CreateMethod {

	public static void main(String[] args) {
		
		// How to create a method in java with and object
		// and return String
		
		//video 29
		//why method
		
		//2. create an object for the class
		CreateMethod d = new CreateMethod();
		String name = d.getData();
		System.out.println(name);
		// create a method creating another class
		CreateMethod2 d1 = new CreateMethod2();  // we create another method for particular class CreateMethod1
		// creating a method with return type (string)
		d1.getData();
		// create a method with Static
		getData2();
		
	}
	
	//1. first create the method
	public String getData()  // void not returns method --> public void get Data()
	{
	System.out.println("Hello World");	
	return "jan";
	}
	
	public static String getData2()  // void not returns method --> public void get Data()
	{
	System.out.println("Hello World");	
	return "jan";

	}
}



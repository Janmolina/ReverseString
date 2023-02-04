package TestNGPractice;

public class declareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Interview video 28
		
		// string is an object that represents sequences of characters  // String literal
		// how many ways you can create a string Literal
		// using memory locate operator --> String object
		
		String s5 = "Jandery";
		String s1= "Jandery";
		
		
		//new
		String s2= new String ("welcome");
		
		
		//Split--> separar
		//Trim--> Recortar
		
		// how to split an string-  using the keyword split = separar 
		String s = "Jandery Melissa Molina";
		String [] splittedString = s.split("Melissa");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		
		//Recorta el espacio
		System.out.println(splittedString[1].trim());
		
		for (int i=0; i<s.length(); i++)
		{
			System.out.println (s.charAt(i));
		}
		
	
		

	}

}

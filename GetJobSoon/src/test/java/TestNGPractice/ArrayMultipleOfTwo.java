package TestNGPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMultipleOfTwo {

	public static void main(String[] args) {

		// video 27 Undemy
	int [] arr2	= {1,2,4,5,6,7,8,9, 10, 122};
	
	//2,4,6,8,10,122 --> looking for the values divide by 2
	//Check if array has multiple of 2
	
	for (int i=0;  i<arr2.length; i++) // repeat this loop until to find the size of the elements
	{	
	
		if(arr2[i] %2 ==0)  // if you wants to compares numbers in java or 2 integers use == 
	
	{
		System.out.println(arr2[i]);
		//break;
	}
	
	else
	{
	System.out.println(arr2[i] + "is not multiple of 2");
	}
}
	
	// creating an object from array- object.metod
	
	ArrayList <String> a = new ArrayList<String>();
	a.add("raul");
	a.add("Molina");
	a.add("selenium");
	a.add("academy");
	//System.out.println(a.remove(2)); // remove an array
	 System.out.println(a.get(3)); // to get an array 
	
	 for (int i = 0; i<a.size(); i++)
	 {
		System.out.println( a.get(i));  // print all elements in the array
	 }
	
	 System.out.println("*******");
	for (String val :a)
	{
		System.out.println(val);
	}
	
	//Contains
	//item is present in ArrayList I want to check if selenium keyword is present in this array
	// will return true or false
	
	System.out.println(a.contains("selenium"));
	String[] name= {"Maria, Gozde , Jan"}; // convert this array into array list- convert this method
	List<String> nameArrayList = Arrays.asList(name); //name is convert to ArrayList
	nameArrayList.contains("jan");
	
	
	
	}
}

	





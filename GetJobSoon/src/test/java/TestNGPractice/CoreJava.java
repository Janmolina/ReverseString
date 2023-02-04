package TestNGPractice;

public class CoreJava {

	public static void main (String[]args) {
	
	int num=5;
	String website= "Undemy";
	char letter = 'r';
	double dec = 5.99;
	boolean myCard =true; 
	
System.out.println(num + " num is variable");
	
//Arrays
// store multiple values in one variable
// you assign value fro 0 index

int [] arr = new int[5];
// asigning values to index
// one syntax to declare a value
arr[0] =1;
arr[1] =2;
arr[2]= 3;
arr[3]= 5;
arr[4]=6;
// second way to declare a syntax

int [] arr2= {1,2,3,5,6,7,8,9,10,122};

//arr2[2];

//System.out.println(arr2[2]);
	//for loop
//lenght give you the size of the array s on in this case is 5
//for (int i =0; i<arr.length; i++)
	
//{
	//System.out.println(arr[i]);
//	}
		
for(int i =0;  i<arr2.length; i++)
{
System.out.println(arr2[i]);

}

String[] name = {"jan", "Mario", "Xavier"};

for (int i =0; i<name.length; i++ )
{
	System.out.println(name[i]);
	
	}

	}
}


	

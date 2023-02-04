package InterviewPractice;

import java.util.Scanner;

public class givenNumbersAmstrong {

	 
	public static void main (String []args) {
		
	
	
    Scanner scanner= new Scanner (System.in);
    
    System.out.println("enter any number"); //153
    
    int num= scanner.nextInt();
    
    int orignalNum = num;
    int cubedNum = 0;
  
    // logic for cheking wethrer the given number is Armstorn number
    
    while(num>0){
int reminder = num %10; //1
cubedNum= cubedNum +(reminder*reminder*reminder); //153

num =num /10; //0
}
    
    if (orignalNum==cubedNum) {
    System.out.println(orignalNum+" is amstrong number");
    
}else {
System.out.println(orignalNum+" is not an Armstrong");
}

}

}



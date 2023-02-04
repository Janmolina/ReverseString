package InterviewPractice;

import java.util.Arrays;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	        int [] a = {1,2,3,4,5}; // [5, 2, 3, 4, 1]

	        
	        int size = a.length;
	        
	        int temp = a[0];
	        
	        a[0] = a[size-1];
	        
	        a [size-1]= temp;
	        System.out.println(Arrays.toString(a));
	    }

	}

	



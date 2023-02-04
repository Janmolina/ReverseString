package InterviewPractice;

import java.util.Collection;
import java.util.HashSet;

public class Remove_duplicate {

	

	    public static void main(String[] args) {

	        String str = "aaaabbbbccccccddeeeff";
	    Collection<Character> alph= new HashSet<>();

	    for( int i= 0; i< str.length();i++) {
//	        System.out.println(alph);
//	        System.out.println(str.charAt(i));
	        alph.add(str.charAt(i));


	    }
	  System.out.println(alph);
	    }

	}
	
	


package InterviewPractice;

public class palindrome {

	public static void main (String[]args) {

	String str = "molina";
	String reverse= "";
	
	for (int i= str.length()-1; i>=0; i--) {
		reverse+= str.charAt(i);
		
	}
	if (str.equalsIgnoreCase(reverse)) {
		System.out.println(reverse + " is palindrome ");
	}else {
		System.out.println(reverse + " is not palindrome");
	}
	}	
	
	
}

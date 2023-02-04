package InterviewPractice;

public interface reversePalindrome {
	
//static you can create a method without an instance of an object
	
	public static void main (String[]args) {

    
    // check if the string is palindrome// reverse
    
    String name = "mom";
    String reversename = "";
    for(int i = name.length ()-1; i>=0; i--) {
        reversename += name.charAt(i);
            
    }

    if (reversename.equalsIgnoreCase(name)) {
        System.out.println("is palindomre");
    }else {
    System.out.println("not palindorme");
}

}

}



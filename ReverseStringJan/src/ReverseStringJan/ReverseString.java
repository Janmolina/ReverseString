package ReverseStringJan;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name= "Jandery";
		String reverse= "";
		
		for (int i =name.length()-1; i>=0; i--) {
			reverse+= name.charAt(i);
			
		}
		
		System.out.println(reverse);
	}

}

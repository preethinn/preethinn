package Sessionone;

public class Problem1 {
	public static void main(String args[]) {
		//char to String
		char name[] = {'a','d','a','m'};//char type 1d array
		String firstName = new String(name);
		
		//String object
		String lastName = new String("edward");
		//System.out.println(new String("adam").length() + new String("edward").length());
		
		//Sum of length of 2 strings
		System.out.println("Sum of "+firstName+" and "+lastName+" strings lengths:"+(firstName.length()+lastName.length()));
		
		
		System.out.println(firstName.substring(0,1).
	   toUpperCase()+firstName.substring(1)+" "+lastName.substring(0,1).toUpperCase()+lastName.substring(1));
		 
		
		int expression = firstName.compareTo(lastName);
		System.out.println(expression < 0 ? "YES" : "NO");
	}

}

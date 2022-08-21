package Sessionone;

public class Problem1 {
	public static void main(String args[]) {
		//char to String
		char name[] = {'a','d','a','m'};//char type 1d array
		String firstName = new String(name);
		
		//String object
		String lastName = new String( "edward");
		//System.out.println(new String("adam").length() + new String("edward").length());
		
		//Sum of length of 2 strings
		System.out.println("Sum of 2 string lengths:"+(firstName.length()+lastName.length()));
		
		
		System.out.println(firstName.substringreplace("adam" , "Adam")+ " "+ lastName.replace("e","E"));
		
		
		int expression = firstName.compareTo(lastName);
		System.out.println(expression < 0 ? "YES" : "NO");
	}

}

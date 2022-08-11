//WAP to check the number is positive or Negative or Whole Number//
package Sessionone;

public class Problem3 {
	public static void main(String[] args) {
		int number = -10;
		
		if(number == 0) {
		     System.out.println("The Number is whole number");
		}
		else if(number > 0){
			System.out.println("The Number is greater than zero and its a Positive Number");
		}
		else {
			System.out.println("The Number is lesser than zero and its a Negative Number");
		}		
	}
}
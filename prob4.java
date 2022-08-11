package Sessionone;

//WAP if a given number is divisible by 7 and its positive or Negative Number//
public class Problem4 {
	public static void main(String[] args) {
		int number = -30;
		byte div = 7;
		
		if(number % div == 0 && number > 0) {
			System.out.println("The Number is Positive and divisible by 7");//input: 14 and 7
	         }
		else if (number % div == 0 && number < 0) {
			System.out.println("The Number is Negative and divisible by 7");//input: -14 and 7
		}
		else if (number % div == 0 && number == 0) {
			System.out.println("The Number is a Whole Number");//input: 0 and 7
		}
		else if (number % div == 0 || number > 0) {
			System.out.println("The Number is not divisible by 7 but its postive number");//input: 30 and 7
		}
		else if (number % div == 0 || number < 0) {
			System.out.println("The Number is not divisible by 7 and its Negative Number");//input: -30 and 7
		}
	}
}

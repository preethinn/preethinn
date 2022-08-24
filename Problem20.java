//Problem 20: Check if the Number is  Palindrome or Not.
package Sessiontwo;
import java.util.Scanner;
public class Palindrome {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to check palindrome or not:");
		int number = scan.nextInt();
		int temp = number;
		int reverse = 0;
		 while (number > 0)
		 {
		int remainder = number % 10;//123 % 10 = remainder = 3 | 12%10 = remainder = 2 | 1%10 = 1
		reverse = reverse * 10 + remainder; // 3|32|321
		number = number /10; //123/10 = 12 |12/10 = 1 | 1/10 = 0
		}
		 System.out.println(reverse);
			if(reverse == temp)
			{
				System.out.println("Its a Palindrome");
			}
			else
			{
				System.out.println("Its Not a Palindrome");
			}	 
	}
}

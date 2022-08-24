//Problem 18: Reverse a Number

package Sessiontwo;
import java.util.Scanner;// built-in util package which includes several classes among them scanner class is being used in this program

public class ReverseANumber
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in); //Scanner class's Object (scan) got created
		System.out.println("Enter the Number:");
		int inputNumber = scan.nextInt();//123
		
		int reverse = 0;
		while (inputNumber > 0)
		{
		//To get last digit
		int remainder = inputNumber % 10;//3
		reverse = reverse * 10 + remainder; //3
		inputNumber = inputNumber/10;//123/10 = 12
		}
		System.out.println("The Reverse of Entered Number "+inputNumber+" is "+reverse);
	}		
}

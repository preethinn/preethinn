//Problem to find factors for the given number:
package Sessionthree;
import java.util.Scanner;
public class Factors 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to know its factors:");
		int number = scan.nextInt();
		for(int ctr=1; ctr < number;ctr++)
		{
			if(number % ctr == 0)
			{
				System.out.println("factor of given Number "+number+" is "+ctr);
			}
		}	
	}
}

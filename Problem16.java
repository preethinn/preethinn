//Problem 16:Factorial Program by accepting User Input 
package Sessiontwo;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to know its factorial value:");
		int facNumber = scan.nextInt();
		int factorial = 1;
		for(int ctr = 1; ctr <= facNumber;ctr++)// 1<=3 |2<=3 |3<=3 | 4<=3 fail
		{
			factorial  *= ctr;// factorial = 1*1 = 1 |1*2 = 2 | 2*3 = 6|
		}
		System.out.println("The Factorial of "+facNumber+": "+factorial);
		/*while(facNumber > 0)
		{
			factorial  *= facNumber;
			facNumber--;
		}
		System.out.println("The Factorial value: "+factorial);*/
	}	
}

//Problem 32: Check if the number id Prime or Not:
package Sessionthree;
import java.util.Scanner;
public class PrimeNumber 
{
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number to Check its Prime");//12
	int inputValue = scan.nextInt();
	boolean flag = true;
	int ctr=2;
	while(ctr < inputValue) //2 < 12 y
	{
		if(inputValue % ctr ==0)//12 % 2 y
		{
			System.out.println(inputValue+" Not a Prime Number");//y
			flag = false;//reinitialise
			break;
		}
		ctr++;//ctr=3
	}
	if(flag == true)
	{
		System.out.println(inputValue+" its a Prime Number");
	}
}
}


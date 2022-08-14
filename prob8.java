//WAP to accept n from user print odd numbers till n
package Sessiontwo;
import java.util.Scanner;
public class Problemeight {
	public static void main(String args[])
	{
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter number to check odd range:");
		int inputValue = scObj.nextInt();
		
		for(int counter = 1; counter <= inputValue; counter++)
		{
		
		if(counter % 2 == 1)
		{
			System.out.println("Odd Number:"+counter);
		}
		}
	}

}

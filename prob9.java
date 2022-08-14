//WAP to accept n from user print even numbers till n
package Sessiontwo;
import java.util.Scanner;
public class Problemnine {
	public static void main(String args[])
	{
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter the Number to check even:");
		int inputVlaue = scObj.nextInt();
		
		for(int counter = 1; counter <= inputVlaue; counter++)
		{
			if(counter % 2 == 0)
			{
				System.out.println("Even Number:"+counter);
			}
		}
		
	}

}

//WAP to accept n from user and print it range of numbers from 1 till n
package Sessiontwo;
import java.util.Scanner;

public class Problemseven {
	public static void main(String args[])
	{
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int inputValue = scObj.nextInt();
		
		for(int counter = 1; counter <= inputValue; counter++)
		{
			System.out.println("The Number Range till User Input Value is:"+counter);
		}
		
	}

}

package Sessiontwo;
import java.util.Scanner;

public class Problemeleven {
	public static void main(String args[])//JVM - Starts Execution with Main function
	{
		Scanner scObj = new Scanner(System.in);//System.in is an input stream which accepts keyboard event
	    System.out.println("Enter the Number:");
	    int inputValue = scObj.nextInt();//Scanner class and its object and method
	    
	    int sum = 0;//default value
		 
			for(int counter = 1 ; counter <= inputValue; counter++)    // 1    1<=5   2      |  2 2<=5  3        | 3 3<=5 4           |4 4<=5 5     |5 5<=5 6      |6 6<=5 false
				                                                       // sum = 0 + 1 = 1    |  sum= 1+ 2 = 3    | sum = 3+3 = 6      |sum=6+4 = 10 |sum=10+5 = 15
			{
				sum = sum + counter;
				//System.out.println("The Sum of two Numbers is:"+sum);// Prints each time the sum of 2 numbers
			}
			System.out.println("The Total Summation value is:"+sum);//Prints final sum value	
		}
				
	}
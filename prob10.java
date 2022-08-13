//WAP to Print Even and Odd Numbers by accepting input from User:
package Sessionone;
import java.util.Scanner;
public class Task7 {
	public static void main(String args[]) 
	{
	Scanner srcObj = new Scanner(System.in);
	System.out.println("1. First Way of printing Even and odd Numbers together");
	System.out.println("Enter the Number:");
	int userInput = srcObj.nextInt();
	
	for(int counter=1; counter<=userInput; counter++)
	{
		if(counter % 2 == 0)
		{
			System.out.println("The Even Number within the range"+ " "+userInput +" are" +" "+counter);
		}
		else
		{
			System.out.println("The Odd Number within the range"+ " "+userInput +" are" +" "+counter);
		}
	}
	System.out.println("--------------------------------------------------------------------------------------------------------");
	
	
	
	System.out.println("2.When Alteration is inside While loop it exceeds the user input count");
	System.out.println("Enter the Number:");
	byte ctr  = 1;//starting point
	int inputNumber = srcObj.nextInt();   // byte range type casted to int range
	while(ctr<=inputNumber)//while loop and to check until the user input value                            // 1<= 5   | 2<=5  | 3<=5   | 4<=5| 5<=5
	{   ctr++;     //until while is false each time ctr get incremented by 1                               //  2       | 3       |4        | 5  |6
		if(ctr % 2 == 0)   //the increemented value of ctr remainder of 2 and checks if its equals to 0  //   2%2 == 0  true   3%2== 0 false | 4%2==0 true | 5%2 == 0 false | 6%2==0
		{                  //if equals to zero 
			
			System.out.println("Even Numbers:"+ctr);                                                      // ctr  :  2	  |---|  4 |----| 6 <------- Exceeds the User input Range
		}	
	}
	System.out.println("-------------------------------------------------------------------------------------------------------------");
	
	
	
	System.out.println("3.To Print Odd and Even Numbers Using  2 for loops");
	System.out.println("Enter The Input Value to check odd or even:");
	int inputValue = srcObj.nextInt();
    
	for(int counter=1;counter<=inputValue;counter++)
	{
		if(counter % 2 == 0)
		{
			System.out.println("Even Number:"+counter);
		}
	}
	
	for(int counter=1;counter<=inputValue;counter++)
	{
		if(counter % 2 != 1)
		{
			System.out.println("Odd Number:"+counter);
		}
	}	
	}
}

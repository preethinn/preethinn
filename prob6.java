package Sessionone;
import java.util.Scanner;
public class Evenodd 
{
	public static void main(String args[])
	{
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter the Number");
		short inputValue = scObj.nextShort();
		if(inputValue % 2 != 0)   //if input value's remainder is of 0dd type then print 
		{
			System.out.println("1.Weird");
		}
		
		   if(inputValue % 2 == 0 &&  2<= inputValue &&  inputValue<=6) // if input value remainder is equal to zero true checks next condition 
				                                                         //2<= inputvalue if true checks one more condition inputValue<=6 then print
			{
				System.out.println("2.Not Weird");
			}
		
	  
		   if(inputValue % 2 == 0)
		   {
			   System.out.println("2.Weird");
		   }
	   
	  
	   if(inputValue % 2 == 0 && inputValue > 20)
	   {
		   System.out.println("3.Not Weird");
	   }
	   else
	   {
		   System.out.println("3.Weird");   
	   }
	}
}

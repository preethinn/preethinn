//WAP to check the number is even or odd

package Sessionone;
public class Task6 
{
	public static void mian(String args[]) 
	{
		byte number = 1;
			if(number % 2 == 0) //Condition to check even i.e if remainder is equal to 0 then prints the stmt inside the simple if condition
			{
			System.out.println("Number  "+number+" is Even");
			}
			
			if(number % 2 == 1)// condition to check odd i.e if remainder is not equal to 1 then prints the stmt inside the simple if condition
			{
				System.out.println("Number  "+number+" is Odd");
		    }
	}

}

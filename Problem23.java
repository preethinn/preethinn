//Problem 23: To Check Peterson Number
package Sessiontwo;
import java.util.Scanner;
public class PetersonNumber 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");//145
		int number = sc.nextInt();
		int temp = number;
		int digit,sum=0,value;
		//PetersonNumber peterson = new PetersonNumber();
		//peterson.petersonNumber(145);
		while(number > 0) // 145 >0 
		{
		digit = number % 10; // digit = 145 % 10 = 5
		value = PetersonNumber.petersonNumber(digit); //value=120
		number/=10;//145/10=14
		sum = sum + value;//sum=0+120
		}
		if(sum == temp)
		{
			System.out.println("its peterson number");
		}
		else
		{
			System.out.println("its not peterson number");
		}		
	}
	
	static int petersonNumber(int number)//5
	{
		int ctr=2 , factorial = 1;
		while(ctr <= number) //2<=5 | 3<=5 |4<=5 |5<=5 |6<=5 no
		{
			factorial *= ctr;//factorial = 1*2 |factorial = 2*3 | factorial= 6*4 | 24*5 = 120
			ctr++;//3 |4 |5 |6
		}
		return factorial; //120
	}
}

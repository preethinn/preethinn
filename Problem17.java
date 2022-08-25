//Problem 17: Check if the number is Armstrong Number or Not

package Sessiontwo;
import java.util.Scanner; //java.util
public class AmstrongNumber {
	public static void main(String args[])
	{ 
	
		int cube = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to check Amstrong Value:");
		int number = scan.nextInt();

		/*Armstrongfunc obj = new Armstrongfunc();
	    obj.ArmstrongFunction(123);*/
		
		
		int temp = number;//123  
		while(number > 0)//123>0 | 12>0 | 1>0 | 0>0 fail
		{
			int rem = number % 10 ;//123%10 =3  | 12%10= 2   | 1%10 = 1 
			//reverse = number * 10;
			cube += (rem * rem* rem);//3*3*3 = 0+9 = 27  |2*2*2 = 27+8 =35 |1*1*1 = 35+1 = 36
			number = number /10;//123/10 = 12  | 12/10 = 1 | 1/10 = 0
		}
		if(temp == cube) //123 == 36 fail
		{
			System.out.println("The entered number"+temp+"is a Amstrong Number");
		}
		else
		{
			System.out.println("The entered number"+temp+"is not an Amstrong Number");	
		}
		
	}

}

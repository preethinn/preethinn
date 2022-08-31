//Problem 24: 	Accept Number from User and Check its Neon or Not

package Sessiontwo;
import java.util.Scanner;
public class NeonNumber
{
	public static void main(String args[]) 
	{
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter the Number:");
  int number = scan.nextInt();
  int summation = 0,rem;
  int square = number * number;
  for(;square > 0;)
  {
	rem = square % 10;
	summation = summation + rem ;
	square = square/10;
  }
  if(summation == number)
	  {
	  System.out.println("Its Neon Number");
  }
  else
  {
	  System.out.println("Its not a Neon Number");
  }
	}
}

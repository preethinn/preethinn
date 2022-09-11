//Problem : Tech Number
package Sessionthree;
import java.util.Scanner;
public class TechNumber 
{
  public static void main(String args[])
  {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the Number:");
	  int inputValue = scan.nextInt();
	 /* int rem = inputValue%100;
	  int div = inputValue/100;
	  System.out.println(rem);
	  System.out.println(div);
	  int summation = (rem +div);
	  System.out.println(summation);
	  int square = summation*summation;
	  return square;*/
	  TechNumber tech = new TechNumber();
	  int square= tech.toCheckTechNumber(2025);
	  
	  System.out.println(square == inputValue ? "its tech number" : "its Not tech number");    
  }
  
  int toCheckTechNumber(int inputValue)
  {
	  int rem = inputValue%100;
	  int div = inputValue/100;
	  System.out.println(rem);
	  System.out.println(div);
	  int summation = (rem +div);
	  System.out.println(summation);
	  int square = summation*summation;
	  return square;
  }
}

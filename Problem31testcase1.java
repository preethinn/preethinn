//Problem 31: TestCase 1(when both start and end index value given) = SubString 
package Sessionthree;
import java.util.Scanner;
public class SubString 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String Value");//Hi From Java
		String input = scan.nextLine();
		System.out.println("Enter the Start Index Count:");
		int startCount = scan.nextInt();//1
		System.out.println("Enter the End Index Count:");
		int endCount = scan.nextInt();//5
	    String sub = "";
	    int exit;
	    if(endCount != 0 )//5 !=0 y | n
	    {
	    	exit = endCount; //exit = 5 
	    }
	    else {
	    	exit = input.length(); //for n
	    }
	    for(int ctr = startCount; ctr <= endCount; ctr++)//ctr =1  1<5 y 2 | ctr=2 2<5 y 3 | ctr=3 3 <5 y 4| ctr=4 4<5 y 5 | ctr=5 5<5 n	                                          
	    {
	    	System.out.println(input.charAt(ctr));//Hi From Java.charAt(1) | input.charAt(2) | input.charAt(3) | input.charAt(4)
	    	sub += input.charAt(ctr);//sub = ""+Hi From Java.charAt(1) = |i+input.charAt(2) |i +input.charAt(3) |i F+input.charAt(4) = i Fr
	    }  
	}
}

//Problem 16: Factorial Program Using Function

package Sessiontwo;
public class Facfunction 
{
	public static void main(String args[])
	{
		Facfunction fac = new Facfunction();
		fac.toCheckFactorial(6);
	}
	
	void toCheckFactorial(int facNumber) //20
	{
	    int factorial = 1;
	    int ctr = 2;
	    while(ctr <= facNumber)// ctr=2 2 <= 20 | 3 3<=20 | 4<=20 |5<=20 | 6<=20 ...
	      {
		    factorial  *= ctr;
		    ctr++;// factorial = 1 * 2 = 2 | factorial = 2*3 = 6 | 6*4 = 24 | 24*5 ...
	      }
	    System.out.println("The Factorial of "+facNumber+": "+factorial);
	}
}

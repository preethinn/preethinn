//Problem 24: Neon Number with function

package Sessiontwo;
public class Neontwo
{
	public static void main(String args[])
	{
		Neontwo neon = new Neontwo();
		neon.toCheckNeonNumber(9);
		
	}
	void toCheckNeonNumber(int number)//9
	{
		int square = number * number, rem, sum = 0;//81
		while(square > 0)//81>0 8>0
		{
			rem = square % 10; //rem = 81% 10 = 1 | rem = 8
			sum = sum + rem ;//0+1= sum=1
			square/=10;//81/10 = 8
		}
	    System.out.println((number == sum )? "is Neon" : "is Not Neon");
	}
		   
}
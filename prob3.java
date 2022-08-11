package Sessionone;

public class Problem2 {
       static public  void main(String args[]) {
	  
	int number = 33;
	System.out.println("2.To check whether the number is positive or Negative using Simple if");
	if(number > 0) 
	{
		System.out.println("The Number is Positive"+ " " +number);
	}
	if( number < 0)  
	{
        System.out.println("Number is Negative Number:"+ " " +number );
    }
	System.out.println("-------------------------------------------------------------------");
	
	System.out.println("2.To Check whether the number is divisible by 2" );
	if(number % 2 == 0)
	{
		System.out.println("The Number is Divisible by 2");	
	}
	else
	{
		System.out.println("The Number is not Divisible by 2");		
	}
	}
}

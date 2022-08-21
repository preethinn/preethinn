//Problem 12: Create an array with positive and negative numbers and divisible by 2 or not
package Sessiontwo;
import java.util.Scanner;//built in package-> util where Scanner is class which is been imported by import keyword

public class Arraysum {
	public static void main(String args[])
	{
		int posNeg[] =  {78, 79, 0, -1, -212};//Array of int datatype from Integer Class
		
		int counter = 0;//while loop initialization
		while(counter <= posNeg.length-1)      //condition checking: 1)0<=5-1 = 0<=4 t | 
			                                                      //2)1<=4 t | 
			                                                      //3)2<=4 t |
		{
			//in while loop if condition true enters inside the while loop
		    if(posNeg[counter]%2 ==0 && posNeg[counter] > 0)//1) posNeg[0]=78%2=0 i.e 0==0 t && 78>0 t |
		    	                                            //2) 79%2 == 0 f && 79>0 t basically if first condition itself fails so AND opperation doesn't check for second condition |
		    	                                            //3)0%2 == 0 t && 0 >0 f|
			{  
				System.out.println(posNeg[counter]+"  The Number is Positive and Divisible by 2");//1)prints|
			                                                                                	//2)doesn't print|
				                                                                                 //3)doesn't print|
			}
			else if(posNeg[counter]%2 != 0 && posNeg[counter] > 0)//1)78%2 = 0 != 0 f && | 
				                                                 //2)79%2 != 0 t && 79>0 t | 
				                                                //3)0%2 !=0 f && 0>0 f|
			{
				System.out.println(posNeg[counter]+"   The Number is Positive and Not Divisible by 2");//1)doesn't print | 
				                                                                                       //2)prints | 
				                                                                                       //3)doesn't print|
			}
			else if(posNeg[counter]%2 ==0 && posNeg[counter] < 0 )//1)78%2=0 t || 78<0 f |
				                                                 //2) 79%2 ==0 f && 79<0 f|
				                                                //3) 0%2==0 t && 0<0 f|
			{
				System.out.println(posNeg[counter]+"  The Number is Negative and Divisible by 2");//1)doesn't print |
				                                                                                  //2) Doesn't Print |
		     	                                                                                  //3) doesn't print |
			}
			else if(posNeg[counter] ==0 )
			{
				System.out.println(posNeg[counter]+"  The Number is Zero");
			}
			else if(posNeg[counter] <0 && posNeg[counter] !=0 )
			{
				System.out.println(posNeg[counter]+" The Number is Negative and Not Divisible by 2");
			}
		    
		     counter++;//1)counter = 0++ = 1 |
		              //2)counter =1++ = 2 | 
		              //3)counter = 2++ = 3
		}
			
		    System.out.println("---------------------------------------------------------------------------------------------------------------------------");
			//WAP to accept array elements from user and ceck positive or negative and divisible by2
			Scanner scan = new Scanner(System.in);//scanner class's object creation |object = scan| new keyword allocates fresh memory
			System.out.println("Enter the Number of Elements count:");
			int userInput = scan.nextInt();//userInput will have elements count from user(Keyboard Event)
			int oneDArray[] = new int[userInput];  //One Dimensional int type Array Creation ->Size of an array[userInput]
			
			System.out.println("Enter the Elements to check positive or negative:");
			
			for(int ctr = 0; ctr <= oneDArray.length-1; ctr++)// (ctr = 0 0<=5-1 1)
			{
				 oneDArray[ctr] = scan.nextInt();//storing the userInput into oneDArray[ctr]
			}
			for(int value:oneDArray)//Accepts all the user Entered oneDArray elements  these will be stored in variable value
			{
				System.out.println("User Entered Array Element are: "+value);//Prints all the elements at once
			}
			
			for(int ctr = 0 ; ctr < oneDArray.length;ctr++)//Accepting user entered Array Elements one by one
			{
			  
				if(oneDArray[ctr] % 2 == 0 && oneDArray[ctr] >0)  
				{
					System.out.println("Array Element "+oneDArray[ctr]+" is Postive and divisible by 2");
				}
				else if(oneDArray[ctr] % 2 != 0 && oneDArray[ctr] >0)
				{
					System.out.println("Array Element "+oneDArray[ctr]+" is Postive and Not divisible by 2");	
				}	
				else if(oneDArray[ctr] % 2 != 0 && oneDArray[ctr] <0)
				{
					System.out.println("Array Element "+oneDArray[ctr]+" is Negative and Not divisible by 2");	
				}
				else
				{
					System.out.println("Array Element "+oneDArray[ctr]+" is Neither divisible by 2 nor Equivalent to Zero");
				}
				}
	}
}




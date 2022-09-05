//Problem 27:Reverse an Input Array without Backup Copy of another Array
package Sessionthree;
import java.util.Scanner;
public class ReverseArray 
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of an Array:");
	int size = sc.nextInt(); //4
	System.out.println("Enter the Elements into Array:");//1 2 3 4 
    int originalArray[] = new int[size];//originalArray[4]
   
    //to access
    int temp;
    for(int ctr=0; ctr < size; ctr++)
    {
    	originalArray[ctr] = sc.nextInt();//OriginalArray[0]=1 | originalArray[1]=2 |originalArray[2]=3 |orginalArray[3]=4
    }
         for(int ctr=0; ctr <(size/2); ctr++) //0 0<2 0++| 1 1<2 1++| 2 2<2 no
         {
        	 int count=ctr;//count=0 |count=1 
        	 temp=originalArray[count];//temp=originalArray[0] | temp=OriginalArray[1] |
        	 originalArray[count]=originalArray[(size)-(ctr+1)];//originalArray[0]=originalArray[3] |
             //System.out.println(originalArray[count]);      //originalArray[1]=originalArray[2] |
        	                                                                  
        	 originalArray[size-(ctr+1)] = temp;//originalArray[3]=temp |
        	// System.out.println(temp);                        //originalArray[2]=temp |
        	                                                    
         }
         for(int ctr=0;ctr < originalArray.length;ctr++)
         {
         System.out.print(originalArray[ctr]+" ");
         }
    } 
}

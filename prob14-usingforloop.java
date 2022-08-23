//Problem 14: Accept User Input for Rows and Columns for Multidimensional Array Using For Loop

package Sessiontwo;
import java.util.Scanner;
public class Multi_Dimesiona_lArray 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Rows: ");
		int inputRow = scan.nextInt();
		System.out.println("Enter the Number of Columns: ");
		int inputColumn = scan.nextInt();
		System.out.println("Enter the Elements into 2D Array: ");
		int inputArray[][] = new int[inputRow][inputColumn];
		for(int ctrRow= 0; ctrRow < inputRow; ctrRow++)
		{    
			for(int ctrColumn = 0; ctrColumn < inputColumn; ctrColumn++)
			{
				inputArray[ctrRow][ctrColumn]= scan.nextInt();
		        //System.out.println("The Entered Matrix Elements are:"+inputArray[ctrRow][ctrColumn]);
			}
		}
		System.out.println("The Entered Matrix Elements are:");
		for(int ctrRow= 0; ctrRow < inputRow; ctrRow++)
		{    
			for(int ctrColumn = 0; ctrColumn < inputColumn; ctrColumn++)
			{ 
				//System.out.println("The Entered Matrix Elements are:");
				System.out.print(inputArray[ctrRow][ctrColumn]+" ");
			}
			System.out.println();
		}
	}

}

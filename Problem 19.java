//Problem 19: WAP to accept user input for multidimensional matrix, print the output such that the left diagonal values are only zero
package Sessiontwo;
import java.util.Scanner;
public class LeftDiagonalArray
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the row count: ");
		int inputRow = scan.nextInt();//3
		System.out.println("Enter the column count: ");
		int inputCol = scan.nextInt();//3
		System.out.println("Enter the Matrix Elements: ");
		int matrix[][] = new int[inputRow][inputCol];//matrix[3][3]
		for(int ctrRow = 0; ctrRow < inputRow; ctrRow++)//0 0<3 0++ | 1 1<3 1++ | 2 2<3 2++ 
		{
			for(int ctrCol = 0; ctrCol < inputCol; ctrCol++)//0 0<3 0++ | 1 1<3 1++ | 2 2<3 2++ | 3 3<3 3++ fails
				                                            //0 0<3 0++ | 1 1<3 1++ | 2 2<3 2++ | 3 3<3 3++ fails
				                                            //0 0<3 0++ |  1 1<3 1++ |  2 2<3 2++ | 3 3<3 3++ fails
			{
				/*if(ctrRow == ctrCol) //0 == 0 | 0 == 1 fails| 0 == 2 fails |
					                //1 == 0fails |  1 == 1 | 1 == 2 fails | 
					               // 2 == 0 fails | 2 == 1 fails | 2 == 2  
				{
				  System.out.println(matrix[ctrRow][ctrCol] = 0);//prints
				                                                 //prints
				                                                 //prints
				  matrix[ctrRow][ctrCol]=scan.nextInt();//matrix[0][0] = 0
				                                       //matrix[0][1] = inputValue
				                                      //
				}*/
				 matrix[ctrRow][ctrCol]=scan.nextInt();//matrix[0][0]
				if(ctrRow == ctrCol) //0 == 0
					{
					  System.out.println(matrix[ctrRow][ctrCol] = 0);	
					}
			}
		}
		for(int counterRow = 0; counterRow < inputRow; counterRow++)
		{
			for(int counterCol = 0; counterCol < inputCol; counterCol++)
			{
				System.out.print(matrix[counterRow][counterCol]+" ");
			}
			System.out.println();
		}
	}
}

//Problem 15: WAP to accept user input for multidimensional array check if the entered values are positive or negative.
package Sessiontwo;
import java.util.Scanner;
public class Multidimensional_Positive_Negative 
{
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Row Count:");
	int rowCount = scan.nextInt();
	System.out.println("Enter the Column Count:");
	int columnCount = scan.nextInt();
	System.out.println("Enter the Matrix Elements:");
	int matrix[][] = new int[rowCount][columnCount];
	for(int ctrRow=0; ctrRow < rowCount ;ctrRow++)
	//for(int ctrRow=0; ctrRow < matrix.length;ctrRow++)
	{
		for(int ctrColumn=0; ctrColumn < columnCount ;ctrColumn++)
		//for(int ctrColumn=0; ctrColumn < matrix.length ;ctrColumn++)
		{
			matrix[ctrRow][ctrColumn] = scan.nextInt();
		}	
	}
	System.out.println("Entered Matrix are:");//12 -12  1 2
	for(int ctrRow=0; ctrRow < rowCount ;ctrRow++)
	//for(int ctrRow=0; ctrRow < matrix.length;ctrRow++)//1)0  0<2 0++| 2) 1 1<2  1++ | 3) 2 2<2 fails comes out of outer for loop
	{
		for(int ctrColumn=0; ctrColumn < columnCount; ctrColumn++)
		//for(int ctrColumn=0; ctrColumn < matrix.length; ctrColumn++) //First Row -> 1)0 0<2 0++ |2)1 1<2 1++ |3) 2 2<2 fails so moves to outer loop| 
			                                                        //Second Row -> 1)0 0<2 0++ |2) 1 1<2 1++ |3) 2 2<2 fails so moves to outer loop|
		{
			if(matrix[ctrRow][ctrColumn] > 0)//First Row -> 1) matrix[0][0]= 12 >0 | 2)matrix[0][1]= -12>0 fails| 
				                            //Second Row -> 1) matrix[1][0]= 1 > 0 | 2)matrix[1][1]= 2>0 |
			{
				System.out.print("+"+matrix[ctrRow][ctrColumn]+" ");//First row -> 1)prints +12 | 2)prints +1
				                                                    //Second Row -> 1)prints +1 |2)prints  +2
			}
			else
			{
				System.out.print("-"+matrix[ctrRow][ctrColumn]+" ");//First row ->2)prints -12 |
			}
			//System.out.print(+matrix[ctrRow][ctrColumn]+" ");
		}
		System.out.println();
	}
	}
}

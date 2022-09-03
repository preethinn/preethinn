package Sessiontwo;
import java.util.Scanner;
public class CopyArray 
{
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the matrix row count:");//4
	int matrixCount = scan.nextInt();//4
	
	System.out.println("Enter the Elements:");//1 2 3 4 
	int matrix[] = new int[matrixCount];
	
	//to accept elements
	for(int ctr = 0; ctr < matrix.length; ctr++)//0 0<4 0++ |1 1<4 1++| 2 2<4 2++ | 3 3<4 3++ | 4 4<4 4++ fails|
	{
		matrix[ctr] = scan.nextInt();//matrix[0]=1| 2 | 3 | 4 |
	}
	//to print the entered elements
	System.out.println("Elements Entered by User for the Matrix is:");
	for(int ctr = 0 ; ctr< matrix.length; ctr++)
	{
		System.out.println(matrix[ctr]);
	}
	
	//to copy an existing array into new array
	int copiedArray[] = new int[matrixCount];// copiedArray[4]; just the size of user entered
	for(int ctr2= 0; ctr2  < matrixCount; ctr2++)
	{
		copiedArray[ctr2] = matrix[ctr2];
	}
	System.out.println("Elements from Existing Array are:");
	for(int ctr2 = 0; ctr2 < matrixCount; ctr2++)
	{
		System.out.println(copiedArray[ctr2]);
	}
}
}

//Problem 13: WAP to count the no. of white spaces vowels and consonants using if else and switch
package Sessiontwo;
import java.util.Scanner;
public class Vowelconsonants 
{
   	public static void main(String args[])
   	{
   		Scanner scan = new Scanner(System.in);
   		 
   		System.out.println("Enter Input Data to check No. of Vowels and Consonants and Whitespaces within it: ");//this is an dell laptop
   		
   		//User Entered Input will be stored in inputData Variable which is been scanned by Scanner object -> scan by method nextLine 
   		String inputData = scan.nextLine(); 
   		
   		//To check character by character whether its vowel or not we need to convert String to char -> inputData.tocharArray();
   		//<toCharArray() is a predefined method from String Class>
		//To store the collection of converted value's we need an char type array ->  char array[]  
   		char array[] =inputData.toCharArray();
   		short vowel =0,consonant=0,whitespace=0;
		//To Accept the array elements one by one loop is required
		for(int ctr = 0; ctr<=inputData.length()-1;ctr++) //1)0    0<=22-1=21 true   0++ 
			                                             //2)1     1<=21 true    1++ 
			                                             //3)2     2<=21 true    2++
			                                             //4)3     3<=21 true    3++
			                                             //5)4     4<=21 true    4++
			                                             //6)5     5<=21 true    5++
			                                             //7)6     6<=21 true    6++
		{
			//array[ctr] = inputData.charAt(ctr);//this is an dell laptop.charAt(0)=t will be stored in array[0]=t similarly array[1]=h array[2]=i....
		    inputData.charAt(ctr);//1)t 2)h 3)i 4)s 5)space 6)i 7)s
			System.out.println(inputData);//1)Each time prints inputdata |2) |3) |4) |5) |6) |7)
		    System.out.println(array[ctr]);//1)prints t 2)prints h  3)prints i 4)prints s 5)prints space 6)prints i
		    
		    if( inputData.charAt(ctr)== 'a'|| inputData.charAt(ctr) == 'e' ||inputData.charAt(ctr) == 'i' ||inputData.charAt(ctr) == 'o' ||inputData.charAt(ctr) == 'u'||
		        inputData.charAt(ctr) == 'A'||inputData.charAt(ctr) == 'E'|| inputData.charAt(ctr)=='I'|| inputData.charAt(ctr)=='O'|| inputData.charAt(ctr) == 'U') 
		    	//1)t fail  2) h fail 3)i true 4) s fail  5)space fail  6)i true
				    {
				    	System.out.print("its Vowel= "); //3)prints |6)prints |
				    	vowel++;//3)0++  |6)1++ |
				    	System.out.println(vowel);//3)1 |6)2 |
				    	
				    }
				    else if( inputData.charAt(ctr)==' ')
				    	//1)t is fail 2)h fail 3)i fail 4)s fail 5)space true
				    {
				    	System.out.print("its Whitespace= ");//5)Prints |
				    	whitespace++;//5)0++ |
				    	System.out.println(whitespace);//5)1 |
				    }
				    else
				    	//1)t is true 2)h is true  4)s true
				    {
				    	System.out.print("its Consonant= ");//1)prints stmt |2)prints stmt |4)prints stmt|
				    	consonant++;//1)0++ |2)1++ |4)2++|
				    	System.out.println(consonant);//1)Prints 1 |2)Prints 2 |4)prints 3|
				    }
				}
		//To count No. of Vowels Consonants Whitespace
		System.out.println("Total No. of Vowels: "+vowel);
		System.out.println("Total No of Consonants: "+consonant);
		System.out.println("Total No of WhiteSpaces: "+whitespace);
		    
		    //To check inputData is Vowel or Consonant or whitespace
		   /* if(array[ctr] == 'a'|| array[ctr] == 'e' || array[ctr] == 'i' ||array[ctr] == 'o' || array[ctr] == 'u'||
		       array[ctr] == 'A'||array[ctr] == 'E'|| array[ctr]=='I'|| array[ctr]=='O'|| array[ctr] == 'U')  
		    {
		    	System.out.println("its Vowel"); 
		    }
		    else if(array[ctr] == ' ')
		    {
		    	System.out.println("its Whitespace");
		    }
		    else
		    {
		    	System.out.println("its Consonant"); 	
		    }
		}*/
		
			System.out.println("====================================================================================================================");
			
			//Using Switch
			
			for(int ctr = 0; ctr<=inputData.length()-1;ctr++)
			switch(inputData.charAt(ctr))
			{
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U':	
					System.out.println("its Vowel");  
				break;
				case ' ':
					System.out.println("its Consonant");
				break;	
			    default:
				    System.out.println("its Whitespace");
				    
			}
			System.out.println(vowel);
			System.out.println(consonant);
			System.out.println(whitespace);
   	}

}

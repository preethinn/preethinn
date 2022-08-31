//Problem 20: Palindrome using function

package Sessiontwo;
public class PalindromeFunc 
{
	public static void main(String args[])
	{
		PalindromeFunc palindrome = new PalindromeFunc();
		palindrome.toCheckPalindrome(111);
		
	}
	
	void toCheckPalindrome(int number)
	{
		int rem,rev=0,temp=number;
		while(number > 0)
		{
		rem = number % 10;
		rev = rev * 10 + rem;
		number/=10;
		}
		System.out.println((temp==rev) ? "it is palindrome" : "its not palindrome");
	}

}

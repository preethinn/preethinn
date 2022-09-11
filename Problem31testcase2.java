//Problem 31: Test Case 2: when only start index given
package Sessionthree;
public class SubStringTest2 
{
	public static void main(String args[])
	{
		SubStringTest2 obj = new SubStringTest2();
		obj.toGetSubString("Hi From Java",1);
		System.out.println();
		obj.toGetSubString(1,"Hi From Java");
	}
	
	void toGetSubString(int count,String input)
	{
		String sub ="";
		int exit=input.length();//exit=12
		for(int ctr=count ; ctr <= exit-1; ctr++)//ctr=1 1<11 2 |2 2<11 3 |3 3<11 4 |4 4<12 5|5 5<11 6 |6 6<11 7| 7 7<11 8|8 8<11 9
			                                     //9 9<12 10|10 10<12 11|11 11<12 12|12 12<12 no
		{
			System.out.print(input.charAt(ctr));//1=i |2=space |3=F |4=r| 5=o |6=m |7=space|8=J|9=a|10=v|11=a
			sub += input.charAt(ctr);//sub=i |ispace |i F|i Fr|i Fro|i From|i From |i From J|i From Ja|i From Jav|i From Java
			//System.out.println(sub);
		}
	}
	void toGetSubString(String input,int count)
	{
		String sub ="";
		int exit=input.length();//exit=12
		for(int ctr=count ; ctr <= exit-1; ctr++)//ctr=1 1<11 2 |2 2<11 3 |3 3<11 4 |4 4<12 5|5 5<11 6 |6 6<11 7| 7 7<11 8|8 8<11 9
			                                     //9 9<12 10|10 10<12 11|11 11<12 12|12 12<12 no
		{
			System.out.print(input.charAt(ctr));//1=i |2=space |3=F |4=r| 5=o |6=m |7=space|8=J|9=a|10=v|11=a
			sub += input.charAt(ctr);//sub=i |ispace |i F|i Fr|i Fro|i From|i From |i From J|i From Ja|i From Jav|i From Java
			//System.out.println(sub);
		}
	}

}

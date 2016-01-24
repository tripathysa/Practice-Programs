//Given two strings, write a method to decide if one is permutation of other.
import java.util.*;
import java.io.*;
import java.lang.*;
class two
{
	public static void main(String args[])
	{

		String s1=args[0];
		String s2=args[1];
		if(s1.length()!=s2.length())
		{
			System.out.println("No! strings are not permutation of each other");
			System.exit(0);
		}
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		String sortedS1=new String(c1);
		String sortedS2=new String(c2);
		System.out.println(sortedS1);
		System.out.println(sortedS2);		
		if(sortedS1.equals(sortedS2))
		{
			System.out.println("Yes! strings are permutation of each other");
		}
		else
		{
			System.out.println("No! strings are not permutation of each other");
		}
		
	}
}
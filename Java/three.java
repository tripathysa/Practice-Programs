//URLify the string
import java.util.*;
import java.io.*;
import java.lang.*;
class three
{
	public static void main(String args[])
	{
		String s1;
		Scanner user_input = new Scanner( System.in );
        System.out.print("Enter a string to URLify: ");
        s1 = user_input.nextLine( );
		ArrayList<Character> c1 = new ArrayList<Character>();
        for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
			{
				c1.add('%');
				c1.add('2');
				c1.add('0');
			}
			else{
				c1.add(s1.charAt(i));
			}
		}		
		//Convert a character arrayList into string
		StringBuilder result = new StringBuilder(c1.size());
        for (Character c : c1) {
             result.append(c);
           }
         String output = result.toString();	
	    System.out.println("The URLified String is");
		System.out.println(output);
		
	}
}
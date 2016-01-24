//Check if a string has all the unique characters.
import java.util.*;
import java.io.*;
import java.lang.*;

class one
{
	public static void main(String[] args)
	{
		HashMap hm = new HashMap();
		String checkstr;
		Scanner user_input = new Scanner( System.in );
        System.out.print("Enter a string to test: ");
        checkstr = user_input.next( );
		for(int i=0;i<checkstr.length();i++)
		{
			if (hm.containsKey(checkstr.charAt(i)))
			{
				System.out.println("This string is not unique");
				System.exit(0);
			}
			else
			{
				hm.put(checkstr.charAt(i), 1);
			}
			
		}
		System.out.println("This string is unique");
		System.exit(0);
	}
}
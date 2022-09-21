// Java program to check if a given string is isogram or not
import java.io.*;
import java.util.*;
class Isogram {
	// Function to check if a given string is isogram or not
	static boolean is_isogram(String str)
	{
		// Convert the string in lower case letters
		str = str.toLowerCase();
		int len = str.length();
		char arr[] = str.toCharArray();
		Arrays.sort(arr);
		for (int i = 0; i < len - 1; i++) {
			if (arr[i] == arr[i + 1])
				return false;
		}
		return true;
	}

	// Driver code
	public static void main(String[] args)
	{
		String str1 = "Algorism";
	
		// Function call
		System.out.println(is_isogram(str1));

		String str2 = "pasSword";
	
		// Function call
		System.out.println(is_isogram(str2));

		String str3 = "Consecutive";
	
		// Function call
		System.out.println(is_isogram(str3));

	}
}


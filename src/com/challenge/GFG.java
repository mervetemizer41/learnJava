// Java Program to Iterate Over the Characters of a String
// Using StringTokenizer 	
// Importing required libraries
import java.io.*;
import java.util.*; 	
// Main class
class GFG {
	
// Method 1 	
// To traverse the string and 	
// print the characters of the string 	
static void traverseString(String str) 	
{ 	
	// If returnDelims is true, use the string itself as 	
	// a delimiter 	
	StringTokenizer st = new StringTokenizer(str, str, true);
	
	while (st.hasMoreTokens()) { 	
		System.out.print(st.nextToken() + " "); 	
	}
	
	System.out.println();
	
	// If returnDelims is false, use an empty string as 	
	// a delimiter 	
	st = new StringTokenizer(str, "", false);
	
	while (st.hasMoreTokens()) { 	
		System.out.println(st.nextToken()); 	
	} 	
}
	
// Method 2 	
// Main driver method 	
public static void main(String[] args) 	
{ 	
	// Custom input string 	
	String str = "GeeksforGeeks";
	
	/// Calling the above Method1 	
	traverseString(str); 	
}
}

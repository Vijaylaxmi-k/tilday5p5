//meta character
package myPackage;

import java.util.regex.Pattern;

public class Metacharacter1234 
{

	public static void main(String[] args) 
	{
//digit 
		System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
		System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once) 
//non-digit
		System.out.println(Pattern.matches("\\D", "1"));//false (digit)
		System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
		System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)
//non-digit with quantifier *
		System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)
	}

}

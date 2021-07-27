//patterns
package myPackage;
import java.util.regex.Pattern;

public class RefexExample 
{
	public static void main(String[]args)
	{
		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  
		System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
		System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)
		System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)
		
	}
/*	{
		Pattern p = Pattern.compile("[^hhh]{3}");
		Matcher m =p.matcher("h");
		
		if(m.matches())
			System.out.println("valid code");
		else
			System.out.println("invalid code");
	}
*/	
}

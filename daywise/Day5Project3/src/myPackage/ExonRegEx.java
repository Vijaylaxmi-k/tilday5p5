package myPackage;

import java.util.regex.Pattern;

public class ExonRegEx 
{

	public static void main(String[] args) 
	{
/*C a regex tat accepts alphanumeric characters only wit length mst b 6 characters long only.*/
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)  

/*C a regexp tat accepts 10 digit numeric characters starting with 7, 8 or 9 only.*/  
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true  
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true  
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true 
		

	
	}

}

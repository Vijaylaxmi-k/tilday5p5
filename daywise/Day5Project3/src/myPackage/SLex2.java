package myPackage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SLex2 
{

	public static void main(String[] args) 
	{
		{
			String data;
			Scanner obj= new Scanner(System.in);
			System.out.println("print any data");
			data=obj.next();
			//Pattern p = Pattern.compile("[^hhh]{3}");
			//Pattern p = Pattern.compile("\\^w{3}");
			Pattern p = Pattern.compile("\\D{3}");//non-digit true
			Matcher m =p.matcher(data);
			
			if(m.matches())
				System.out.println("valid code");
			else
				System.out.println("invalid code");
			obj.close();
		}
	}
}

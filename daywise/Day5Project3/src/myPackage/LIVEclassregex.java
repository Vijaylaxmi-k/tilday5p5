package myPackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LIVEclassregex 
{

	public static void main(String[] args) 
	{
		{
			//Pattern p = Pattern.compile("[^hhh]{3}");
			//Pattern p = Pattern.compile("\\^w{3}");
			//Pattern p = Pattern.compile("meg[0-9]*");
			Pattern p = Pattern.compile("meg[0-9]+");
			Matcher m =p.matcher("meg12");
			
			if(m.matches())
				System.out.println("valid code");
			else
				System.out.println("invalid code");
		}

	}

}

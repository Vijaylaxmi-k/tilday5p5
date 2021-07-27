package MyPackage;

public class msgoverriding 
{
	
class engmsg
{
	public void printhi()
	{
		System.out.println("HI");
	}
	public void printhello()
	{
		System.out.println("HELLO");
	}
	public void printgm()
	{
		System.out.println("GOOD MORNING");
	}
	
}
class hindimsg extends engmsg
{  
	@Override
	public void printgm()
	{
		System.out.println("SHUBODAYA");
	}
}

}
 
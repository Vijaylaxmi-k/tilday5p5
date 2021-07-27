package mypackaged5p1;

public class Waystodecarray {

	public static void main(String[] args) 
	{
		int[] data = new int[5];
	
		for(int i=0;i<5;i++)
			{System.out.println(data[i]);}
		System.out.println("------------1");
		
		for(int i=0;i<data.length;i++)
			{System.out.println(data[i]);}
		System.out.println("------------2");
		
		for (int d:data)
			{System.out.println(d);}
		System.out.println("------------3");
		
		for(var d:data)
			{System.out.println(d);}
		System.out.println("------------4");
	
	}

}

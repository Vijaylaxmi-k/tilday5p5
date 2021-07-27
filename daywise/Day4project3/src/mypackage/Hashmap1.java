package mypackage;

import java.util.HashMap;

public class Hashmap1 
{

	public static void main(String[] args) 
	{
	HashMap<Integer, String> data= new HashMap<Integer, String> ();
	data.put(1, "Arya");
	data.put(2, "Anu");
	System.out.println(data.values());//o/p is [Arya, Anu]
	} 

}

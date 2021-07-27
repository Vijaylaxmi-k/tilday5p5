//jaggedarray
package mypackaged5p1;

public class Jackkedaraayexmple1 
{

	public static void main(String[] args) 
	{
		char[][] names= new char[][]
		{
			new char[] {'v','i','j','a','y','l','a','x','m','i'},
			new char[] {'a','m','m','a'},
			new char[] {'o','m','i'}		
		};
			for (int i=0;i<names.length;i++)
			{
				for(int j=0;j<names[i].length;j++)
				{
					System.out.print(names[i][j]+" ");
				}
				System.out.printf(" \n");
			}
	}

}

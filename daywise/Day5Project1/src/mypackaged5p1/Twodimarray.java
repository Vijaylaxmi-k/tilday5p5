package mypackaged5p1;

public class Twodimarray {

	public static void main(String[] args) 
	{
		int[][] matrix= new int[][] {{1,2},{3,4},{5,6}};
		
		for (int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.printf(matrix[i][j]+" ");
			}
			System.out.println("\n" );
			
		}
		System.out.println(matrix.length);
	}
	
}

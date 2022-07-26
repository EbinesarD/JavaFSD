package lesson4;

public class matrixMultiplication 
{
	public static void mul(int a1[][], int a2[][], int r ,int c1,int c2)
	{
		int result[][]= new int[r][c2];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c2;j++)
			{
				for(int k=0;k<c1;k++)
				{
					result[i][j]+=a1[i][k]*a2[k][j];/*
					if(j==k)
					{
						result[i][k]+=a1[i][j]*a2[j][k];
					}*/
				}
			}
		}
		for(int row[]: result)
		{
			for(int column:row)
			{
				System.out.print(column+" ");
			}
			System.out.println();
		}		
	}
	public static void main(String[] args) {
		int a1[][] = {{1,2,3},{4,5,6}};
		int a2[][] = {{1,3},{5,7},{9,1}};
		int r = a1.length;
		int c1 = a1[0].length;
		int c2 = a2[0].length;
		mul(a1,a2,r,c1,c2);
		
	}

}

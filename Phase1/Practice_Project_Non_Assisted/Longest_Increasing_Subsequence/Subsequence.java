package Phase1.Practice_Project_Non_Assisted.Longest_Increasing_Subsequence;

public class Subsequence {
	public static void sequence(int a1[])
	{
		int l = a1.length;
		int count=0;
		int a2[] = new int[l];

		for(int i=0;i<l;i++)
		{
			a2[i]=1;
		}
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a1[i]>a1[j] && a2[i]<a2[j]+1)
				{
					a2[i]=a2[j]+1;
				}
			}
		}
		for(int i=0;i<l;i++)
		{
			if(count<a2[i])
			{
				count=a2[i];
			}
		}
		System.out.println("Count: "+count); 	
	}

	public static void main(String[] args) {
		int a1[]= {1,3,2,10,4,17,99,5};
		sequence(a1);		
	}
}

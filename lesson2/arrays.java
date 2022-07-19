package lesson2;
import java.util.*;
public class arrays {
	public static void main(String[] args) 
	{
		int a1[] = {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]+" ");
		}
		int a2[][] = {{1,2,3,4},{5,6,7,8}};
		System.out.println();
		System.out.println(a2[0].length);
		for(int j=0;j<a2.length;j++)
		{
			for(int k=0;k<a2[0].length;k++)
			{
				System.out.print(a2[j][k]+" ");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		int a3[] = new int[3];
		System.out.println("Enter the elements: ");
		for(int i=0;i<3;i++)
		{
			a3[i] = sc.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			System.out.println(a3[i]+" ");
		}
		sc.close();
	}
}

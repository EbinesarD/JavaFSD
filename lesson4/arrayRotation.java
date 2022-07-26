package lesson4;

public class arrayRotation 
{
	public void rotate(int num[], int l)
	{
		for(int j=l-1;j>=0;j-- )
		{
			System.out.print(num[j]);
		}
	}
	public void rotateelements(int num[] ,int k) {
		
		if(k> num.length) {			
			k= k% num.length;  
			int result[] = new int[num.length];					
			for(int i=0; i<k; i++) {
				
				result[i]= num[num.length-k+i]; 
			}			
			int j=0;		
			for(int i=k; i<num.length;i++) {				
				result[i]=num[j];
				j++;
			}	
			System.arraycopy(result, 0, num, 0, num.length);	
		}
	}
	
	public static void main(String[] args) {
		arrayRotation a = new arrayRotation();
		int arr[]= {1,2,3,4,5,6,7};
		int l = arr.length;
		System.out.println("Original array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println("\nRotating all elements: ");
		a.rotate(arr, l);
		System.out.println("\nRotating few elements: ");
		a.rotateelements(arr, 10);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

}

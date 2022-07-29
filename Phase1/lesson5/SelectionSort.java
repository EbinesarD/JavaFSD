package lesson5;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {30,43,1,15,20};	    
	    selectionSort(arr);	    
	    System.out.println("The sorted elements are:");	    
	    for(int i:arr){

	        System.out.print(i +" ");
	         }
	     }
	    public static void selectionSort(int[] arr){
	        for(int i=0;i<arr.length-1;i++){
	            int index =i;	            
	            for(int j=i+1;j<arr.length;j++){	            	
	                if(arr[j]<arr[index]){
	                    index =j;
	                }
	            }
	            int smallNumber = arr[index];
	            arr[index]= arr[i];
	            arr[i]= smallNumber;	            
	            
	    }
	}
}

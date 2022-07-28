package lesson5;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
        
        int[] arr= {10,90,79,20,67,30,34,40,88,50};        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Element to  be Searched: ");        
        int SearchValue= sc.nextInt();
        int result= linearing(arr,SearchValue);        
        if(result==-1) {
            System.out.println("Element Not Found In The Array");
        }
        else {
            System.out.println("Element Found at index: ["+result+"] , and Search  key is :"+arr[result]);
        }
        sc.close();
    }   
    private static int linearing(int[] arr,int searchValue) {
                        
        for(int i=0; i<arr.length; i++) {
            
            if(arr[i]==searchValue) {
                return i;
            }          
        }
        return -1;
    }
}

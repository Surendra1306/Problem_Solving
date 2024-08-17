package Algorithms;

import java.util.Scanner;

public class SelectionSort {
	
	static void sortArr(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int minIndex = i;
			for(int j=i; j<arr.length; j++) {
				if(arr[minIndex]>arr[j])
					minIndex=j;
			}
			int temp = arr[minIndex];
			arr[minIndex]= arr[i];
			arr[i]=temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		sortArr(arr);
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}

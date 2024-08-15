package Algorithms;

import java.util.Scanner;

public class BubbleSort {
	
	static void sortArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1;j++) {  //'-i', because for each iteration one largest element will move to the end
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		sortArr(arr); // tc = O(n^2) 
		System.out.println("After bubble sorting");
		for(int num:arr) {
			System.out.print(num+" ");
		}
		
	}
}

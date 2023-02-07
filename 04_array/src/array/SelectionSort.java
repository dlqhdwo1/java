package array;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {32,40,25,78,56};
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(String.format("%4d", arr[i]));
		}System.out.println();

		
		
		int tmp =0;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				  if(arr[i]>arr[j]) {
					  tmp = arr[i];
					  arr[i] = arr[j];
					  arr[j] = tmp;
					
				}
			}
		}
		
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(String.format("%4d", arr[i]));
		}
	}

}

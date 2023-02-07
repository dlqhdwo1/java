package array;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {32,40,25,78,56};   //arr.length ==5;
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(String.format("%4d", arr[i]));
		}System.out.println();

		
		
		int tmp;
		
		//버블정렬
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-1-i;j++) {   
				  if(arr[j]<arr[j+1]) {
					  tmp = arr[j];
					  arr[j] = arr[j+1];
					  arr[j+1]=tmp;
					  
				}
			}
		}
		
		
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(String.format("%4d", arr[i]));
		}
	}

}

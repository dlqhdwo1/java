package boj_;
import java.util.Scanner;
public class Boj_2566 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = sc.nextInt();
				
			}
		}
		
		int num = 0; 
		int index=0;
		int column=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				
				if(num<arr[i][j]) {
					num = arr[i][j];
					index = i;
					column =j;
					
				}
				
			}
			

		}
		
		System.out.println(num);
		System.out.println(index);
		System.out.println(column);
	}

}

package array;
import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 크기를 입력하세요.");
		int n = sc.nextInt();
		int result = 0;
		int[] arr = new int[n];
		

		System.out.println("배열의 데이터값을 입력해주세요.");
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println();
		
		//최대값
		int max = arr[0];
		
		for(int i=1; i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			
			
		}
		System.out.println("최대값:"+max);
		
		System.out.println();
		
		//최소값
		int min = arr[0];
		for(int i=0; i<arr.length;i++) {
			
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("최소값:"+min);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
			result = result + arr[i];
		}
		
		System.out.println("합:"+result);
	}

}


/*
[문제]

배열의 크기를 입력 받아서 배열을 생성한다.
배열 크기 입력 : 3
ar[0] 입력 : 25
ar[1] 입력 : 13
ar[2] 입력 : 57
*/
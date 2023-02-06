package array;
import java.util.Scanner;
public class Array04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu=0;
	    boolean[] arr = new boolean[5];
		int n=0;
		
		while(true) {
		System.out.println("주차장 관리 프로그램\r\n"
				+ "******************\r\n"
				+ "1.입차\r\n"
				+ "2.출차\r\n"
				+ "3.리스트\r\n"
				+ "4.종료\r\n"
				+ "******************\r\n"
				+ "메뉴:");
		   menu = sc.nextInt();
		   
		   	if(menu==1) {
		   		System.out.println("위치를 입력해주세요.");
		   		n=sc.nextInt();
		   		if(arr[n-1])System.out.println("이미주차됨");
		   		arr[n-1] =true;
		   		
		   	}
		   	
		   	else if(menu==2) {
		   		System.out.println("위치를 입력해주세요.");
		   		n = sc.nextInt();
		   		arr[n-1] =false;
		   	}
		   	
		   	else if(menu==3) {
		   		for(int i=0; i<arr.length;i++) {
		   			System.out.println(arr[i]);
		   		}
		   	}
		   
			if(menu ==4) break;

		}
		
	}

}


/*
[문제] 주차관리 프로그램 

[실행결과]
주차장 관리 프로그램
******************
1.입차
2.출차
3.리스트
4.종료
******************
메뉴:

3번인경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false
*/
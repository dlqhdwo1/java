package operator;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Money {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("돈을 입력하시오.");
		int money = sc.nextInt();
		
		DecimalFormat formatter = new DecimalFormat("###,###.##");
	
		String number = formatter.format(money);
		
		System.out.println(number);
		
		System.out.printf("천원: %d장", money/1000); 
		System.out.println();
		
		money = money%1000;
		System.out.printf("백원 : %d장", money/100 );
		System.out.println();
		
		money = money%100;
		System.out.printf("십원: %d장",money/10);
		System.out.println();
		
		money = money%10;
		System.out.printf("일원 %d장",money);
	}

}


/*
[문제]
현금 5378원이 있습니다.

[실행결과]
현금 : 5378원
천원 : 5장
백원 : 3개
십원 : 7개 
일원 : 8개 
 
 
*/

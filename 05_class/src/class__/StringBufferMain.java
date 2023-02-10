package class__;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringBufferMain {
	Scanner sc = new Scanner(System.in);
	private int dan;
	public void input() {
		System.out.println("원하는 답을 입력");
		dan = sc.nextInt();
	}
	
	public void output() {
		StringBuffer buffer = new StringBuffer();  //메소드 : append():추가해줌, delete() :제거해줌.
//		StringBuffer buffer =" "; 불가능 타입이 다름.  " " -> String타입임.
		
		
		
		for(int i=1; i<=9;i++) {
//			System.out.println(dan + " * " + i + "=" + dan*i);
			buffer.append(dan); 
			buffer.append("*");  // -> dan*
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			
			System.out.println(buffer.toString()); // StringBuffer -> String으로 변환.
			
			buffer.delete(0,buffer.length());
		}
	}
	

	public static void main(String[] args)  {
		
		StringBufferMain sm = new StringBufferMain();
		sm.input();
		sm.output();
	
	}

}


/*
[문제] 구구단

원하는 답을 입력 : 5 - > input함수


output함수
5*1= 5
5*2 = 10
5*9 = 45
*/
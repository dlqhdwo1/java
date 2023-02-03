package switch_;
import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		int a,b;
		char op;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		op = sc.next().charAt(0);
	
		
		switch(op) {
		case '+': System.out.println(a+b);
		break;
		case '-': System.out.println(a-b);
		break;
		case '*': System.out.println(a*b);
		break;
		case '/': System.out.println((double)a/b);
		break;
		case '#': System.out.println("연산자에러");
		}
		
		
	}

}/*

*[문제] 2개의 정수형 숫자와 연산자(+,-,*,/)를 입력하여 계산하시오

[실행결과]
a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : +

25 + 36 = xx

a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : /

25 / 36 = 0.6944444444444444

a의 값 : 25
b의 값 : 36
연산자(+,-,*,/)를 입력 : #

연산자 error

*
*/
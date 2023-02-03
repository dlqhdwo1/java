package for_;
import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int a, b , dap,result,score=0;
		for(int i=1;i<=5;i++) {
		a= (int)(Math.random()*90+10);
		b= (int)(Math.random()*90+10);
		result = a+b;
		
		System.out.println(a+ " + " + b + " = ");
		dap = sc.nextInt();
		
		if(dap==result) {
			System.out.println("정답입니다.");
			score = score+20;
		}
		else
		{
			System.out.println("오답입니다.");
		}
		
		}
		System.out.println("총점은:"+score);
		

	}

}


/*
[문제] 덧셈 문제

-2자리 숫자(10~99)만 제공한다.
a = 10~99사이의 난수발생
b = 10~99사이의 난수발생

[실행결과]
87+56 = 78 
틀렸다.
 
 */
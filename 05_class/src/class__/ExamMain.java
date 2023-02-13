package class__;
import java.util.Scanner;
public class ExamMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수 입력 :");
		int cnt = sc.nextInt();
		
		Exam[] e = new Exam[cnt];
		
		for(int i=0; i<cnt;i++) {
			e[i] = new Exam();
			e[i].compare();			
		}	
		System.out.println("이름     1 2 3 4 5 점수");
		for(int i=0; i<cnt;i++) {
			System.out.print(e[i].getName() + "\t");
			
			String ox2 = new String(e[i].getOx());
			
			for(int j=0; j<ox2.length();j++) {
				System.out.print(ox2.charAt(j)+ " ");
			}
			
			
//			System.out.print(e[i].getOx());
			
			System.out.println(e[i].getScore());
		}
	}
}
/*

클래스명 Exam
private String name =null;
private String dap = null;
private char[] ox = null;
private int score =0;
private final String JUNG="11111";//상수화
//						   12345
메소드
생성자 - Scanner이용하여 이름과 답을 입력 받는다. 
compare()비교
getName()
getOx()
getScore()

클래스명 : ExamMain

[문제] 사지선다형
-총 5문제의 답을 입력받는다.
-정답은 "111111"이다
-맞으면 o 틀리면 x
-한점수당 20점씩 처리.

[실행결과]
인원수 입력 : 2명

이름입력 : 홍길동
답입력 : 12311
	   11111
이름입력 : 코난
답 입력 : 24331

이름  1 2 3 4 5 점수
홍길동 o x x o o  60   //Exam 
코난  x x x x o  20   //Exam

*/
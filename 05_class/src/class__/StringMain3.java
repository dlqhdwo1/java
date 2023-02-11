package class__;
import java.util.Scanner;
public class StringMain3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열입력");
		String st1 = sc.next();
		st1 = st1.toLowerCase();
		System.out.println("현재 문자열 입력");
		String st2 = sc.next();
		System.out.println("바꿀 문자열 입력");
		String change = sc.next();
		int count =0;
		int index2=0;
		int result=0;
		int i=0;
			
		while(true) {
		index2 = st1.indexOf(st2,result);
		result = index2;
//		System.out.println(index2);
		
		
		if(index2==-1) {break;}
		count++;
		
		if(result ==index2) {result++;}
	
		}
	
		if(st1.length()<st2.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다.");
			System.out.println("치환 할 수 없습니다.");
		}
		
		else{
		st1.replace(st2, st1);
		System.out.println(st1.replace(st2, change));
		System.out.println(count+"번 치환");
		}
	}

}
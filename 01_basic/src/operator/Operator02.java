package operator;
import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
     	String result = (num%2==0) ? "짝수입니다.":"홀수입니다.";
		
		String result2 = (num%2==0 && num%3==0)? "공배수입니다":"공배수아니다";
		
		System.out.println(result);
		System.out.println(result2);
		
		
//		if(num%2==0)
//		{
//			System.out.println("num은 짝수입니다.");
//		}
//		else {
//			System.out.println("num은 홀수입니다.");
//		}

	}

}

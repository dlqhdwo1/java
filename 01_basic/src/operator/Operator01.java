package operator;
import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		
		int score = sc.nextInt();
		
//		if(score>=80 && score <=100)
//		{
//			System.out.println("합격입니다.");
//		}
//		else 
//			System.out.println("불합격입니다.");
//		
		
		String result = score>=80 && score<=100 ? "합격":"불합격";
		System.out.println(result);
		System.out.println(score>=80 && score<=100 ? "합격":"불합격");
		
	}

}

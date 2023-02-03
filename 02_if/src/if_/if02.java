package if_;
import java.util.Scanner;
public class if02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		
		double avg = (score1+score2+score3)/3.0;
		
		if(avg>=60 && score1>=40 && score2>=40 && score3>=40) {
			System.out.println("합격입니다.");
		}else
			System.out.println("불합격입니다");
	}

}


/*
[문제]
3과목 (a,b,c)의 점수를 입력받아서 합격인지 불합격인지 출력하시오
합격은 평균이 60점 이상이어야하고 , 각 과목이 40점 이상이어야한다.
 */
package while_;
import java.util.Scanner;

public class NumberGame2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		int com = (int)(Math.random()*100+1);
		int user= 0;
		int count=0;
		
		while(true) {
			System.out.println("숫자입력 1~100");
			user = sc.nextInt();
			
			if(user<com) System.out.println("크게");
			else if(user>com) System.out.println("작게");
			else if(user==com) break;
			count++;
		}
		
		System.out.println(count+"번만에 맞추었습니다.");
		

		
		System.out.println("한번더 (y/n):");
		String yn = sc.next();
		//if(yn=='n'|| yn =='N')break;
		if(yn.equals("n") || yn.equals("N"))break;
//		
//		else if(yn.equals("y") || yn.equals("Y"))continue Loop;
//		
		else System.out.println("다시입력");
		}	//while
		
		
		System.out.println("프로그램을 종료합니다.");
		

	}

}

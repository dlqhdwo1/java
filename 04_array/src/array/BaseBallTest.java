package array;
import java.util.Scanner;
public class BaseBallTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		int[] com = new int[3];
		int[] user = new int[3];
		int strike=0;
		int ball=0;
		String ans;
	
		System.out.println("게임을 실행하시겠습니까?(y/n)");
		ans = sc.nextLine();
		
		
		if(ans.equals("y")) {
		System.out.println("게임시작!");
	
		for(int i=0; i<com.length;i++) {
			com[i] = (int)(Math.random()*9+1);
			for(int j=0; j<i;j++) {
			
			if(com[i] == com[j]) {i--;break;
			}
			}
		}
		System.out.println();
		
		//반복시작!
		while(true) {
			strike=0;
			ball=0;
//		for(int i=0; i<com.length;i++)System.out.print(com[i]);
	
		num = sc.nextInt();
		
		
		for(int i=user.length-1; i>=0;i--) {
			user[i]= num%10;
			num= num/10;
		}

		for(int i=0; i<com.length;i++) {
			for(int j=0;j<user.length;j++) {
				if(com[i]==user[j]) {
					if(i!=j)ball++;
				}
				if((i==j) && (com[i]==user[j]))strike++;
			}	
		}
		System.out.println("볼:"+ball);
		System.out.println("스트라이크:"+strike);
		
	if( (com[0]==user[0]) && (com[1]==user[1])&&(com[2]==user[2]) )
		{
		System.out.println("숫자를 맞추었습니다.");
		break;
		}
	
		}
		}//while
		
		else System.out.println("프로그램을 종료합니다.");
	}
}

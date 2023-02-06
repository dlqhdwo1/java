package for_;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int coin = 1000;
		int coin2 =0;
		
		
		while(coin>=300){

			int com = (int)(Math.random()*3+1);
		
		System.out.println("번호입력->가위(1) 바위(2) 보자기(3) 게임종료(0),[게임종료:0]");
		int user = sc.nextInt();
		
		if(user<1 || user >3)System.out.println("1~3사이의 숫자를 입력해주세요.");
		
		if(user==0) break;
		
		
			
		if(user==1) {  //사용자 가위
			if(com==2) { 
				System.out.println("나: 가위");
				System.out.println("컴퓨터:바위");
				System.out.println("졌습니다.");	
			}
			if(com==3) {
				System.out.println("나: 가위");
				System.out.println("컴퓨터:보자기");
				System.out.println("이겼습니다..");	
			}
			if(com==1)
				{
				System.out.println("나:가위");
				System.out.println("컴퓨터:가위");
				System.out.println("무승부입니다.");
				}
			
			coin= coin-300;
			System.out.printf("남은 코인은 %d원입니다.\n",coin);
			if(coin<300) {
				System.out.println("코인이 부족합니다. 게임을 더하시겠습니까? insert coin,[게임종료:0]");
				coin2 = sc.nextInt();
				coin=coin+coin2;
				System.out.println("충전후금액 :"+coin);
			}
		}
		
		if(user==2) {
			if(com==1) {
				System.out.println("나: 바위");
				System.out.println("컴퓨터:가위");
				System.out.println("이겼습니다.");	
			}
			if(com==3) {
				System.out.println("나: 바위");
				System.out.println("컴퓨터:보자기");
				System.out.println("졌습니다.");	
			}
			if(com==2) {
				System.out.println("나:바위");
				System.out.println("컴퓨터:바위");
				System.out.println("무승부입니다.");
			}
			coin = coin-300;
			System.out.printf("남은 코인은 %d원입니다.\n",coin);
			if(coin<300) {
				System.out.println("코인이 부족합니다. 게임을 더하시겠습니까? insert coin,[게임종료:0]");
				coin2 = sc.nextInt();
				coin=coin+coin2;
				System.out.println("충전후금액 :"+coin);
			}
		}
		if(user==3) {
			if(com==1) {
				System.out.println("나: 보자기");
				System.out.println("컴퓨터:가위");
				System.out.println("졌습니다..");	
			}
			if(com==2) {
				System.out.println("나: 보자기");
				System.out.println("컴퓨터:바위");
				System.out.println("이겼습니다..");	
			}
			if(com==3){
				System.out.println("나: 보자기");
				System.out.println("컴퓨터:보자기");	
				System.out.println("무승부입니다.");
			}
			
			coin=coin-300;
			System.out.printf("남은 코인은 %d원입니다.\n",coin);
			
			if(coin<300) {
				System.out.println("코인이 부족합니다. 게임을 더하시겠습니까? insert coin,[게임종료:0]");
				coin2 = sc.nextInt();
				coin=coin+coin2;
				System.out.println("충전후금액 :"+coin);
			}
			


		}
		
	
		}
		
		
		
		
	}
}


/*
[문제]
가위,바위,보 게임 

->가위(1) 바위(2) 보자기(3) 지정한다.
한게임당 300원


->가위(1) 바위(2) 보자기(3) 중 번호입력 : 3(user,사용자)
컴퓨터는 난수로 1~3까지
컴퓨터 : 바위 나 : 보자기 
You win!!
[실행결과]
insert coin : 1000

가위(1) 바위(2) 보자기(3):1( user)
컴퓨터 :가위 나 : 가위 ->무승부

 */
package operator;
import java.util.Random;


public class Dice {

	public static void main(String[] args) {
	
		
		
		int dice1 = (int)(Math.random()*6+1);
		int dice2 = (int)(Math.random()*6+1);
		
		
		System.out.println(dice1);
		System.out.println(dice2);

		
		
		String result = (dice1<dice2)? "주사위2승" : (dice1>dice2)? "주사위1승" : "무승부";
		
		System.out.println(result);
		
//		if(dice1<dice2)
//		{
//			System.out.println("주사위2승");
//			System.out.println(dice1+dice2);
//		}
//		
//		
//		else if(dice1>dice2)
//		{
//			System.out.println("주사위1승");
//			System.out.println(dice1+dice2);
//		}
//		
//		else if(dice1 == dice2) {
//			System.out.println("무승부");
//			System.out.println(dice1+dice2);
//		
		}
		}

//}


/*
[문제]
주사위게임 -난수
2개의 주사위를 던져서 큰 값을 가진 주사위가 승이다.
주사위 값의 합도 출력하시오.

 [실행결과]
 주사위1: 3 주사위2: 1
 주사위 1 승
 -----------------------------------------
 주사위2: 4 주사위2: 6
 주사위 2 승
 -------------------------------------------
 주사위3: 3 주사위2: 3 
 무승부.
*/

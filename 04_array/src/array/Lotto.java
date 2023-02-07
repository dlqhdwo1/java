package array;
import java.util.Scanner;
public class Lotto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		int[] num = new int[6];
		
		for(int k=1; k<=money/1000;k++) {
		
	
		for(int i=0; i<num.length;i++) {
			num[i] = (int)(Math.random()*44+1);	
			
			for(int j=0;j<i;j++) {
			if(num[i] == num[j]) {
			i--;break;
			}
		}
		}  //배열값 중복체크로직.
		
		int tmp=0;
		for(int i=0; i<num.length;i++) {
			for(int j=i+1; j<num.length;j++) {
				
				if(num[i]>num[j]) {
					tmp = num[i];
					num[i] = num[j];
					num[j]=tmp;
				}
				}
			}
		//배열 값비교로직.
	
		for(int j=0; j<num.length;j++) {
			System.out.print(String.format("%5d",num[j]));	
		}
		
		System.out.println();
		
		
		if(k%5==0)
			System.out.println();
		
		}//for
		
		
		
		
}
}


/*
[문제]
크기가 6개인 배열 생성.
난수는 1~45사이의 난수 발생.
숫자는 sort(오름차순)되어야함.
출력시 자릿수는 5자리 
실행결과 현금입력 : 
*/
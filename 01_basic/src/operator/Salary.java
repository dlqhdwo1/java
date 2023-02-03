package operator;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###,###");
		int saegum=0;
		int total=0;
		int salary=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름입력:");
		String name = sc.nextLine();
		System.out.println("직급입력");
		String Jik = sc.nextLine();
		System.out.println("기본급입력");
		int num = sc.nextInt();
		System.out.println("수당입력");
		int num2 = sc.nextInt();
		
		total = num + num2;
		
		double saegum_rate = (total>=5000000)? 0.03:(total>=3000000)?0.02 :0.01;
		
//		if(total>=5000000)
//			saegum = (int) (total * 0.03);
//		else if(total>=3000000)
//			saegum=(int) (total *0.02);
//		
//		else 
//			saegum = (int)(total*0.01);
		saegum = (int)(total*saegum_rate);
		salary = total - saegum;
		
		System.out.printf("***%s\t%s\t월급***",name,Jik);
		System.out.println();
		System.out.println("기본급:["+num+"]==>"+df.format(num));
		System.out.println("수당:["+num2+"]==>"+df.format(num2));
		System.out.println("합계:["+total+"]==>"+df.format(total));
		System.out.println("세금:["+saegum+"]==>"+df.format(saegum));
		System.out.println("월급:["+salary+"]==>"+df.format(salary));
	}

}


/*
 * [문제] 월급 계산 프로그램 - 조건 연산자
이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오
단 합계가 5,000,000원 이상이면 3%
       3,000,000원 이상이면 2%
       아니면 1%
       
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원
 * 
 * 
 */

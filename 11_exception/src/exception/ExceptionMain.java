package exception;
import java.util.Scanner;
public class ExceptionMain {

	public static void main(String[] args) {
		
		if(args.length>=2) {
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
			System.out.println(args[3]);
		}
		System.out.println();
		try {
		int num1 = Integer.parseInt(args[0]);
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력");
		int num2 = sc.nextInt();
		System.out.println(num1+ " / " + num2 + " = " + (num1/num2));
		}catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("반드시 숫자형식 입력");	
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("0으로는 나눌수 없습니다.");
		}finally {
			System.out.println("error가 있건 없건 무조건 실행!!");
		}
	}
}

package class_;
import java.util.Scanner;
public class ComputeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Compute[] c = new Compute[2];
		
		for(int i=0; i<c.length;i++) {
			c[i] = new Compute();
		}
		
		for(int i=0; i<c.length;i++) {
			c[i].setX(sc.nextInt());
			c[i].setY(sc.nextInt());
			
			System.out.println(i+1+"번째값.");
			
		
			c[i].setSum(c[i].getX(),c[i].getY());
			c[i].setSub(c[i].getX(),c[i].getY());
			c[i].setMul(c[i].getX(),c[i].getY());
			c[i].setDiv(c[i].getX(),c[i].getY());
			
			System.out.println("x      y      sum      sub    mul     div");
			System.out.print(c[i].getX()+ " \t");
			System.out.print(c[i].getY()+ " \t");
			System.out.print(c[i].getSum()+ " \t");
			System.out.print(c[i].getSub()+ " \t");
			System.out.print(c[i].getMul()+ " \t");
			System.out.print(c[i].getDiv()+ " \t");
		}
		
	}

}


/*
[문제]사칙연산

+ -

x와 y를 입력하여 합차곱몫을 반환하시오.
[실행결과]
횟수 입력 : 2
[1번째]
x입력 : 25
y입력 : 36

[2번째]
x입력 : 25
y입력 : 36
x y sum sub mul div
*/
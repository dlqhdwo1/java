package interface_;

import java.util.Scanner;

public class Div implements Compute {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	
	@Override
	public void disp() {
		System.out.println(" a / b = "+ (a/b));
	}
}

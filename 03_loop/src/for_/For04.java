package for_;
import java.util.Scanner;
public class For04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result=1;
		int x= sc.nextInt();
		int y = sc.nextInt();
		
		for(int i=1; i<=y;i++) {
			result = result*x;
			System.out.println(result);
			
		}
		
		
	}

}

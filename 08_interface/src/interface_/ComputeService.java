package interface_;
import java.util.Scanner;
public class ComputeService {
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		Compute c=null;
		
		while(true) {
			System.out.println();
			System.out.println("*****************");
			System.out.println("   1.합");
			System.out.println("   2.차");
			System.out.println("   3.곱");
			System.out.println("   4.몫");
			System.out.println("   5.끝내기");
			System.out.println("*****************");
			System.out.println("번호 : ");
			int num = sc.nextInt();
			
			if(num ==1) {
				c = new Sum();
				
			}
			else if(num==2) {
				c = new Sub();		
			}
			else if(num==3) {
				c = new Mul();
				
			}
			else if(num==4) {
				c= new Div();
					
			}	
			else if(num==5)break;
			c.disp();
		}
				
	}
}


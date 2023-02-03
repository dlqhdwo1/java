package if_;
import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<b && a<c ) {  //a가 가장 작은경우
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			
			if(b<c) System.out.println(a+","+b+","+c);
			else System.out.println(a+","+c+","+b);
		}
		
		else if(b<c) {
			if(a<c)System.out.println(b+","+a+","+c);
			else System.out.println(a+","+c+","+a);
		}else { 
			if(a<b)System.out.println(c+","+a+","+b);
			else System.out.println(c+","+b+","+a);
			
		
		}
	
		
		

	}

}


/*
 [문제]
 
  
 
 */

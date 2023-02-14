package boj_;
import java.util.Scanner;
public class Boj_11047 {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		

	
       int n = sc.nextInt();
       int Price = sc.nextInt();
		
        
		
		int[] money = new int[n]; 
		
		int result =0;

		for(int i= 0; i<n;i++) {
			money[i] = sc.nextInt();		
		}
		
		for(int i=n-1;i>=0;i--) {
			if(money[i]<Price)
			{
				result += (Price/money[i]); //4,
				Price = Price%money[i]; //790
			}

		}
		
		System.out.println(result);
		
	}

}

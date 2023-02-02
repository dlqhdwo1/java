package basic;
import java.util.Arrays;
import java.util.Random;
public class MethodTest02 {

	public static void main(String[] args) {
		
		double a = Math.random()*100;
		System.out.println(a);
		
		Random r = new Random();
		double b = r.nextDouble();
		System.out.println(b);
		
		int ar; //정수형변수.
		
		int[] ar2 = new int[5]; // ar배열선언.
		
		ar2[0] = 25;
		ar2[1] = 13;
		ar2[2] = 45;
		ar2[3] = 30;
		ar2[4] = 15; 
//		
//		System.out.println(ar2[0]);
//		System.out.println(ar2[1]);
//		System.out.println(ar2[2]);
//		System.out.println(ar2[3]);
//		System.out.println(ar2[4]);

		Arrays.sort(ar2);
		
		System.out.println(ar2[0] +","+ ar2[1] +","+ ar2[2]+","+ ar2[3] +","+ ar2[4]);
		
		
		for(int i = 0; i<ar2.length;i++) {
			Arrays.sort(ar2);
			System.out.println(ar2[i]);
			
		}
	}
	
}

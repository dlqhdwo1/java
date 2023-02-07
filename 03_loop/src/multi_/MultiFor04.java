package multi_;
import java.util.Scanner;



public class MultiFor04 {

	public static void main(String[] arg) {



		for (int i = 2; i < 10; i += 3) {

			for (int j = 1; j < 10; j++) {

				for (int k = i; k < i + 3; k++) {
					if(k==10)break;
					System.out.print(k + "*" + j + "=" + k * j + "\t");
					
				}
				
					System.out.println();

			}

			System.out.println();

		}

	}

}
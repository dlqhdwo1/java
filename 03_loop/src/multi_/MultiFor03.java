package multi_;

public class MultiFor03 {

	public static void main(String[] args) {
		
		for(int i=1; i<=9;i++) {
			
			for(int j=1;j<=9;j++) {
				
				
				for(int k=i; k<=i+3;k++) {
					System.out.print(k + "*" + j + "="+k*j + "\t");
					
				}
				System.out.println();
			}
			System.out.println();
			
		
		}

	}

}

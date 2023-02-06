package array;

public class ArrayTest02 {

	public static void main(String[] args) {
		char[] ar = new char[50];
		int[] count = new int[26];
		int eng;
		for(int i=0; i<count.length;i++) {
			
			
			for(int j=0;j<ar.length;j++) {
				ar[j] = (char)(int)(Math.random()*25+65);
				
				if(j%10==0)
					System.out.println();
				
				System.out.print(ar[j]);
				count[ar[j]-65]++;
			}
				
			}
		
		
		for(int i=0; i<count.length;i++) {
			System.out.println((char)(i+65)+":"+count[i]);
		}
			
		
		
	
		
		
		
	}

}

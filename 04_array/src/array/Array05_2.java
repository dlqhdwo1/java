package array;

public class Array05_2 {

	public static void main(String[] args) {
		
		char[] ar = new char[50];
		int[] count = new int[26];
		
		for(int i=0;i<ar.length;i++) {
			ar[i] = (char)(Math.random()*26+65);
			for(int j=0; j<count.length;j++) {
				if(ar[i]=='A'+j)count[j]++;
			}
		}

		for(int i=0; i<ar.length;i++) {
			
			System.out.print(ar[i] + " ");
			if((i+1)%10==0)System.out.println();
			
		}
		
		
		for(int i=0; i<count.length;i++) {
			System.out.println((char)(i+65) +"의개수"+count[i]);
		}

	}

}

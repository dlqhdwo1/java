package while_;

public class DoWhile {

	public static void main(String[] args) {
		int a=0;
		do {
			a++;
			System.out.println(a+" ");
		}while(a<10);
			
		char ch ='A';
		int count =0;
		while(ch<='Z') {
			
			System.out.print(ch + " ");
			ch++;
			count++;
			
			if(count%7==0) {
				System.out.println();
			}
		}

	}

}

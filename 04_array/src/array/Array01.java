package array;

public class Array01 {

	public static void main(String[] args) {
		int[] ar;
		ar = new int[5];  // ar = int[]배열의 시작주소를 가지고 있음.  [I@3d012ddd
		System.out.println("배열명 ar = "+ar);  // 배열명 ar = [I@3d012ddd     I->Integer의약자.
		
		ar[0]=25;
		ar[1]=37;
		ar[2]=55;
		ar[3]=42;
		ar[4]=30;
		
//		for(int i=0; i<ar.length;i++)
//		{
//			System.out.println(ar[i]);
//		}

		 
		for(int i=ar.length-1;i>=0;i--) {
			System.out.println(ar[i]);
		}
		
		System.out.println();
		
		System.out.println("홀수 데이터만 출력");
		
		
		for(int i=0; i<ar.length;i++) {
		if(ar[i]%2==1) {
			System.out.println(ar[i]);
		}
		}
		
		
		System.out.println();
		
		for(int data : ar) { //ar의 크기만큼 for문을 반복한다.
			System.out.println(data);
		}
		
		
		

	}

}

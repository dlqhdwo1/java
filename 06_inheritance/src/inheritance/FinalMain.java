package inheritance;



enum Color{
	RED , GREEN, BLUE
	
}

//----------------------------------------------------
class Final{
	public final String FRUIT = "사과"; // final변수는 대부분 접근제한자를 public으로 지정함. 아무데서나 값을 써야하기때문.
	public final String FRUIT2;
	
	public static final String ANIMAL ="기린";
	public static final String ANIMAL2;
	public static final int RED=0;
	public static final int GREEN=1;
	public static final int BLUE=2;
	
	static {
		System.out.println("statc 초기화 영역");
		ANIMAL2 = "코끼리";
	}
	
//	Final(){
//		
//	}
	
	Final(String fruit){
		this.FRUIT2 = fruit;
	}
	
}

//-----------------------------------------------
public class FinalMain {

	public static void main(String[] args) {
		
//		Final f = new Final();
		
		final int A = 10;  //상수화걸기  , 상수 변수는 대문자로 지정해주기.
		//A = 20; // error : final은 값을 변경할 수 없다.
		System.out.println("A : " +A);
		
		final int B;  
		B=30; // 상수 B에는 가비지 값이 (초기값이없음)있어서 B=30초기화가 가능함. 
	//	B=40; // 이미 초기화가 되어있어서 에러가 뜸.
		System.out.println("B : "+ B);
		
		Final f2 = new Final("딸기");
		
//		System.out.println(f.FRUIT);
		System.out.println(f2.FRUIT2);
		
		System.out.println(Final.ANIMAL);
		System.out.println(Final.ANIMAL2);
		
		System.out.println("빨강 = " + Color.RED);
		System.out.println("초록 = " + Color.RED.ordinal()); // 0 
		System.out.println("파랑 = " + Color.BLUE);
		
		for(Color c : Color.values()) {
			System.out.println(c +  "\t" + c.ordinal() );
		}
		
	}

}

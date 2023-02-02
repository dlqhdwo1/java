package basic;
class Test{
	int a=10;
	static int b =20;
	static String str;   //초기값 null값.
}


public class Variable02 {
	int a; //전역변수 (필드) , 초기화되있음. 
	static int c;  //클래스생성없이 사용가능 , 실행하자마자 메모리에 잡힘.

	public static void main(String[] args) {
		int a=5; //지역변수 => 값안주면 쓰레기값 들어있음. 
		System.out.println(a);
		Variable02 v = new Variable02(); //메모리 생성
		
		System.out.println(v);
		System.out.println(v.a);
		System.out.println(c);
		
		
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(Test.b);
		System.out.println(Test.str);
	}
}

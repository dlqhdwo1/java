package class__;

class StaticTest{
	private int a; //필드,인스턴스변수
	private static int b; //필드,클래스변수
	
	static {  //StaticTest 부르자마자 static은 자동으로 실행됨.
		System.out.println("static초기화 영역");
		StaticTest.b = 5; 
//		this.b = 7; b는 클래스꺼 this가 생략된것아님.
		
	}
	
	
	StaticTest(){
		System.out.println("기본 생성자");
		this.a=5;
	}
	
	public void calc() {
		a++;
		b++;
	}
	public void disp() {
		System.out.println("a = " + a + " b = " + b);
	}
	public static void output() {
		System.out.println("static method....");
//		System.out.println("a = " + a + " b = " + b); error => static메소드안에서는 static변수만 사용가능.
	}
}

//---------------------------------
public class StaticMain {
	private int a; //필드,초기화되어있음 ( 가비지값이 없음. )  , 인스턴스 변수
	private static int b; //필드 , 클래스변수

	
	public static void main(String[] args) {
		StaticTest aa = new StaticTest();
		aa.calc();
		aa.disp();
		
		System.out.println();
		
		StaticTest bb = new StaticTest();
		bb.calc();
		bb.disp();
		
		System.out.println();
		
		StaticTest cc = new StaticTest();
		cc.calc();
		cc.disp();
		
		System.out.println();
		
		StaticTest.output();//클래스명.메소드
		aa.output();
		bb.output();
		cc.output();
		
	}

}

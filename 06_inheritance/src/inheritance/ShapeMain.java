package inheritance;

import java.util.Scanner;

class Shape{
	
	protected double area;
	protected Scanner scan = new Scanner(System.in);
	
	public Shape() {
		System.out.println("ShapeTest기본생성자");
	}
	public void calcArea() {
		System.out.println("도형을 계산합니다.");
	}
	public void dispArea() {
		System.out.println("도형을 출력합니다.");
	}
}

class Sam extends Shape{
	protected int base,height;
	
	public Sam() {
		System.out.println("Sam 기본 생성자");
		System.out.println("밑변:");
		base = scan.nextInt();
		System.out.println("높이:");
		height = scan.nextInt();

	}
	
	//어노테이션
	//@Override 오버라이드하는것을 알려줌.
	@Override 
	public void calcArea() {
		area = base * height /2.0;
	}
	
//	@Override  : 오버라이드가안되면 자동으로 컴파일 에러가 발생함.
	@Override
	public void dispArea() {
		System.out.println("삼각형의 넓이 : " + area);
	}
	
}


class Sa extends Shape{
	protected int base;
	protected int height;
	
	
	Sa(){
		base = scan.nextInt();
		height = scan.nextInt();
	}
	@Override
	public void calcArea() {
		
		area = base * height;
	}
	
	@Override
	public void dispArea() {
		System.out.println("사각형의 넓이 : " +area);
	}
}

class Sadari extends Shape{
	protected int bottom;
	protected int height;
	protected int top;
	
	Sadari(){
		System.out.println("윗변입력:");
		height = scan.nextInt();
		System.out.println("밑변입력:");
		bottom = scan.nextInt();
		System.out.println("높이 입력:");
		top = scan.nextInt();
	}
	
	@Override
	public void calcArea() {
		area = (height * bottom) * top /2.0;
		
	}
	
	@Override
	public void dispArea() {
		System.out.println("사다리의면적: "+area);
	}
}
//----------------------------------
public class ShapeMain {

	public static void main(String[] args) {
		
		
//		Sam sam = new Sam();
//		sam.calcArea();
//		sam.dispArea();
//		
		/*
		Sa sa = new Sa();
		sa.calcArea();
		sa.dispArea();
		
		
		Sadari sd = new Sadari();
		sd.calcArea();
		sd.dispArea();
		*/
		
		//다형성 - > 부모가 자식클래스를 참조할수있다.
		
		Shape shape;
		shape = new Sam();
		
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new Sa();
		shape.calcArea();
		shape.dispArea();
	
		System.out.println();
		
		shape = new Sadari();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
	}

}

package inheritance;

public class SubMain extends Super{
	private String name;
	private int age;
	
	SubMain(){
		System.out.println("기본생성자");
	}
	
	SubMain(String name, int age,double weight, double height){
		this.name = name;
		this.age = age;
		this.weight = weight; //상속받은Super클래스변수
		this.height = height; //상속받은Super클래스변수
	}
	
	public void output() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		disp();
	}
	
	public static void main(String[] args) {		
//		SubMain s = new SubMain("홍길동",25,73.5,182.6);
//		s.output();
		
		System.out.println("========================");
		Super bb = new SubMain("코난",13,26.5,172.6);
		//호출불가bb.output() // 호출불가.
		bb.disp();
		System.out.println(bb.getWeight());
		
		SubMain bb2 = new SubMain("코난",13,26.5,172.7);
		
		
		
	}

}


//자식클래스는 메모리에 생성할때 
// 부모클래스 생성함
// 자식클래스 생성
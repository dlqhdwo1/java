package inheritance;

public class ChildMain extends Super {

	private String name;
	private int age;
	
	ChildMain(){
		System.out.println("기본생성자");
	}
	
	ChildMain(String name, int age,double weight, double height){
		super(weight,height); //부모 생성자 호출
		
		this.name = name;
		this.age = age;
//		super.weight = weight; //상속받은Super클래스변수
//		this.height = height; //상속받은Super클래스변수
	}
	
	public void disp() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		super.disp();  //자식에게도 같은 disp메소드가 정의 되어있으므로 구별하기위해 super라고 지정해줘야함.
	}
	
	public static void main(String[] args) {
		
		ChildMain aa = new ChildMain("홍길동",25,73.5,192.6);
		aa.disp();
		
		
		System.out.println("========================");
		Super bb = new ChildMain("코난",13,24.5,152.6);
		bb.disp();
		
		
	}

}

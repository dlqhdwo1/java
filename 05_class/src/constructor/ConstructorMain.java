package constructor;

public class ConstructorMain {
	int a;
	String name;
	public ConstructorMain() {
		System.out.println("기본생성자");
	}
	
	public  ConstructorMain(int a) {
		this("코난");
		this.a =a;
		System.out.println(a);
		System.out.println("default생성자");
	}
	public ConstructorMain(String name) {
		this();
		System.out.println("생성자");
		this.name = name;
		System.out.println(name);
	}

	public static void main(String[] args) {
		ConstructorMain aa = new ConstructorMain("안녕하세요"); 
		
		System.out.println(aa.a +","+ aa.name);
		
		ConstructorMain cc = new ConstructorMain(25);
		System.out.println(cc.a);

	}

}

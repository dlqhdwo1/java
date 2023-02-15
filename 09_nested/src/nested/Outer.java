package nested;
public class Outer {
	private String name;
	
	public void output() {
		Inner in = new Inner();
		System.out.println("이름 = " + this.name + "\t나이 = "+in.age);
	}
	
	class Inner{
		private int age;

		public void disp() {
			System.out.println("이름 = "+Outer.this.name +"\t나이 = "+age );
		}
		
	}
	
	public static void main (String[] args) {
		
		Outer ou = new Outer();
		ou.name = "홍길동";
		System.out.println("이름 = "+ou.name);
		System.out.println();
		
		Outer.Inner in = ou.new Inner(); // Outer안에 Inner조인을 in참조변수로 참조
		in.age = 25;
		System.out.println("나이 = " + in.age);
		
		System.out.println();
		
		Outer.Inner in2 = ou.new Inner();
		in2.age = 35;
		System.out.println("나이 = " + in2.age);
		
		System.out.println();
		
		Outer.Inner in3 = ou.new Inner(); // Outer안에 Inner조인을 in참조변수로 참조
		in3.age = 45;
		System.out.println("나이 = " + in3.age);
		
		Outer.Inner in4 = new Outer().new Inner();
//		in4.name ="코난";  //Inner에서 Outer변수를 사용할수없음 static에서는..
		in4.age=35;
		in4.disp();
	
	}
}

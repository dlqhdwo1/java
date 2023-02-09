package class_;

class This{
	private int b;
	private static int c; 
	
	public void set(int b) {
		System.out.println("this:"+this);
		this.b=c;
	}
	
	public int get() {
		return b;
	}

	
	public void staticset(int c) {
		this.c=c;
	}
	
	public  int staticget() {
		return c;
	}
	
}

public class ThisMain {

	private int a; //필드  같은 클래스내에 접근가능.
	
	public static void main(String[] args) {
		
		ThisMain t = new ThisMain();
		t.a =10;
		
		System.out.println(t.a);
		
		This th = new This();
		System.out.println("객체 th=:"+th);
		
		th.set(10);
		th.staticset(20);
		System.out.println(th.staticget());
		System.out.println("b = "+ th.get());
		
		This w = new This();
		System.out.println("객체 w=:"+w);
		w.set(40);
		w.staticset(50);
		
		System.out.println("w.b:"+w.get());
		System.out.println("w.static:"+w.staticget());
	}

}

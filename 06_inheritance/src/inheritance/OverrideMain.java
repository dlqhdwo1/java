package inheritance;

class AA{
	public int a = 3;
	
	public void disp() {
		a+=5;
		System.out.println("AA: "+ a +" ");
	}
}



//-----------------------------------

class BB extends AA{
	public int a =8;
	
	@Override  //오버라이드하면 호출할떄 무조건 자식클래스를잡음!!
	public void disp() {
		this.a +=5;
		System.out.println("BB:"+ a + " ");
	}
}
//--------------------------------------
public class OverrideMain {

	public static void main(String[] args) {
//		BB bb = new BB();
//		bb.disp();
//		System.out.println(bb.a);
		
		AA bb = new BB(); //다형성 
		
		bb.disp();
		System.out.println(bb.a);
		
		BB cc =(BB)bb;
		cc.disp();
		System.out.println(cc.a);
		
		
		AA dd = new AA();
		dd.disp();
		System.out.println("dd:"+dd.a);
		System.out.println();
		
	}

}

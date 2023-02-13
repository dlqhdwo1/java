package inheritance;

class Test{
	
	
}
//-----------------------------------------------
class Sample{
	
	@Override
	public String toString() {
		return getClass()+ " hi"; //getClass(): Object클래스에있는 클래스명을 가져오는 메소드.
	}
}

//-----------------------------------------------
class Exam{
	private String name = "홍길동";
	private int age =25;
	
	@Override
	public String toString() {
		
		return name + "\t" + age;
	}
	
	
}

//-----------------------------------------------
public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t: " + t);  //패키지명.클래스명@16진수 inheritance.Test@5e91993f
		System.out.println("객체 t: " + t.toString()); //inheritance.Test@5e91993f
		System.out.println("객체 t: " + t.hashCode()); //hashCode : 주소의값을 10진수로 바꾸어줌. 
		
		Sample s = new Sample();
		System.out.println("객체 t: " + s.toString());
		
		System.out.println();
		
		Exam e = new Exam();
		System.out.println("객체 e : "+e.toString());
		System.out.println();
		
		String aa = "apple";
		System.out.println("객체 aa : "+aa.toString());
		//System.out.println(aa.hashCode());  //String클래스에  hashCode()메소드는 믿지말자
		
		String bb = new String("apple");
		String cc = new String("apple");
		
		System.out.println("bb==cc \t" + (bb==cc));  //주소를 물어봄
		System.out.println("bb.equals(cc) \t" + bb.equals(cc)); //문자열비교
		
		
		System.out.println();
		
		Object dd = new Object();
		Object ee = new Object();
		
		System.out.println("bb==cc \t" + (dd==ee));  //주소를 물어봄
		System.out.println("bb.equals(cc) \t" + dd.equals(ee)); //Object클래스에서는 equals에서 참조값을 비교함.
		System.out.println();
		
		Object ff = new String("apple");
		Object gg = new String("apple");
		
		System.out.println("ff==gg \t" + (ff==gg)); 
		System.out.println("ff.equals(gg) \t" + ff.equals(gg)); 
		System.out.println();
		
		
		
		
	}
}

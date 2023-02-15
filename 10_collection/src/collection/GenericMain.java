package collection;

class GenericTest<T>{  //T에 String타입이 들어감.
	private T a;
	
	public void setA(T a) { // T에 String타입이 들어감.
		this.a = a;
	}
	public T getA() {  //T에 String 타입이 들어감.
		return a;
	}
}

//-----------------------------------
public class GenericMain {

	public static void main(String[] args) {
		GenericTest<String> aa = new GenericTest<String>();
		
		aa.setA("홍길동");
		System.out.println("이름 :  " + aa.getA());
		
//		aa.setA(10); 제너릭이 String으로 지정되어있으므로 int형은 들어갈수없음.
		GenericTest<Integer> bb = new GenericTest<Integer>();
		bb.setA(25);
		System.out.println(" bb: " + bb.getA());
		
		
		}
	}

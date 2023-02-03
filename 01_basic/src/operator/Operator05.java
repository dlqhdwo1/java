package operator;

public class Operator05 {

	public static void main(String[] args) {
		boolean a  = 25>36;
		System.out.println("a:"+a);
		System.out.println("a:"+!a);
		
		String b = "apple"; // literal생성이 가능. 
		String c = new String("apple");
		
		String result = b==c ? "같다": "다르다";	
		System.out.println(result);
		System.out.println(b!=c?"참":"거짓");
		System.out.println();
		
		String result2 =((!b.equals(c))?"참":"거짓");
		System.out.println(result2);
		
	}

}

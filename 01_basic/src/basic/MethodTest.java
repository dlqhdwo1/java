package basic;


public class MethodTest {

	public static void main(String[] args) {
		int	big =Math.max(25, 36);
		
		System.out.println(big);
		
		double Min= Math.min(25.6, 78.6);
		System.out.println(Min);
		
		String binary = Integer.toBinaryString((255));
		String hex = Integer.toHexString(255);
		String Oct= Integer.toOctalString(255);
		
		System.out.println(Oct); //8진수 
		System.out.println(hex);  //16진수
		
		System.out.println(binary);
		System.out.println(Integer.toBinaryString(255));  //2진수
		
		
		
	}

}

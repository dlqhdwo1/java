package operator;

public class Boxing {

	public static void main(String[] args) {
		int a = 25;
		
		double b = (double)a / 3; // Casting , 강제형변환/자동형변환
		
		String c = "25";
		int d = Integer.parseInt(c);//String은 객체 이므로 강제형변환을 할수가없음

		int e = 5;
		
		
		Integer f = e;  //JDK 5.0 AutoBoxing
		
		//Integer f  = new Integer(e);와 같음.  JDK5.0이전에 썻었음.
		
		Integer g = 5;
		int h = g; // UnAutoBoxing , AutounBoxing 
		int h1 = g.intValue(); // JDK5.0이전.
		
		
		
		
		
		
		
		
		
	}
}

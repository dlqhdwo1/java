package class__;
import java.util.StringTokenizer;


public class Token {

	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str,",");   // "학원"  "집"  "게임방" 토큰 3개로 분리가됨.
		System.out.println("토큰 개수 = "+ st.countTokens());

		
		while(st.hasMoreTokens()) { //st.hasMoreTokens현재 위치에 Token이 있는지(True) 없는지(False) 확인할때 사용함.
			System.out.println(st.nextToken()); //Token의 값을 꺼내주고 다음 토큰으로 이동하는 메소드	
		} //while
		
		System.out.println("------------------------");
		
		String[] ar = str.split(","); //"학원,집,,게임방";//,,여기 비어있는 값도 출력을해준다.
		
		for(String data : ar) {
			System.out.println(data);
		}
	
		
		
	}

}

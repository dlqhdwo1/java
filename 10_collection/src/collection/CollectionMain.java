package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		
		Collection coll = new ArrayList(); // 인터페이스도 new를 통해서 얻어올수있음.
		
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이");
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		
		Iterator it = coll.iterator(); //메소드이용Iterator생성
		
		while(it.hasNext()) { //it에 항목이 있냐없냐를 물어봄.있으면 true 없으면false
			System.out.println(it.next()); //항목을 꺼내고 다음 항목으로 이동.
		}
	
	}

}

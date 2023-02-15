package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();

		map.put("book101","백설공주");
		map.put("book201","인어공주");
		map.put("book102", "백설공주"); // value는 중복허용됨.
		map.put("book301", "피오나");
		map.put("book101", "엄지공주"); // key중복 허용됨.
		
		System.out.println("book101 " + map.get("book101"));
		System.out.println("book102 " + map.get("book102"));
		System.out.println("book501 " + map.get("book501"));
		
		
	}

}

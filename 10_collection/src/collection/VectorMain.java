package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		System.out.println("벡터 크기 : " + v.size()); //0
		System.out.println("벡터 용량 : " + v.capacity()); //10
		System.out.println();
		
		System.out.println("항목 추가");
		for(int i=0;i<10;i++) {
			v.add(i+1+"");
			System.out.print(v.get(i) + " ");
		}//for
		
		

		System.out.println("벡터 크기 : " + v.size()); //10
		System.out.println("벡터 용량 : " + v.capacity()); //10
		System.out.println();
		
		System.out.println("항목 1개 추가");
		v.addElement(5+ "");
		System.out.println("벡터 크기 : " + v.size()); //11
		System.out.println("벡터 용량 : " + v.capacity()); //20
		
		for(int i=0; i<v.size();i++)System.out.print(v.get(i) + " ");
		System.out.println();
		
//		v.remove("5"); 앞부분에 5항목이 삭제됨.
		v.remove(10);
	
		Iterator<String> it = v.iterator(); //Iterator : 접근지정자 역할. 
		while(it.hasNext()) { //현재 항목이있으면 True없으면False
			System.out.print(it.next() + " ");
		}
		
		System.out.println();

	}

}

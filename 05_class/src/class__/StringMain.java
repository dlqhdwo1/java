package class__;

public class StringMain {

	public static void main(String[] args) {
		String a = "apple"; //String만 유일하게 literal생성이 가능하다.
		String b = "apple";

		if(a==b)System.out.println("a와b의 참조값은 같다.");
		else System.out.println("a와 b의 참조값은 다르다.");
		
		if(a.equals(b))System.out.println("a와 b의 문자열은 같다.");
		else System.out.println("a와 b의 문자열은 다르다.");
		System.out.println();
		
		String c = new String("apple");
		String d = new String("apple");
		
		if(c==d)System.out.println("c와d의 참조값은 같다.");
		else System.out.println("c와d의 참조값은 다르다.");
		
		if(c.equals(d))System.out.println("c와 d의 문자열은같다.");
		else System.out.println("c와 d의문자열은 다르다");
		
		System.out.println();
		
		String e = "오늘 날짜는 " + 2023 +2 + 10;
		
		//"오늘날짜는"           ->jvm에서 가비지컬렉터로넘어감.(jvm에서 가비지컬렉터로 넘어갈때(jvm이실행되면) 컴퓨터가 잠깐 멈춘다.)
		//"오늘날짜는 2023"	  ->jvm에서 가비지컬렉터로넘어감.(jvm에서 가비지컬렉터로 넘어갈때(jvm이실행되면) 컴퓨터가 잠깐 멈춘다.)
		//"오늘날짜는 202032"    ->jvm에서 가비지컬렉터로넘어감.(jvm에서 가비지컬렉터로 넘어갈때(jvm이실행되면) 컴퓨터가 잠깐 멈춘다.)
		// e= "오늘날짜는 2023210" 메모리가 축적되서 쌓임 (메모리를 많이잡아먹음)
		
		System.out.println("e:"+e);
		
		/*
		 문자열은 편집이 안된다. -> 메모리의 4번의 생성이 일어난다.
		 */
		
		System.out.println("문자열의 크기 = " +e.length());
		
		for(int i=0; i<e.length();i++) {
			System.out.println(i+ " : "+ e.charAt(i));
		
		}
		
		System.out.println("부분 문자열 추출 = "+ e.substring(7));
		System.out.println("부분 문자열 추출 = "+e.substring(7,11));//7번부터 11번이전까지출력
		
		System.out.println("대문자 변경 = "+"Hello".toUpperCase());
		System.out.println("소문자 변경 = "+ "Hello".toLowerCase());
		
		System.out.println("문자열 검색" + e.indexOf("짜"));
		System.out.println("문자열 검색" + e.indexOf("날짜"));
		System.out.println("문자열 검색" + e.indexOf("개바부"));
		
		System.out.println("문자열 치환 = " +e.replace("날짜", "일자"));
		
	
		
		
	}

}

package class__;
import java.util.Scanner;
public class StringMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열입력");
		String st1 = sc.next();
		System.out.println("현재 문자열 입력");
		String st2 = sc.next();
		System.out.println("바꿀 문자열 입력");
		String change = sc.next();
		
		
		char[] str1 = new char[st1.length()];
		char[] str2 = new char[st2.length()];
		
		for(int i=0; i<str1.length;i++) {
		
			str1[i] = st1.charAt(i);
			str2[i] = st2.charAt(i);		
				if(str1[i]==str2[i]) {
					str1[i] = str2[i];
				}
				
		}
		}
			
	}

/*
치환하는 프로그램을 작성하시오 - indexOf(?, ?), replace()
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다

*/
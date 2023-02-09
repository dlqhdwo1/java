package constructor;
//부르기만한다.
public class MemberMain {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		ms.menu();
		System.out.println("프로그램을 종료합니다.");
	}

}



/*

menu()
*************
   1. 가입
   2. 출력
   3. 수정
   4. 탈퇴
   5. 끝내기
*************
  번호 :

[1번 경우]
insert()
5명의 정원이 꽉 찼습니다...//5명이 꽉 차면
----------------------
이름 입력 :   String
나이 입력 :	Int
핸드폰 입력 :  Int
주소 입력 :    String 
1 row created

[2번 경우]
list()     출력
이름      나이      핸드폰      주소

[3번 경우]
update()    수정
핸드폰 번호 입력 : 010-123-1234
홍길동   25   xxx   xxx

수정 할 이름 입력 :
수정 할 핸드폰 입력 :
수정 할 주소 입력 :

1 row(s) updated
--------------------
핸드폰 번호 입력 : 010-123-1235
찾는 회원이 없습니다

[4번 경우]
delete()
핸드폰 번호 입력 :
1 row deleted
--------------------
핸드폰 번호 입력 :
찾는 회원이 없습니다


*/
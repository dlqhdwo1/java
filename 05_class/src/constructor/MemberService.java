package constructor;
import java.util.Scanner;

//일을하는 클래스
public class MemberService {
	Scanner sc = new Scanner(System.in);
	MemberDTO[] dto = new MemberDTO[5];
	
	public MemberService() {
		System.out.println("기본생성자");
	}
	
	public void menu() {
		while(true) {
		System.out.println("menu()\r\n"
				+ "*************\r\n"
				+ "   1. 가입\r\n"
				+ "   2. 출력\r\n"
				+ "   3. 수정\r\n"
				+ "   4. 탈퇴\r\n"
				+ "   5. 끝내기\r\n"
				+ "*************\r\n"
				+ "  번호 :\r\n"
				+ "");
		
		int num = sc.nextInt();
		if(num==1)insert();
		if(num==2)list();
		if(num==3)update();
		if(num==4)delete();
		if(num==5)break;
		
		}
		}
		
	public void list() {
		for(int i=0; i<dto.length;i++) {
			if(dto[i] != null)
			{
			System.out.print(dto[i].getName()+"\t");
			System.out.print(dto[i].getAge()+"\t");
			System.out.print(dto[i].getNumber()+"\t");
			System.out.print(dto[i].getAddr()+"\t");
			
			System.out.println();
			}
		}
	}
	
	public void insert() {
		int i;
		
		for(i=0;i<dto.length;i++) {
			if(dto[i] ==null)break;	
		}
	
		if(i==dto.length) {
			System.out.println(dto.length+"정원초과");
			return; // 함수를 벗어나라 
		}
		
		
		System.out.println("이름입력");
		String name = sc.next();
		System.out.println("나이입력");
		int age = sc.nextInt();
		System.out.println("핸드폰입력");
		int number = sc.nextInt();
		System.out.println("주소입력");
		String addr = sc.next();
		
		
		if(dto[i] ==null) {
			dto[i] = new MemberDTO(name,age,number,addr);
		}
		
		System.out.println(i+1+"번째 row");
		}
	
//		}

	/*
이름 입력 :   String
나이 입력 :	Int
핸드폰 입력 :  Int
주소 입력 :    String 
	 
	 */
	
	//insert, update , delete 메소드 각각 만들어주기.
	public void update() {
		int i=0;
		System.out.println("핸드폰 번호 입력");
		int num = sc.nextInt();
		
		if(dto[i]!=null) {
			
		for(i=0; i<dto.length;i++) {
			
			if(num == dto[i].getNumber()) {
				System.out.println(dto[i].getName());
				System.out.println(dto[i].getAge());
				System.out.println(dto[i].getAddr());
				System.out.println(dto[i].getNumber());
				
				System.out.println("수정할 나이 입력");
				dto[i].setAge(sc.nextInt());
				System.out.println("수정할 이름입력:");
				dto[i].setName(sc.next());
				System.out.println("수정할 핸드폰 입력:");
				dto[i].setNumber(sc.nextInt());
				System.out.println("수정할 주소 입력:");
				dto[i].setAddr(sc.next());
				
				System.out.println("1(rows update)");
			
				break;
			}
			
			if(num!=dto[i].getNumber()) {
				System.out.println("찾는회원없음.");
				break;
			}
		}
		}	//fori
		
//		if(i==dto.length) {
//			System.out.println("찾는 회원이 없습니다.");
//		}
	}
	public void delete() {
		int i=0;
		System.out.println("핸드폰 번호 입력");
		int num = sc.nextInt();
		for(i=0; i<dto.length;i++) {
			if(dto[i].getNumber()==num) {
				dto[i] = null;
				System.out.println("1rows deleted");
				break;
			}
		
		}
			
		}
		
		
		
	
}
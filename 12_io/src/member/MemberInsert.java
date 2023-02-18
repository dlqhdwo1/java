package member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberInsert implements Member {
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
//		for(int i=0; i<arrayList.size();i++) {
			System.out.println("이름입력");
			String name = sc.next();
			System.out.println("나이입력");
			int age = sc.nextInt();
			System.out.println("핸드폰 번호입력");
			String number = sc.next();
			System.out.println("주소입력");
			String addr = sc.next();
			
			MemberDTO dto = new MemberDTO(name,age,number,addr);
			arrayList.add(dto);
//		1}
		
		
	}
}

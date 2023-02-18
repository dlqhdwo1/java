package member;

import java.util.ArrayList;
import java.util.Scanner;
public class MemberPhoneSearch implements Member {
	
	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호입력 ");
		String number = sc.next();
		
		for(int i=0; i<arrayList.size();i++) {
			if(number.equals(arrayList.get(i).getNumber())) {
				System.out.print(arrayList.get(i).getName() + " ");
				System.out.print(arrayList.get(i).getNumber()+ " ");
				System.out.print(arrayList.get(i).getAge()+ " ");
				System.out.println(arrayList.get(i).getAddr()+ " ");
			}
			
			
			else{
				System.out.println("잘못된 번호입니다.");
			}
		}
		
//		int sw = 0;
//		
//		for(MemberDTO dto : arrayList) {
//			if(number.equals(dto.getNumber())) {
//				System.out.println(dto);
//				sw=1;
//				break;
//			}
//			if(sw==0) {
//				System.out.println("검색한 핸드폰 번호가 없습니다.");
//			}
//		}
//		
	
	}

}

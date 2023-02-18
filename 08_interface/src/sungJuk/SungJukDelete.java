package sungJuk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class SungJukDelete implements SungJuk {
	Scanner sc = new Scanner(System.in);
	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		
		System.out.println("삭제할 이름을 입력해주세요.");
		String name = sc.next();
	
		
		int count=0;
//		for(int i=0; i<list.size();i++) {
//			if(list.get(i).getName().equals(name)) {
//				list.remove(i);
//				System.out.println("삭제가 완료되었습니다.");
//				count++;
//			}
//			}//for
		
		
		Iterator<SungJukDTO> it = list.iterator();
		while(it.hasNext()) {
			SungJukDTO dto = it.next(); //list에 첫번쨰 항목을 버퍼메모리에 저장
			if(dto.getName().equals(name)) {
				it.remove(); //버퍼 메모리에 저장된 dto를 삭제.
				count++;
			}
		}

//			for(SungJukDTO dto :list) {
//				if(dto.getName().equals(name)) {
//					list.remove(dto);
//					count++;
//				}
//			}
			

//		for(SungJukDTO dto :list) {
//			if(dto.getName().equals(name)) {
//				list.remove(dto);
//				count++;
//			}
//		}
			if(count==0)System.out.println("회원의 정보가 없습니다.");
			else System.out.println(count+ "건을 삭제하였습니다.");
			
//			else if(!(list.get(i).getName().equals(name))) {
//				System.out.println("회원의 정보가 없습니다.");
//				break;
//			}
		
	}

}

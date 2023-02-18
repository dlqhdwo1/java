package member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MemberNameAsc implements Member {
	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		
		System.out.println("이름으로 오름차순");
		
		Comparator<MemberDTO> com = new Comparator<MemberDTO>() {

			@Override
			public int compare(MemberDTO dto1, MemberDTO dto2) {
				
				
//				return dto1.getName().compareTo(dto2.getName()); //오름차순
				return dto1.getName().compareTo(dto2.getName()); //내림차순
			}
			};
			
			Collections.sort(arrayList,com); // com을 기준으로 list를 바꿔	
			
			for(int i=0; i<arrayList.size();i++){
				System.out.print(arrayList.get(i).getName() + " ");
				System.out.print(arrayList.get(i).getAge() + " ");
				System.out.print(arrayList.get(i).getNumber() + " ");
				System.out.println(arrayList.get(i).getAddr());
			}
		
	}
}

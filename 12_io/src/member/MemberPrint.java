package member;

import java.util.ArrayList;

public class MemberPrint implements Member {
	
	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
	
		
		for(int i=0; i<arrayList.size();i++) {
			System.out.print(arrayList.get(i).getName() + " ");
			System.out.print(arrayList.get(i).getAge()+ " ");
			System.out.print(arrayList.get(i).getNumber()+ " ");
			System.out.println(arrayList.get(i).getAddr());
		
		}
	}
	
}

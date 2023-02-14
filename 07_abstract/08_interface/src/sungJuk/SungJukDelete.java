package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;
public class SungJukDelete implements SungJuk {
	Scanner sc = new Scanner(System.in);

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		
		System.out.println("삭제할 번호를 입력해주세요.");
		int num = sc.nextInt();
		
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getNo()==num) {
				list.remove(i);
			}
		}
		
		System.out.println("삭제가 완료되었습니다.");
		
	}

}

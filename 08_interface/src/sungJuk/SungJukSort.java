package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukSort implements SungJuk {
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		
		while(true) {
		System.out.println("****************");
		System.out.println("----------"
				+ "----------\r\n"
				+ "1. 총점으로 내림차순\r\n"
				+ "2. 이름으로 오름차순\r\n"
				+ "3. 이전메뉴\r\n"
				+ "--------------------\r\n"
				+ "번호선택 : \r\n"
				+ "\r\n"
				+ "");
		
		System.out.println("메뉴입력 : ");
		int menu = sc.nextInt();
		
		if(menu==1) {
			System.out.println("총점으로 내림차순");
			Collections.sort(list);
		}
		
		else if(menu==2) {
			System.out.println("이름으로 오름차순");
				
			Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {

				@Override
				public int compare(SungJukDTO dto1, SungJukDTO dto2) {
					
					
//					return dto1.getName().compareTo(dto2.getName()); //오름차순
					return dto1.getName().compareTo(dto2.getName()); //내림차순
				}
				};
				
				Collections.sort(list,com); // com을 기준으로 list를 바꿔	
		}
		else if(menu==3) {
			System.out.println("이전메뉴");
			break;
		}
		
	}
	}
	
}

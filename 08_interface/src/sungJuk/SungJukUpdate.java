package sungJuk;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

public class SungJukUpdate implements SungJuk {
	
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
	
		System.out.println("수정할 번호를 입력해주세요.");
		int num = sc.nextInt();
		
		for(int i= 0; i<list.size();i++) {
			if(list.get(i).getNo() == num) {
				System.out.println("수정할 이름을 입력해주세요.");
				list.get(i).setName(sc.next());
				System.out.println("수정할 국어점수를 입력해주세요.");
				list.get(i).setKor(sc.nextInt());
				System.out.println("수정할 영어점수를 입력해주세요.");
				list.get(i).setEng(sc.nextInt());
				System.out.println("수정할 수학점수를 입력해주세요.");
				list.get(i).setMat(sc.nextInt());
				System.out.println();
				
				list.get(i).calc();
				
			}
			
			else if(list.get(i).getNo() == num) {
				System.out.println("잘못된 번호입니다.다시 입력해주세요."); continue;
			}
		}
		
	}

}

package sungJuk;
import java.util.ArrayList;
import java.util.Scanner;
public class SungJukService {
	Scanner sc = new Scanner(System.in);
	SungJuk inter = null;
	private ArrayList<SungJukDTO> arrayList = new ArrayList<SungJukDTO>(); //ArrayList로잡으면 갯수제한이없다.
	public void menu() {
		while(true)
		{
			System.out.println("*******************");
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.수정");
			System.out.println("4.삭제");
			System.out.println("5.정렬");
			System.out.println("6.끝");
			System.out.println("*******************");
			
			int num = sc.nextInt();
			
			if(num==1) {
				inter = new SungJukInsert();
			}
			else if(num==2) {
				inter = new SungJukList();
			}
			else if(num==3) {
				inter = new SungJukUpdate();
			}
			else if(num==4) {
				inter = new SungJukDelete();
			}
			else if(num==5) {
				inter = new SungJukSort();
			}
			else if(num==6)break;
			
			else {
				System.out.println("1~6번의 숫자를 입력해주세요.");
				continue; //반복문 머리위로 올라감. 
				
			}
			
			inter.execute(arrayList);
		}
		//1.입력
		//2.출력
		//3.수정
		//4.삭제
		//5.정렬
		//6.끝
	}
}

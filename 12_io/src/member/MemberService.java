package member;
import java.util.ArrayList;
import java.util.Scanner;
public class MemberService {

	Scanner sc = new Scanner(System.in);
	
	private ArrayList<MemberDTO> arrayList = new ArrayList<MemberDTO>(); //ArrayList로잡으면 갯수제한이없다.
	Member inter = null;
	
	public void menu() throws ClassNotFoundException {
		while(true)
		{
			System.out.println("*******************");
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.검색");
			System.out.println("4.이름으로오름차순");
			System.out.println("5.저장");
			System.out.println("6.파일 출력");
			System.out.println("7.끝");
			System.out.println("*******************");
			int num = sc.nextInt();
			if(num==1) {
				inter = new MemberInsert();	
				
			}
			else if(num==2) {
				inter = new MemberPrint();
			}
			else if(num==3) {
				inter = new MemberPhoneSearch();
			}
			else if(num==4) {
				inter = new MemberNameAsc();
			}
			else if(num==5) {
				inter = new MemberFileInput();
			}
			else if(num==6) {
				inter = new MemberFileOutput();
			}
			else if(num==7)break;
			
			else {
				System.out.println("1~6번의 숫자를 입력해주세요.");
				continue; //반복문 머리위로 올라감. 
			}
			
			inter.execute(arrayList);
		}
//		********************
//		  1. 등록
//		  2. 출력
//		  3. 핸드폰 검색
//		  4. 이름으로 오름차순
//		  5. 파일 저장
//		  6. 파일 읽기
//		********************
	}
}

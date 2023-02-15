package sungJuk;
import java.util.ArrayList;
import java.util.Scanner;
public class SungJukInsert implements SungJuk {
	Scanner sc = new Scanner(System.in);
//	ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
		
	
	@Override
	public void execute(ArrayList<SungJukDTO> list) {
				System.out.println();
				System.out.println("번호입력 ");
				int no = sc.nextInt();
				System.out.println("이름입력");
				String name = sc.next();
				System.out.println("국어 점수 입력");
				int kor = sc.nextInt();
				System.out.println("영어 점수 입력");
				int eng = sc.nextInt();
				System.out.println("수학 점수 입력");
				int mat = sc.nextInt();
		
				SungJukDTO dto = new SungJukDTO(no,name,kor,eng,mat);
				dto.calc();
				
				list.add(dto);
				
				System.out.println("입력하였습니다.");
			}
		
		
		}
		



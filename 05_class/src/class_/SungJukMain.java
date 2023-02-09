package class_;
import java.util.Scanner;

public class SungJukMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SungJuk2 s = new SungJuk2();
		
		
		s.setName(sc.next());
		s.setKor(sc.nextInt());
		s.setEng(sc.nextInt());
		s.setMat(sc.nextInt());
		s.setTotal(s.getKor(),s.getEng(), s.getMat());
		s.setavg(s.getTotal());
		s.setGrade(s.getavg());
		
		
		System.out.println("----------------------------------------------------\r\n"
				+ "이름      국어      영어      수학      총점      평균      학점\r\n"
				+ "----------------------------------------------------");
		System.out.println(s.getName()+"\t   " +s.getKor()+ "\t   "+ s.getEng() +"\t   "+ s.getMat()+"\t   "+s.getTotal()+"\t   "+s.getavg()+"\t   "+s.getGrade() );
	

	}

}

/*
[문제] 성적 처리
-총점,평균,학점을 구하시오.
-평균은 소수이하 2째자리까지 출력 

총점 = 국어 + 영어 + 수학 
평균 = 총점/과목수
학점은 평균이 90이상이면 'A'
	  평균이 80이상이면 'B'
	  평균이 70이상이면 'C'
	  평균이 60이상이면 'D'
	  그외 			 'F'
----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동   90      95      100
프로도   100      89      75
죠르디   75      80      48
----------------------------------------------------

*/
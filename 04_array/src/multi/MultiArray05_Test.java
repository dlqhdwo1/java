package multi;
import java.util.Scanner;
public class MultiArray05_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int cnt=0;
		
		
		System.out.println("인원수입력");
		cnt = sc.nextInt();
		
		System.out.println("과목수입력");
		int subjectCnt = sc.nextInt();
		String[] name = new String[cnt];
		String[][] subject = new String[cnt][cnt];
		int[][] score = new int[cnt][cnt];
		
		
		for(int i=0; i<subject.length;i++) {
				System.out.println("이름입력");
				name[i] = sc.next();
			for(int j=0; j<subject[i].length;j++) {
				System.out.println("과목입력");
				subject[i][j] = sc.next();
			}
		}
		
		
//		for(int i=0; i<subject.length;i++) {
//			System.out.println(name[i]);
//			for(int j=0; j<subject[i].length;j++) {
//				System.out.println(subject[i][j]);
//			}
//		}
		
		
		for(int i= 0; i<score.length;i++) {
			for(int j=0; j<score[i].length;j++) {
				System.out.println(subject[i][j]+"점수입력");
				score[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<subject.length;i++) {
			System.out.print("이름\t");
			for(int j=0; j<subject[i].length;j++) {
				
				for(int k=0;k<score.length;k++) {
					System.out.print(subject[j][k]+ " \t");
					
					
			    }
				System.out.print(score[i][j]);
			}
			
			System.out.println();
		
	}
		
//		for(int i=0; i<score.length;i++) {
//			System.out.print(name[i]+"\t");
//			for(int j=0; j<score[i].length;j++) {
//				System.out.print(score[i][j]+ "\t");
//			}
//			System.out.println();
//		}
		
	}
	
}
/*
인원수 : 2 (cnt)
이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어

국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력
과목명 입력 : 과 : 영어학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
--------------------
이름     국어     영어   총점     평균
홍길동    95     100    xxx     xx.xx

이름      국어  영어   과학    총점      평균
이기자   95   100   90       xxx      xx.xx
*/
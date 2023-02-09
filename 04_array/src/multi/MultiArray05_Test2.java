package multi;
import java.util.Scanner;
public class MultiArray05_Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int subjectCnt=0;
		
		System.out.println("인원수입력");
		cnt = sc.nextInt();
		
		double[] avg = new double[cnt];
		String[] name = new String[cnt];
		String[][] subject = new String[cnt][];
		int[][] score = new int[cnt][];
		
		
		
		for(int i=0; i<cnt;i++) {
			System.out.println("이름입력");
			name[i] = sc.next();
			System.out.println("과목수입력");
			subjectCnt=sc.nextInt();
			
			subject[i] = new String[subjectCnt]; //subject[0] =subject[0][subjectCnt]0번쨰 행에 subjectCnt만큼의 열을 추가
			score[i] =new int[subjectCnt+1];
			
			for(int j=0; j<subject[i].length;j++) {

				System.out.println("과목명입력");
				subject[i][j] = sc.next();
			}
	
		for(int j=0; j<score.length;j++) {
				System.out.print(subject[i][j]+"점수입력");
				score[i][j] = sc.nextInt();
				
				score[i][subjectCnt] += score[i][j];
				
			}
			avg[i] = score[i][subjectCnt] / subjectCnt;	
		}
		for(int i=0; i<cnt;i++) {
			
			System.out.print("이름\t");
			for(int j=0; j<subject[i].length;j++) {
				System.out.print(subject[i][j] + "\t");	
			}
			
			System.out.print("총점 \t");
			System.out.print("평균 \t");
			System.out.println();
			System.out.print(name[i]+ "\t");
		
			for(int j=0; j<score[i].length;j++) {
				System.out.print(score[i][j]+ "\t");
			}
			System.out.println(avg[i]);
			System.out.println();
		}

		}
}
/*
[문제]
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
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
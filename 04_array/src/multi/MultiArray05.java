package multi;
import java.util.Scanner;
public class MultiArray05 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("인원수입력");
			int cnt = sc.nextInt();
			int subjectCnt;
			int total=0;
			double avg=0.0;
			String name;
		
			for(int f=cnt; f>0;f--) {
//			while(cnt!=0) {
			
				System.out.println("이름입력");
				name= sc.next();
				System.out.println("과목수입력");
				subjectCnt= sc.nextInt();

				String[] subject = new String[subjectCnt];
			
				for(int i=0; i<subject.length;i++){
					System.out.println("과목명입력");
					subject[i] = sc.next();
				}
				int[] score = new int[subject.length];
			
				for(int i=0; i<subject.length;i++) {
					System.out.println(subject[i]+ "의점수입력");
					score[i] = sc.nextInt();
					System.out.println(score[i]);
				}
				
					System.out.print(name + "  \t");
					
					
					for(int i=0; i<subject.length;i++) {
						System.out.print(subject[i] +" \t");
					}
					
					System.out.print("총점\t");
					System.out.print("평균");
				
					System.out.println();
					
					for(int i=0; i<score.length;i++) {
						System.out.print("\t"+score[i]);
					}
					
					for(int i=0; i<score.length;i++) {
						total = total + score[i];
					}
					
					avg = total/subjectCnt;
					System.out.print("\t"+total);
					System.out.print("\t"+avg);
					
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
package multi;
import java.util.Scanner;
public class MultiArray03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = {"홍길동","프로도","조르디"};
		int[][] score = {   {91,95,100},
							{100,88,75},
							{75,80,48}
						};

		int[] total = new int[3];
		double[] avg = new double[3];
		char[] grade = new char[3];
		
		//총점 , 평균 , 학점 
		for(int i=0; i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				total[j] = total[j]+score[j][i];
				avg[j] = total[j]/3.0;
				if(avg[j]>=90) {
					grade[j] = 'A';
				}
				else if(avg[j]>=80) {
					grade[j] = 'B';
				}
				else if(avg[j]>=70) {
					grade[j] = 'C';
				}
				else if(avg[j]>=60) {
					grade[j] = 'D';
				}else grade[j] ='F';
			}
			
		}
		
		//출력
		System.out.println("----------------------------------------------------\r\n"
				+ "이름      국어      영어      수학      총점      평균      학점\r\n"
				+ "----------------------------------------------------");
		
		for(int i=0; i<name.length;i++) {
			System.out.print(name[i] + "\t");
			
			for(int j=0;j<name.length;j++) {
		
			System.out.print(score[i][j] + "\t   ");
			}
			System.out.print(total[i] + "\t  ");
			System.out.print(String.format("%.2f", avg[i]) + "\t     ");
			System.out.println(grade[i]);
		}
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
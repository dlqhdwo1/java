package multi;

import java.util.*;

public class MultiArray05_Test {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] subject;
		String[] name;
		int[][] jumsu;
		int subjectCnt;
		
		System.out.print("인원수 : ");
		int cnt = scan.nextInt();
		//초기값 
		name = new String[cnt];
	
		double[] avg = new double[cnt];
		subject = new String[cnt][];
		jumsu = new int[cnt][];
		
		System.out.println();
		//정보 입력 
		for(int i=0; i<cnt; i++) {
			System.out.print("이름 입력 : ");
			name[i] = scan.next();
			
			System.out.print("과목 수 입력 : ");
			subjectCnt = scan.nextInt();
			subject[i] = new String[subjectCnt];
			jumsu[i] = new int[subjectCnt + 1];
			
			//과목명 입력 
			for (int j = 0; j < subject[i].length; j++) {
				System.out.print("과목명 입력 : ");
				subject[i][j] = scan.next();
			} //for i 
		
			//점수 입력 
			for (int j = 0; j < subjectCnt; j++) {
				System.out.print(subject[i][j] + "점수 입력 : ");
				jumsu[i][j] = scan.nextInt();
				jumsu[i][subjectCnt] += jumsu[i][j];	//총점  
			} //for j
			//평균 
			avg[i] = jumsu[i][subjectCnt] / (double)subjectCnt;
			System.out.println();
		}//for i
		
		for(int i=0; i<cnt; i++) {
			//상단 글자
			System.out.print("이름\t");
			for (int j = 0; j <subject[i].length; j++) {
				System.out.print(subject[i][j]+ "\t");
			} //for j
			System.out.print("총점\t");
			System.out.println("평균");
			
			//하단 
			System.out.print(name[i]+ "\t");
			
			//과목별 점수, 총점 
			for (int j = 0; j < jumsu[i].length; j++) {
				System.out.print(jumsu[i][j] + "\t");
			} //for k
			
			//평균 
			System.out.print(String.format("%5.2f", avg[i]));
			System.out.println("\n");
		}//for i
	}

}
package sungJuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<list.size();i++) {
			
			System.out.print(list.get(i).getNo()+"\t" );
			System.out.print(list.get(i).getName()+"\t");
			System.out.print(list.get(i).getKor()+"\t");
			System.out.print(list.get(i).getEng()+"\t");
			System.out.print(list.get(i).getMat()+"\t");
			System.out.print(list.get(i).getTotal()+"\t");
			System.out.println(list.get(i).getAvg());
			
		}
		
		
//		for(SungJukDTO dto : list) {
//			System.out.println(dto.getNo());
//			System.out.print(dto.getKor());
//			System.out.print(dto.getEng());
//			System.out.print(dto.getMat());
//			
//			System.out.print(dto.getTotal());
//			System.out.println(dto.getAvg());
//		}
		
		
//		for(SungJukDTO dto : list) {
//			System.out.println(dto); //클래스@16진수  toString을 오바리이딩해서 출력하기.
//		}
		
	}

}

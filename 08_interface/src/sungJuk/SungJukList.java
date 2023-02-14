package sungJuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		
		for(int i=0; i<list.size();i++) {
			
			System.out.print(list.get(i).getNo());
			System.out.println(list.get(i).getName());
			System.out.print(list.get(i).getKor());
			System.out.print(list.get(i).getEng());
			System.out.print(list.get(i).getMat());
			System.out.print(list.get(i).getTotal());
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

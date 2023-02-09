package class_;

public class SungJukMain2 {

	public static void main(String[] args) {
		
		SungJuk2[] sj = new SungJuk2[3]; //객체배열 , new =배열생성 sj라는 이름으로 방 3개짜리 배열생성해라.
		
		for(int i=0; i<sj.length;i++) {
		sj[i] = new SungJuk2();
		}
		
		
		sj[0].setEng(10);
		System.out.println(sj[0].getEng());	
		
		
	}

}

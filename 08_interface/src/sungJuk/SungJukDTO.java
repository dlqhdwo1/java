package sungJuk;

public class SungJukDTO implements Comparable<SungJukDTO>{
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private double avg;
	
	SungJukDTO(){
		
	}
	
	SungJukDTO(int no , String name , int kor , int eng , int mat){
		this.no = no;
		this.name= name;
		this.kor = kor;
		this.eng= eng;
		this.mat = mat;
	
	}
	
	public void calc() {
		total = kor+eng+mat;
		avg = total/3.0;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	@Override
	public String toString() {
		
		return no+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+total+"\t"+avg;
	}
	@Override
	public int compareTo(SungJukDTO dto) {
		//age로 오름차순
		if(this.total> dto.total)return -1;
		else if(this.total<dto.total)return 1;
		else return 0;
	}

}


/*
1. SungJukDTO.java
필드 : no(번호)(중복X), 이름, 국어, 영어, 수학, 총점, 평균
메소드 : 생성자를 이용하여 데이터 얻기.
       setter / getter
       calc - 총점, 평균하는 계산


*/
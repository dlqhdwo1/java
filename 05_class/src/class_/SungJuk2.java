package class_;


public class SungJuk2 {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private double avg;
	private char grade;
	
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
	
	public void setTotal(int kor,int eng,int mat) {
		this.total = kor+eng+mat;
	}
	public int getTotal() {
		return total;
	}
	
	public void setavg(int total) {
		this.avg = total/3.0;
	}
	public double getavg() {
		return avg;
	}
	public void setGrade(double avg) {
		char grade = 'F';
		if(avg>=90) grade ='A';
		else if(avg>=80) grade ='B';
		else if(avg>=70) grade ='C';
		this.grade = grade;
	}
	public char getGrade() {
		return grade;
	}
	


}

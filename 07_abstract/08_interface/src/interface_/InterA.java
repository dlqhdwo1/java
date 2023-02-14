package interface_;

public interface InterA {
	//상수
	public static final String NAME = "홍길동";
	public int AGE=25; // 키워드 생략가능. 어차피 상수만 올수있어서.
	
	//추상 메소드
	public void aa(); //interface에서는 무조건 추상메소드밖에 오지 못하니까 abstract생략가능.
	public void bb();
	
}

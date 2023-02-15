package nested;

public class AbstractMain{
	
	public static void main(String[] args) {
		
		AbstractTest at = new AbstractTest(){ //클래스인데 클래스이름이 없음.:익명 Inner 클래스
			
			public void setName(String name) { //구현
				this.name = name;
            
			}
		};
		
		InterA in = new InterA()  {
			public void aa() {}
			public void bb() {}
		};
		
		AbstractExam ae = new AbstractExam() {
			public void aa() {}
			//원하는 메소드를 Override 한다..
		};
		
	}

}


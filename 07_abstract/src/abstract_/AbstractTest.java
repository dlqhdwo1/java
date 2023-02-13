package abstract_;

public abstract class AbstractTest {  // POJO(Plain Old Java Object)형식
	protected String name;
	
	public AbstractTest(){
		
	}

	public AbstractTest(String name){
		super();
		this.name = name;
	}
	
	public String getName() { //구현
		return name; 
	}
	public abstract void setName(String name); // 추상 메서드 

}

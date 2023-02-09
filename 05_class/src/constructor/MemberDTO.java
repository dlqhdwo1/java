package constructor;
//1인분 틀만들기. 
	class MemberDTO {  //Data Transform Object
	private String name;
	private int age;
	private int number;
	private String addr;
	
	
	MemberDTO(){
		
	}
	//생성자를 통해서 데이터 4개를 받아오나
	public MemberDTO(String name , int age , int number , String addr){
		this.name = name;
		this.age = age;
		this.number = number;
		this.addr = addr;	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

}




/*
이름 입력 :   String
나이 입력 :	Int
핸드폰 입력 :  Int
주소 입력 :    String 

*/
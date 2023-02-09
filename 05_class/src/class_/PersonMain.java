package class_;
class Person{
	private String name;
	private int age;
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
	
	public void setData(String n,int a) {
		name = n;
		age = a;
	}
	public void setData() {
		
	}
	
	
	
}
//-------------------------------------------------------
public class PersonMain {
	public static void main(String[] args) {
			Person p = new Person();
			
			System.out.println("객체:"+p);
			p.setName("홍길동"); //호출 - 호출한 함수는 제자리로 돌아온다.
			p.setAge(25);
			
			
			System.out.println(p.getName() + p.getAge());
			
			
			Person d = new Person();
			System.out.println("객체 d:"+d);
			d.setData();
			System.out.println("이름:"+d.getName() + "나이: "+d.getAge());
			
	}

}

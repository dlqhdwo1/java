package boj_;

public class Ex7_7 {

	public static void main(String[] args) {
	Car car = null;
	FireEngine fe = new FireEngine(); //실제 인스턴스가 무엇인지가 중요.
	
	FireEngine fe2 = (FireEngine)car;
	Car car2 = (Car)fe2; // 자손 ->조상으로 형변환
	
	car2.drive(); //NullPointerException발생 객체가없으므로.
	
	
	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive~~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}

package inheritance;

public class Super extends Object {
	 protected double weight,height;
	 
	 Super(){
		 System.out.println("기본생성자입니다.");
	 }
	 
	 Super(double weight, double height){
		 	this.weight = weight;
		 	this.height = height;
	 }
	 
	 public void disp() {
		 System.out.println("몸무게 = " + weight);
		 System.out.println("키 = " + height);
	 }


	public double getWeight() {
		return weight;
	}



	public double getHeight() {
		return height;
	}
	
}

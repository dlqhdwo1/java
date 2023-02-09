package constructor;

public class VarArgs {
	public VarArgs() {
		System.out.println("기본 생성자");
	}
	
	public int sum(int...ar) {  //...개수를 자유롭게 준다는 의미임. 비슷한 맥락의 매개변수를 받을경우 ... 을쓰면 좋겟다.
		int sum = 0;
		
		for(int i=0; i<ar.length;i++){
			sum += ar[i];
			
		}
		
		return sum;
	}
	
	
	
	
		public static void main(String[] args) {
		VarArgs va = new VarArgs();
		System.out.println("합 = "+ va.sum(10,20));
		System.out.println("합 = "+ va.sum(10,20,30));
		System.out.println("합 = "+ va.sum(10,20,30,40));

	}

}

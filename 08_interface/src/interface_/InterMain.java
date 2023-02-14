package interface_;

public class InterMain implements InterC {


	public void aa() {}
	public void bb() {}
	public void cc() {}
	public void dd() {}
	
	public static void main(String[] args) {
	
	}

}



//interface interB implements InterA{} // 인터페이스를 같은 인터페이스에서 Override를 해주지 못함.
//class B implements A{} -> A자리에 인터페이스와야함.
//class B extends InterA{} - > x
//interface interB extends A{} - > x

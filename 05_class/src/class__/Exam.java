package class__;
import java.util.Scanner;
public class Exam {
	Scanner sc = new Scanner(System.in);
	private String name =null;
	private String dap = null;
	private char[] ox = new char[5];
	private int score =0;
	private final String JUNG="11111";
	Exam(){
		System.out.println("이름입력");
		this.name = sc.next();
		System.out.println("답입력");
		this.dap = sc.next();
		
	}
	public void compare() {
		for(int i= 0; i<JUNG.length();i++) {
			if(dap.charAt(i) == JUNG.charAt(i)) {
				ox[i] = 'o';
				score+=20;
			}
			if(dap.charAt(i)!= JUNG.charAt(i)){
				ox[i] = 'x';
			}
		}
		}
	public String getName() {
		return name;
	}
	public char[] getOx() {
		return ox;  //ox는 char[] 배열형임.
	}
	public int getScore() {
		return score;
	}

}

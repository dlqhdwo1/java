package collection;

import java.util.Stack;
import static java.lang.System.out;

public class StackMain {

	public static void main (String[] args) {
		String[] groupA = {"우즈베키스탄","쿠웨이트","사우디","대하민국"};
		
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<groupA.length;i++)stack.push(groupA[i]); //push()스택에 데이터넣기
		
		while(!stack.isEmpty())
			out.println(stack.pop()); //pop() 스택에 데이터빼기.
		
	}
}

package operator;

public class Operator4 {

	public static void main(String[] args) {
		
		int num1=0, num2=0;
		boolean result;
		
		result = ((num1+=10)<0 &&(num2+=10)>0);  //&&(and)연산은 앞에 조건이 True면 뒷에조건문 수행안함.
		System.out.println("result = "+result);
		System.out.println("num1= " +num1+ "num2="+num2);
		System.out.println();
		
		
		result = ((num1+=10)>0 || (num2+=10)>0); //||(or)연산은 앞에 문장이 True면 뒷조건문 수행안함.
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1 + "num2="+num2);

	}

}

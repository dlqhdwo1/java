package abstract_;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
public class NumberMain {

	public static void main(String[] args) {
//		NumberFormat nf = new NumberFormat(); 추상클래스라서 객체 생성불가함.
		
//		1.서브(자식)클래스이용해서 생성.
		NumberFormat nf = new DecimalFormat();//Sub Class를 이용하여 생성.
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
//		2.메소드를 이용하여 생성가능.
	
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
//		NumberFormat nf4= NumberFormat.getInstance();//메소드 이용하여생성
		NumberFormat nf4= NumberFormat.getCurrencyInstance(); // 원.
		nf4.setMaximumFractionDigits(2);//소수이하 2째자리
		nf4.setMinimumFractionDigits(2);
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		
		System.out.println("nf5");
		NumberFormat nf5= NumberFormat.getCurrencyInstance(Locale.US); //$
		nf5.setMaximumFractionDigits(2);//소수이하 2째자리
		nf5.setMinimumFractionDigits(2);
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
		
	}

}

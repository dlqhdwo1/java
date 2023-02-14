package abstract_;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Today {

	public static void main(String[] args) throws ParseException {  //main에서 예외처리가 발생하면 jvm에서 처리하도록 throws함.
		Date date = new Date();  //시스템의 시간과 날짜를 가져옴.
		
		System.out.println("오늘 날짜 : " + date);

		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 HH.:mm:ss");
		System.out.println("오늘날짜 : " + sdf.format(date));
		
		//입력 - 내생일
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMDDHHmmss");
		Date birth = input.parse("19910716091415"); //String -> Date형으로 변환
		
		System.out.println("내 생일 : " + birth);
		System.out.println("내 생일 : " + sdf.format(birth));
		System.out.println();
		
		
		//기준은 시스템 날짜와 시간을 기준으로 값을 꺼내옴. 
		Calendar cal = new GregorianCalendar(); // Calendar 은 추상클래스이므로 서브클래스를 이용하여 객체를 생성해야함. 
		 //조상                   자식
		Calendar cal2 = Calendar.getInstance(); // Calendar는 추상클래스이므로 .getInstance()메소드를 이용하여 객체를 생성해야함. 
		 
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(cal.DAY_OF_WEEK);
		
		String dayOfweek=null;
		
		switch(week) {  // switch문에는 break;를 써주지않으면 case7까지 수행함. 조건에 맞으면 break;로 switch문을 빠져나올수있게 만들어야함. 
			case 1:  dayOfweek = "일";
			break;
			case 2 : dayOfweek = "월";
			break;
			case 3 : dayOfweek = "화";
			break;
			case 4 : dayOfweek = "수";
			break;
			case 5 : dayOfweek = "목";
			break;
			case 6 : dayOfweek = "금";
			break;
			case 7 : dayOfweek = "토";
		}
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month+ "월 "  + day+ "일 " + dayOfweek + "요일 " + hour + "시 " + minute + "분 " + second + "초");
		
	}

}

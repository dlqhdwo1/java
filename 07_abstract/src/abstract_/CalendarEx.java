package abstract_;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

class CalendarEx{
	
	Calendar cal = Calendar.getInstance();
	
	Scanner sc = new Scanner(System.in);
	private int year;
	private int month;
	private int end;
	private int dayOfWeek;
	
	CalendarEx(){
		System.out.println("년도입력");
		year  = sc.nextInt();
		this.year = year;
		System.out.println("월입력");
		month = sc.nextInt();
		this.month = month;	
	}
	
	public void calc() {
		cal.set(Calendar.YEAR, year); //입력받은 년도로 세팅
		cal.set(Calendar.MONTH, month); //입력받은 월로 세팅
		cal.set(year,month-1,1); //입력받은 월의 1일로 세팅
								// month는 0이 1월이므로 -1을해준다.
		
		end = cal.getActualMaximum(Calendar.DATE); //해당월 마지막날짜
		dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); //해당 날짜의 요일
	
	}
	
	public void display() {
		System.out.println("   일  월  화  수  목   금  토");
		for(int i=1; i<=end; i++) {
			if(i==1) {
				for(int j=1; j<dayOfWeek; j++) {
					System.out.print("    ");
				}
			}
			if(i<10) { //한자릿수일 경우 공백을 추가해서 줄맞추기
				System.out.print(" ");
			}
			System.out.print(" "+i+" ");
			if(dayOfWeek%7==0) { //한줄에 7일씩 출력
				System.out.println();
			}
			dayOfWeek++;
		}
	}


}

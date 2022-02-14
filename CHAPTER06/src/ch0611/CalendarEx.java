package ch0611;

import java.time.DayOfWeek;
import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int dayOfweek = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"/"+month+"/"+day);
		System.out.println(dayOfweek);
		
		switch(dayOfweek) {
		case Calendar.SUNDAY : System.out.println("일요일"); break;
		case Calendar.MONDAY : System.out.println("월요일"); break;
		case Calendar.TUESDAY : System.out.println("화요일"); break;
		case Calendar.WEDNESDAY : System.out.println("수요일"); break;
		case Calendar.THURSDAY : System.out.println("목요일"); break;
		case Calendar.FRIDAY : System.out.println("금요일"); break;
		case Calendar.SATURDAY : System.out.println("토요일"); break;
		
		}
	}
}

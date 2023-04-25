package javaTask;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GetDateAndTime {

	public static void main(String[] args) {

		
		int day,month,year;
		int hour,minutes,seconds;
		
		GregorianCalendar calendar=new GregorianCalendar();
		day=calendar.get(Calendar.DAY_OF_MONTH);
		month=calendar.get(Calendar.MONTH);
		year=calendar.get(Calendar.YEAR);
		
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		minutes=calendar.get(Calendar.MINUTE);
		seconds=calendar.get(Calendar.SECOND);
		
		System.out.println("day-month-year :"+day+"-"+month+"-"+year);
		System.out.println("hour:minutes:seconds :"+hour+"-"+minutes+"-"+seconds);
				

	}

}

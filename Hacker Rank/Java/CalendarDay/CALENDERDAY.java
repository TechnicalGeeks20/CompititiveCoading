import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;

class CALENDERDAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub/
	Calendar calen= Calendar.getInstance();
		calen.set(2020,04,20);
		System.out.println("current Day "+calen.get(Calendar.DAY_OF_WEEK));
		int month=04;
		int day=19;
		int year=2020;
		LocalDate date = LocalDate.of(year, month, day);
	
	System.out.println(date.getDayOfWeek().name());
		
	}

}

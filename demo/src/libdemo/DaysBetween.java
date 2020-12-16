package libdemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetween {

	public static void main(String[] args) {
		var today = LocalDate.now();
		var start = LocalDate.of(2020, 1, 1);
		
		var days = ChronoUnit.DAYS.between(start, today);
		System.out.println(days);
		

	}

}

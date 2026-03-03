package functionalInterface;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class JavaDate {

	public static void main(String[] args) {
		
		LocalDateTime date = LocalDateTime.of(2002, Month.JANUARY, 3, 10, 30);
				//(2002, Month.JANUARY, 3)
		
		System.out.println("Date is: "+date);
		
		LocalTime time =LocalTime.of(8, 45, 33, 12);
		System.out.println("Time: "+time);

	}

}

package localeAPI;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {

	public static void main(String[] args) {

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now().minusDays(1).minusHours(0).minusSeconds(50));

		System.out.println(LocalDate.ofYearDay(2017, 224));

		LocalTime currentTimeInInd = LocalTime.now(ZoneId.of("Asia/Calcutta"));

		System.out.println("Time In India :" + currentTimeInInd);

		LocalTime nowInUTC = LocalTime.now(Clock.systemUTC());

		System.out.println("Current time UTC : " + nowInUTC);

		System.out.println(nowInUTC.plusMinutes(30));
	}

}

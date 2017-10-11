package localeAPI;

import java.time.ZoneId;
import java.util.TreeSet;

public class DisplayTimeZone {

	public static void main(String[] args) {

		TreeSet<String> sortedZones = new TreeSet<>(ZoneId.getAvailableZoneIds());
		
		System.out.println("Number Of Zones :" + sortedZones.size());
		
		System.out.println("");
		
		
		for (String zones : sortedZones) {
			System.out.println(zones);
		}
	}

}

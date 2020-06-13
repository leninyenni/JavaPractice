package regularExpressoins;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
public class GetNumberOfDaysInAMonth {
	static  HashMap<String, Integer> numberOfDays() {
		Map<String, Integer> objMap = new HashMap<String, Integer>();
		Calendar calendar = Calendar.getInstance();
		int month = calendar.JUNE;
		int year = 2020;
		int date = 1;
		calendar.set(year, month, date);
		int MaxDay = calendar.getActualMaximum(calendar.DAY_OF_MONTH);
		int mon = 0;
		int tue = 0;
		int wed = 0;
		int thu = 0;
		int fri = 0;
		int sat = 0;
		int sun = 0;
		for (int i = 1; i <=MaxDay; i++) {
			calendar.set(Calendar.DAY_OF_MONTH, i);
			if (calendar.get(Calendar.DAY_OF_WEEK) == calendar.MONDAY)
				mon++;
			else if (calendar.get(Calendar.DAY_OF_WEEK) == calendar.TUESDAY)
				tue++;
			else if (calendar.get(Calendar.DAY_OF_WEEK) == calendar.WEDNESDAY)
				wed++;
			else if (calendar.get(Calendar.DAY_OF_WEEK) == calendar.THURSDAY)
				thu++;
			else if (calendar.get(Calendar.DAY_OF_WEEK) == calendar.FRIDAY)
				fri++;
			else if (calendar.get(Calendar.DAY_OF_WEEK) == calendar.SATURDAY)
				sat++;
			else if (calendar.get(Calendar.DAY_OF_WEEK) == calendar.SUNDAY)
				sun++;
			else {
			}
		}
		objMap.put("Number of Mondays:", mon);
		objMap.put("Number of Tuesdays:", tue);
		objMap.put("Number of Wednesdays:", wed);
		objMap.put("Number of Thursdays:", thu);
		objMap.put("Number of Fridays:", fri);
		objMap.put("Number of Saturdays:", sat);
		objMap.put("Number of Sundays:", sun);
		System.out.println(mon+tue+wed+thu+fri+sat+sun);
		return (HashMap<String, Integer>) objMap;
	}
	public static void main(String[] args) {
		System.out.println(numberOfDays());
	}
}

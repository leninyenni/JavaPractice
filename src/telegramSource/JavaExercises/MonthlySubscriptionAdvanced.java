package telegramSource.JavaExercises;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class MonthlySubscriptionAdvanced {
	static int calculateSubscription(String papername,HashMap<String,Integer> daysInMonth, Map<String, Map<String, Integer>> paperprices) {
		int total = 0;
		// switch statement with int data type
		
		int moncount= daysInMonth.get("Monday");
		int tuecount= daysInMonth.get("Tuesday");
		int wedcount= daysInMonth.get("Wednesday");
		int thucount= daysInMonth.get("Thursday");
		int fricount= daysInMonth.get("Friday");
		int satcount= daysInMonth.get("Saturday");
		int suncount= daysInMonth.get("Sunday");
		
		int PriceFromMonToFriTOI=0;
		int PriceOnSatTOI=0;
		int PriceOnSunTOI=0;
		
		int PriceFromMonToFriHINDU=0;
		int PriceOnSatTOIHINDU=0;
		int PriceOnSunTOIHINDU=0;
		
		int PriceFromMonToFriET=0;
		int PriceOnSatET=0;
		int PriceOnSunET=0;
		
		switch (papername) {
		case "TOI":
			
			Map<String, Integer> getPricesTOI=paperprices.get("TOI");
			PriceFromMonToFriTOI=getPricesTOI.get("Monday Price");
			PriceOnSatTOI=getPricesTOI.get("Saturday Price");
			PriceOnSunTOI=getPricesTOI.get("Sunday Price");
			total = moncount * PriceFromMonToFriTOI + tuecount * PriceFromMonToFriTOI + wedcount * PriceFromMonToFriTOI + thucount * PriceFromMonToFriTOI + fricount * PriceFromMonToFriTOI + satcount*PriceOnSatTOI + suncount*PriceOnSunTOI;
			break;
		case "HINDU":
			Map<String, Integer> getPricesHINDU=paperprices.get("HINDU");
			PriceFromMonToFriHINDU=getPricesHINDU.get("Monday Price");
			PriceOnSatTOIHINDU=getPricesHINDU.get("Saturday Price");
			PriceOnSunTOIHINDU=getPricesHINDU.get("Sunday Price");
			total = moncount * PriceFromMonToFriHINDU + tuecount * PriceFromMonToFriHINDU + wedcount * PriceFromMonToFriHINDU + thucount * PriceFromMonToFriHINDU + fricount * PriceFromMonToFriHINDU + satcount*PriceOnSatTOIHINDU + suncount*PriceOnSunTOIHINDU;
			break;
		
	case "ET":
		Map<String, Integer> getPricesET=paperprices.get("ET");
		PriceFromMonToFriET=getPricesET.get("Monday Price");
		PriceOnSatET=getPricesET.get("Saturday Price");
		PriceOnSunET=getPricesET.get("Sunday Price");
		total = moncount * PriceFromMonToFriET + tuecount * PriceFromMonToFriET + wedcount * PriceFromMonToFriET + thucount * PriceFromMonToFriET + fricount * PriceFromMonToFriET + satcount*PriceOnSatET + suncount*PriceOnSunET;
		break;
	}
		return total;
	}
	static  HashMap<String, Integer> numberOfDaysInMonth() {
		Map<String, Integer> objMap = new HashMap<String, Integer>();
		Calendar calendar = Calendar.getInstance();
		int month = calendar.APRIL;
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
		objMap.put("Monday", mon);
		objMap.put("Tuesday", tue);
		objMap.put("Wednesday", wed);
		objMap.put("Thursday", thu);
		objMap.put("Friday", fri);
		objMap.put("Saturday", sat);
		objMap.put("Sunday", sun);
		System.out.println(mon+tue+wed+thu+fri+sat+sun);
		System.out.println(objMap);
		return (HashMap<String, Integer>) objMap;
	}

	
	static Map<String, Map<String, Integer>> pricesOfPapers() throws IOException
	{
		Map<String, Map<String, Integer>> allPapersPrices = ReadExcelSheetDataAll.setMapData();
		
		return allPapersPrices;
		}
	
	
	public static void main(String[] args) throws IOException {
		
		Map<String, Map<String, Integer>> GivenPaperPrices=pricesOfPapers();
		HashMap MonthlyDaysSplit=numberOfDaysInMonth();
		Scanner s = new Scanner(System.in);
		System.out.println("enter paper 1 name:");
		String enterPaperName1 = s.nextLine();
		System.out.println("enter paper 2 name:");
		String enterPaperName2 = s.nextLine();
	System.out.println("total for "+enterPaperName1+":"+calculateSubscription(enterPaperName1,MonthlyDaysSplit,GivenPaperPrices));
	System.out.println("total for "+enterPaperName2+":"+calculateSubscription(enterPaperName2,MonthlyDaysSplit,GivenPaperPrices));
	}
	
		
		//calculateSubscription("TOI",MonthlyDaysSplit,GivenPaperPrices);
		/*System.out.println("Subscription cost for TOI: "+ calculateSubscription("TOI",MonthlyDaysSplit,GivenPaperPrices));
		System.out.println("Subscription cost for HINDU: "+ calculateSubscription("HINDU",MonthlyDaysSplit,GivenPaperPrices));*/
}


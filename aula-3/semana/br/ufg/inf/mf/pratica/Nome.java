import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

public class Nome {
  public static void main(String argv[]) {
    Locale usersLocale = Locale.getDefault();
    DateFormatSymbols dfs = new DateFormatSymbols(usersLocale);
    String weekdays[] = dfs.getWeekdays();

    Calendar cal = Calendar.getInstance(usersLocale);
	int day = cal.get(Calendar.DAY_OF_WEEK); 
    int firstDayOfWeek = cal.getFirstDayOfWeek();
	
	System.out.println(weekdays[day]);
  }
}
import edu.princeton.cs.algs4.Date;

import java.util.Calendar;

/**
 * Created by Brian Martinez on 9/11/2016.
 */
public class SmartDate  {
    public Date date;

    // Calendar's DAY_OF_WEEK is 1-based
    String[] days = new String[] { "","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday" };

    public String dayOfTheWeek()
    {
        Calendar cal = Calendar.getInstance();
        // Calendar's month is zero-based
        cal.set(date.year(), date.month() - 1, date.day());
        int w = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(w);
        return days[w];
    }
}

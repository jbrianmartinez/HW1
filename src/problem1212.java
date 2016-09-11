import edu.princeton.cs.algs4.Date;

/**
 * Created by Brian Martinez on 9/11/2016.
 */
public class problem1212 {
    public static void main(String[] args)
    {
        SmartDate smDate = new SmartDate();
        smDate.date = new Date(9,10,2016);

        System.out.println(smDate.date.toString() + " is a " + smDate.dayOfTheWeek());
    }
}

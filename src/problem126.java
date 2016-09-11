/**
 * Created by Brian Martinez on 9/11/2016.
 */
public class problem126 {
    public static void main(String[] args)
    {
        String s = "Martinez";
        String t = "tinezMar";

        if (s.length() == t.length() && ((s+s).indexOf(t) > -1 && (t+t).indexOf(s) > -1))
            System.out.println(s + " is a circular shift of " + t);
        else
            System.out.println(s + " is not a circular shift of " + t);
    }
}

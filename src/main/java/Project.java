/**
 * Created by Victor on 11.02.2016.
 */
import java.io.Console;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
public class Project {
    public static void main(String[] args) {

        Calendar a = new Calendar();

        if (args.length == 1){
            a = new Calendar(args[0]);
        }
        else if (args.length > 1){
            a = new Calendar(args[0], args[1]);
        }

        if(args.length < 3) {
            a.printCalendar();
        }
        else {
            a.printCalendarHTML();
        }
    }
}
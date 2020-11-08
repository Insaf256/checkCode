import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Task I. Create 3 classes with inheritance in this package.
 * At least one of classes must contain at least 5 fields with getters-setters.
 */
public class Task_I {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Model model = new Model("ad", 13, "fds");
        Xerox xerox = new Xerox(calendar.getTime(), "white", 1232, false, model, "Das", 128, true);
        Xerox xerox2 = new Xerox(calendar.getTime(), "white", 1232, false, model, "Das", 128, true);
        System.out.println(xerox.equals(xerox2));
    }
}

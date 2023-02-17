import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

class Java_Data_Time
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Day :");
        int day = sc.nextInt();
        System.out.println("Enter The Month :");
        int month = sc.nextInt();
        System.out.println("Enter The Year :");
        int year = sc.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        String dayOfWeek = cal.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG, Locale.US).toUpperCase();
        System.out.println(dayOfWeek);
    }
}
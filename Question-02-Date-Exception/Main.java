
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParsePosition;
public class Main {
    static boolean isValidDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
        sdf.setLenient(false);
        ParsePosition position = new ParsePosition(0);
        sdf.parse(date, position);
        return position.getIndex() == date.length()&& position.getErrorIndex() == -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String startTime = sc.next();
        String endTime = sc.next();
        try {
            if (!isValidDate(startTime) || !isValidDate(endTime)) {
                throw new Exception();
            }
            System.out.println(startTime + " " + endTime);

        } catch (Exception e) {
            System.out.println("Input dates should be in the format dd-MM-yyyy-HH:mm:ss");
        }
    }
}

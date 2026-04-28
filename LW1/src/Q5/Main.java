package Q5;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat("EEEE, MMM dd, yyyy");

        System.out.println(format.format(today));
    }
}


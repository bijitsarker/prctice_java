import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTime {
    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println( datetime);
        DateTimeFormatter datetimeF = DateTimeFormatter.ofPattern("dd-mm-yyyy-HH:mm:ss");
        

        String FormatterDate = datetime.format(datetimeF);
        System.out.println(FormatterDate);
    }

    
}

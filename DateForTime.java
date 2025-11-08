import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateForTime {
    public static void main(String[] args) {
        LocalDateTime Of = LocalDateTime.now(); //create obj Of
        System.out.println(Of);

        DateTimeFormatter Off = DateTimeFormatter.ofPattern("dd-mm-yyyy--HH:mm:ss");

        String OOff = Of.format(Off);
        System.out.println(OOff);
        
    }
    
}

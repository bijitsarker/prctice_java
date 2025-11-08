import java.util.Scanner;
public class FarToCel {
    public static void main(String[] args) {
        int Cel, Far;
        Scanner far = new Scanner(System.in);
        System.out.print("Enter Cel : ");
        Cel = far.nextInt();

        Far = (9*Cel)/5+32;
        System.out.println("The Celsius  Fahrenheit:" + Far);

        
    }
    
}

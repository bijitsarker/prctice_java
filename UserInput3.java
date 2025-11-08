import java.util.Scanner;
public class UserInput3 {
    public static void main(String[] args) {
        Scanner mynum = new Scanner(System.in);
        System.out.print("Enter Frist Number:");
        double a = mynum.nextFloat();
        System.out.print("Enter Second Number:");
        double b = mynum.nextInt();
        System.out.print("Enter Third Number:");
        double c = mynum.nextDouble();
        double sum = a*b+c;
        System.out.println("The sum of equal: "+ sum);
        // boolean b = mynum.hasNextInt();
        // System.out.println(b);
        

    }
    
}

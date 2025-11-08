import java.util.Scanner;
public class Area {
    public static void main (String[] args){
        int a, b, area;
        Scanner ar = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = ar.nextInt();
        System.out.print("Enter b : ");
        b = ar.nextInt();
        area = a * b * 20;
        System.out.println("The Area = " + area);


    }
    
}

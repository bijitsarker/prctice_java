import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int Number = Sc.nextInt();
       
        switch(Number){
            case 1:
            System.out.println("Good day.");
            break;
            case 2:
            System.out.println("it is not bed day");
            break;
            default:
            System.out.println("it is bed day.");
        
        }
    }
    
}

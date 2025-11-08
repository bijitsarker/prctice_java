import java.util.Scanner;
public class UserInput2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A Number:");
        float f = input.nextFloat();
        float sum = f*20;
        System.out.println("The Sum of: "+ sum);

        
    }
    
}

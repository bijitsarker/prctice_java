import java.util.Scanner;
public class EvenorOod {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int num;
        System.out.print("Enter num : ");
        num = en.nextInt();
        if(num%2==0){
            System.out.println("Tne Number is Odd.");
        }
        else{
            System.out.println("The NUmber is Even.");
        }
    }
    
}

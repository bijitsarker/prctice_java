import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Age: ");
        int age = sc.nextInt();
        if(age<18){
            System.out.println("He can not drive the car.");
        }
        else if(age>=18&&age<=40){
            System.out.println("He can drive the car.");
        }
        else{
            System.out.println("Nothing.");
        }
        
    }
    
}

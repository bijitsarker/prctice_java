import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter frist velue: ");
    int a = sc.nextInt();
   
    System.out.print("Enter second velue: ");
    int b = sc.nextInt(); System.out.print("Enter oparetor Number: ");
    int sol = sc.nextInt();
    // if(sol=='+'){
    //     System.out.println(a+b);
    // }
    // else if(sol=='-'){
    //     System.out.println(a-b);
    // }
    // else if(sol=='*'){
    //     System.out.println(a*b);
    // }
    // else if(sol=='/'){
    //     System.out.println(a/b);
    // }
    // else{
    //     System.out.println("undifinde");
    // }
   
    switch(sol){
    case 1:
        System.out.println("The final velue: "+a+b);
        break;
    case 2:
        System.out.println("The final velue: "+ (a-b));
        break;
    case 3:
        System.out.println("The final velue: "+a*b);
        break;
    case 4:
        if(b==0){
            System.out.println("Undifinde");
        }
        else{
            System.out.println("The final velue: "+a/b);
        }
        break;
    case 6:
       System.out.println("default");
    }
    }
    
}

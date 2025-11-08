import java.util.Scanner;  

class UserInput {
  public static void main(String[] args) {
    System.out.println("Teking Input Form The User:");
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter number 1:");
     int a = sc.nextInt();
     System.out.print("Enter number 2:");
     int b = sc.nextInt();
     int sum = a + b;
     System.out.println("the sum of:"+ sum);
     

  }
}

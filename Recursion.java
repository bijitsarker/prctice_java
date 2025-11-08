public class Recursion {
    public static void main(String[] args) {
       
        int result = myFuction(12, 23);
         System.out.println("Result = " + result);
    }
         public static int myFuction(int a, int b){
            if(b>a){
                return a*b+20;
            }
            else{
                return a+b;
            }

        
    }
    
}

public class Method3 {
    // static int myAge(int x){
    //     return 5 * x + 3;
    // }
    // public static void main(String[] args) {
    //     System.out.println("Your Age is : " + myAge(15));
        
    // }

    static int myMethod(int age, int GPA){
        return age * GPA;
    }
    public static double myMethod2(double a, double b){
        return a + b;
    }
        public static void main(String[] args) {
            int AS = myMethod(17, 6);
            double DU = myMethod(12, 10);
            System.out.println("Your Age & GPA: " + AS);
            System.out.println("a + b : " + DU);

        
    }
    
}

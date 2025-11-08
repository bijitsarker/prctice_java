public class Recurdion2 {
    public static void main(String[] args) {
        float Fu = Sum1(12, 3);
        double Du = Sum2(13.3, 24);
        System.out.println("Fu = " + Fu);
        System.out.println("Du = " + Du);
        
    }
    static float Sum1(float x, float y){
        if(x>y){
            return x % y;
        }
        else{
            return x + y;
        }

    }
    static double Sum2(double a, double b){
        return a * b + a +b;

    }
    
}

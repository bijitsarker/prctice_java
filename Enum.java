

enum Level{
    LOW,
    MEDIUM,
    HIGH;
}
public class Enum {
    public static void main(String[] args) {
         Level myvar = Level.MEDIUM;
         switch(myvar){
            case LOW:
            System.out.println("Low Level");
            break;
            case MEDIUM:
            System.out.println("Level Medium");
            break;
            case HIGH:
            System.out.println("HIGH lEVEL");

         }
        
    }
    
}


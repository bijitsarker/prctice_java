

enum Level{ 
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}
public class Enum2 {
    public static void main(String[] args) {
    
       Level day = Level.THURSDAY;
       switch(day){
        case MONDAY:
        System.out.println("The day is Monday");
        break;
        case SUNDAY:
        System.out.println("The day is Sunday");
        break;
        case WEDNESDAY:
        System.out.println("The day is Wednesday");
        break;
        case THURSDAY:
        System.out.println("The day is Tuersday");
        break;
        case FRIDAY:
        System.out.println("The day is Friday");
        break;
        case SATURDAY:
        System.out.println("Saturday");
        break;
        default:
        System.out.println("Nothing");
       }
      
        
    }
    
}

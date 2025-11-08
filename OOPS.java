class pen{
    String color;
    String type;

public void  write(){
    System.out.println(color +" . "+ type);
}
public void write2(){
    System.out.println(color+ " . "+ type);
  }
}
class New{
    int Age = 20;
    public int Num(){
        return Age*2;
    }

}
public class OOPS {
    public static void main(String[] args) {
        pen pi = new pen();
        pi.color = "red";
        pi.type = "gel";
        pi.write();
        pen p2 = new pen();
        p2.color = "bule";
        p2.type = "bollpen";
        p2.write2();
        New N1 = new New();
        N1.Num();
    }
    
}

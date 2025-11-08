public class Constructor {
    int Year;
    String Model;
    public Constructor(int year, String model){
        Year = year;
        Model = model;

    }
        public static void main(String[] args) {
        Constructor Co = new Constructor(2020, "F102");
        System.out.println("Model : "+Co.Model);
        System.out.println("Year  : "+Co.Year);
        
    }
     
}

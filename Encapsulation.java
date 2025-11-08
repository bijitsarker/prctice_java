public class Encapsulation {
    private String Name;
    private int Age;
    public void setName(String name){
        Name = name;
    }
    public void setAge(int age){
        Age = age;
    }
    
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;

    }
    public static void main(String[] args) {
        Encapsulation En = new Encapsulation();
        En.setName("Bijit sarker");
        En.setAge(17);
        System.out.println("Name : " + En.getName());
        System.out.println("Age  : " + En.getAge());

    }

    
}

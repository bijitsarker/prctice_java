public class JString {
    public static void main(String[] args) {
        String str = "abcdefghijklmNOPQRSTUVWXYZ";
        String str2 = "abar asib 'fire' ei dese";
       
        System.out.println("The length of str:" + str.length());
        System.out.println("Str : "+ str.toUpperCase());
        System.out.println("Str : "+ str.toLowerCase());
        System.out.println("Str : "+ str2.indexOf("fire"));
    }
    
}

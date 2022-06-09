public class Logical {
    public static void main(String[] args){
        System.out.println("----------");
        System.out.println("Logical Operators");
        System.out.println("----------");

        int a = 5, b = 8;
        System.out.println("where a= " + a + " and b= " + b);
        System.out.println( a < 10 && b > 10); // Returns true if both statements are true
        // expected output> false

        System.out.println( a < 10 || b > 10); // Returns true if one of the statements is true
        // expected output> true

        System.out.println( !(a < 10 && b < 10)); // Reverse the result, returns false if the result is true
        // expected output> true
    }
}
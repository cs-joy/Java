public class Comparison {
    public static void main(String[] args){
        System.out.println("----------");
        System.out.println("Comparison Operators");
        System.out.println("----------");

        int x = 5, y = 4;
        System.out.println("where x= " + x + " and y= " + y);
        System.out.println("x == y :_> " + (x == y));
        // expected output:_> false

        System.out.println("x != y :_> " + (x != y));
        // expected output:_> true

        System.out.println("x > y :_> " + (x > y));
        // expected output:_> true

        System.out.println("x < y :_> " + (x < y));
        // expected output :_> false

        System.out.println("x >= y :_> " + (x >= y));
        // expected output :_> true

        System.out.println("x <= y :_> " + (x <= y));
        // expected output :_> false
    }
}

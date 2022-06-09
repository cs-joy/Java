// find the largest of 3 numbers using the nested ternary operator

public class NestedTernary {
    public static void main(String[] args){
        int num1 = 6, num2 = 8, num3 = 11, result;

        result = (num1 >= num2) ? ((num1 >= num3) ? num1 : num3) : ((num2 >= num3) ? num2 : num3);
        /*
         * Explanation-
           [*] (n1 >= n2) - first test condition that checks if n1 is greater than n2
           [*] (n1 >= n3) - second test condition that is executed if the first condition is true
           [*] (n2 >= n3) - third test condition that is executed if the first condition is false
         */
        System.out.println("Large number = " + result);
    }
}

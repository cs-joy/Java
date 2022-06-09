/* 
 * The ternary operator (conditional operator) is shorthand for the if-then-else statement. For example,
  ------
  variable = Expression ? expression1 : expression2
  ------
  How it works?
  If the Expression is true, expression1 is assigned to the variable.
  If the Expression is false, expression2 is assigned to the variable.
*/


public class Ternary {
    public static void main(String[] args){
        int februaryDays = 29;
        String result;

        result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        
        System.out.println(result);
    }
}

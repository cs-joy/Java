
public class Main
{
	public static void main(String[] args) {
	    String pr = "Hi";
	    pr = "Hello";
	    
	    int intNum = 4;
	    intNum = 5;
	    
	    float floatNum = 5.24f;
	    floatNum = 7.12f;
	    
	    double myDouble = 60.2435d;
	    
	    final char ch = 'S';
	    
	    /*
	    cannot assign a value to final variable
	    
	    ch = 'J';
	    */
	    boolean myBool = true;
	    
	    myBool = false;
	    
	    byte a = 12; // range is: -128 to 127
	    
	    //typecasting
	    
	    int typNum = 10;
	    
	    double typeCast =  typNum;
	    
	    // Narrowing Casting
	    
	    double DoubleCast = 29.453d;
	    int IntCast = (int) DoubleCast; // Manual casting: double to int
	    
	    // Operators
	    int sum1 = 25 + 25;
	    int sum2 = sum1 + 50;
	    int sum3 = sum2 + 50;
	    /*
	    Java divides the operators into the following groups:

            - Arithmetic operators
            - Assignment operators
            - Comparison operators
            - Logical operators
            - Bitwise operators
            */
	    
		System.out.println(sum3);
	}
}

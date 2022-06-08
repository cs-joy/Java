public class ArithmaticOperators {
  public static void main(String[] args){
    System.out.println("---------------------");
      /*
      Java divides the operators into the following groups:
      - Arithmetic operators
      - Assignment operators
      - Comparison operators
      - Logical operators
      - Bitwise operators
      */
    System.out.println("ArithmaticOperators");
    System.out.println("---------------------");
    int firstNum = 2, secNum = 10;
    
    int addition = firstNum + secNum;
    System.out.println("Addition:-");
    System.out.println(addition);
    
    int subtraction = secNum - firstNum;
    System.out.println("Subtraction:-");
    System.out.println(subtraction);
    
    int multiplication = firstNum * secNum;
    System.out.println("Multiplication:-");
    System.out.println(multiplication);
    
    int division = secNum / firstNum;
    System.out.println("Division:-");
    System.out.println(division);
    
    int modulus = secNum % firstNum;
    System.out.println("Modulus:-");
    System.out.println(modulus);
    
    int increment = ++firstNum;
    System.out.println("Increment");
    System.out.println(increment);
    
    int decrement = --secNum;
    System.out.println("Decrement:-");
    System.out.println(decrement);
    
    System.out.println("---------------------");
    System.out.println("Assignment Operators");
    System.out.println("---------------------");
    
    int addtionAssignment = 10;
    addtionAssignment += 2;
    System.out.println("Additino Assignment:- ");
    System.out.println(addtionAssignment);
    
    int subtractionAssignment = 10;
    subtractionAssignment -= 2;
    System.out.println("Subtraction Assignment:- ");
    System.out.println(subtractionAssignment);
    
    int multiplicationAssignment  = 11;
    multiplicationAssignment *= 3;
    System.out.println("Multiplication Assignment:- ");
    System.out.println(multiplicationAssignment);
    
    
    double divisionAssignment = 15;
    divisionAssignment /= 5;
    System.out.println("Division Assignment:- ");
    System.out.println(divisionAssignment);
    
    int modulusAssignment = 20;
    modulusAssignment %= 5;
    System.out.println("Modulus Assignment:- ");
    System.out.println(modulusAssignment);
    
    
    
  }
}

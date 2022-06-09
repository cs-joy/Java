import java.util.Scanner;

public class UnsignedRightShift {
    public static void main(String[] args){
        System.out.println("Unsigned Right Shift Operator ");
        int num1, num2, result1, result2, r, r2;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1: ");
        num1 = input.nextInt();

        System.out.println("Enter num2: ");
        num2 = input.nextInt();

        result1 = num1 >>> 2;
        result2 = num2 >>> 2;
        r = num1 >> 2;
        r2 = num2 >> 2;

        System.out.println("result1= " + result1);
        System.out.println("result2= " + result2);

        // ex
        System.out.println("result2= " + r);
        System.out.println("result2= " + r2);

        input.close();

    }
}

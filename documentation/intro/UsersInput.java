import java.util.Scanner;

public class UsersInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");

        int marks;
        marks = input.nextInt();

        String result;

        result = (marks >= 33) ? "Pass" : "Fail";

        System.out.println("You " + result + " the exam");
        input.close();
    }
}

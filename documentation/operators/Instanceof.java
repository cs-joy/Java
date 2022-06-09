public class Instanceof {
    public static void main(String[] args){
        System.out.println("instanceof operator");

        String str = "Walker";
        boolean result1, result2;

        result1 = str instanceof String;

        System.out.println("Is str an object of String? " + result1);

        Instanceof obj = new Instanceof();

        result2 = obj instanceof Instanceof;

        System.out.println("Is OBJ an object of Instanceof class? " + result2);
    }
}

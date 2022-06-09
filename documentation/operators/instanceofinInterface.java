
interface Car {

}

class BMW implements Car {

}

public class instanceofinInterface {
    public static void main(String[] args){
        // create object
        BMW b1 = new BMW();
        boolean result1;
        //// checks if the object of BMW is also an instance of Car
        result1 = b1 instanceof Car;
        System.out.println(result1);
    }
}

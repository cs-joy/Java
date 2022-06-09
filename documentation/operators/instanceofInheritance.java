//superclass
class Animal {

}

//subclass
class Cat extends Animal {

}


public class instanceofInheritance {
    public static void main(String[] args){
        // create object of the subclass
        Cat c1 = new Cat();

        boolean result1, result2;
        // checks if c1 is an instance of the subclass
        result1 = c1 instanceof Cat;
        System.out.println(result1);
        // checks if c1 is an instance of the superclass
        result2 = c1 instanceof Animal;
        System.out.println(result2);
    }
}

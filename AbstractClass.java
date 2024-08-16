abstract class Car { // ----> This is abstract class

    // abstract method should have abstract class
    // but not compulsory for abstract class should have abstract method.

    public abstract void drive();

    public void playMusic() {
        System.out.println("Play Music");
    }
}

class Verna extends Car { // ----> This is concrete class
    // below method is abstract method from abstract class. This abstract method
    // should declare in subclass compulsorily coz subclass inherits the
    // abstract superclass. So, the abstract methods in abstract class should
    // declare in subclass.
    public void drive() {
        System.out.println("Drive method");
    };
}

public class AbstractClass {
    public static void main(String args[]) {

        // can not create obj of abstract class
        // but you can create the reference of abstract class
        // Car obj = new Car();

        Car obj1 = new Verna();
        obj1.drive();
        obj1.playMusic();
    }
}
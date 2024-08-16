class Calculator {
    // JVM creates the object
    // JVM gets blueprint from class which has methods and variables

    public int add(int num1, int num2) {
        System.out.println("in add");
        return num1 + num2;
    }
}

public class ClassObject {
    public static void main(String[] args) {
        // below are primitive variable
        int num1 = 1;
        int num2 = 2;
        // to create an object
        Calculator calc = new Calculator();
        // now calc is the reference variable
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}

class Mobile {
    String brand;
    int price;
    static String type;

    public void show() {
        System.out.println(brand + " : " + price + " : " + type);
    }
}

public class StaticVariable {
    public static void main(String args[]) {

        // if the instance variable is static, making the variable to common to all
        // objects.

        // static means member of class.
        // non static means member of object.
        // we do not have a separate static variable for all objects.

        Mobile mob1 = new Mobile();
        mob1.brand = "Apple";
        mob1.price = 1000;
        mob1.type = "SmartPhone";

        Mobile mob2 = new Mobile();
        mob2.brand = "Samsung";
        mob2.price = 1200;
        mob2.type = "Flip";

        mob1.type = "New type";

        mob1.show();
        mob2.show();
    }
}

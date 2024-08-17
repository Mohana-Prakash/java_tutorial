enum Laptop {
    Lenovo(1200), HP(800), Dell, Acer(960);

    private int price;

    Laptop() {
        price = 2000;
    }

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class AdvcEnumClass {
    public static void main(String args[]) {
        // Laptop lap = Laptop.Lenovo;
        // System.out.println(lap + " : " + lap.getPrice());

        // array method
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}

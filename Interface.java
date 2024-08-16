interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("I need Laptop");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("I need desktop");
    }
}

class Developer {
    public void devApp(Computer machine) {
        machine.code();
    }
}

public class Interface {
    public static void main(String args[]) {
        Computer desktop = new Desktop();
        Computer laptop = new Laptop();
        Developer dev = new Developer();
        dev.devApp(laptop);
    }
}

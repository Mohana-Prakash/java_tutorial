class A {

    int n = 8;
    static String str = "Mohan";

    public void show(int number) {
        n = number;
        System.out.println(n);
    }

    static class B {
        int num = 9;

        public B(int number) {
            num = number;
            System.out.println(num);
        }

        public void inConfig() {
            System.out.println("In config");
        }
    }
}

public class InnerClass {
    public static void main(String args[]) {
        // A obj = new A();
        // obj.show(6);

        // below code is for non static class
        // A.B obj1 = obj.new B(5);
        // obj1.inConfig();

        // below code is for static class
        A.B obj2 = new A.B(5);
        obj2.inConfig();

        // anonymous inner class
        A obj = new A() {
            public void show(int number) {
                n = number;
                System.out.println(n);
            }
        };
        obj.show(4);
        System.out.println(A.str);
    }
}

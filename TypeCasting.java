class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show1() {
        System.out.println("in B show");
    }
}

public class TypeCasting {
    public static void main(String args[]) {
        A obj1 = new B();
        obj1.show();

        B obj2 = (B) obj1;
        obj2.show();
    }
}


class Parent {
    public Parent() {
        System.err.println("in parent constructor");
    }

    public Parent(int n) {
        System.err.println("in P_parent constructor");
    }
}

class Child extends Parent {
    public Child() {
        super(5);
        System.err.println("in child constructor");
    }

    public void Child() {
        System.err.println("in P_child constructor");
    }
}

public class SuperMethod {
    public static void main(String args[]) {
        Child obj = new Child();
    }
}

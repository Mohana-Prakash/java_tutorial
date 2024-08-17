@FunctionalInterface
interface New {
    int add(int i, int j);
}

// class NewOne implements New {
// public void show() {
// System.out.println("In show");
// }
// }

public class LamdaExp {
    public static void main(String args[]) {
        // New obj = new New() {
        // public void show() {
        // System.out.println("In show");
        // }
        // };

        New obj = (i, j) -> i + j;
        System.out.println(obj.add(5, 6));
    }
}

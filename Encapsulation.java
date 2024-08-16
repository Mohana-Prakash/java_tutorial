class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Encapsulation {
    public static void main(String args[]) {
        Human human = new Human();
        human.setName("Mohan");
        System.out.println(human.getName());
    }
}

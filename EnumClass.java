enum Status {
    Pending, Approved, Failure, Success
}

public class EnumClass {
    public static void main(String args[]) {
        Status s = Status.Failure;
        // System.out.println(s);

        // switch case
        // String result = switch (s) {
        // case Pending -> "Wait for sometime";
        // case Approved -> "Verified";
        // case Failure -> "Try again";
        // case Success -> "Good to go";
        // default -> "No enum";
        // };

        // System.out.println(result);

        // array method
        // Status[] ss = Status.values();
        // for (Status s : ss) {
        // System.out.println(s + " : " + s.ordinal());
        // }
    }
}

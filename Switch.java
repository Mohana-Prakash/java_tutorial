class Switch {
    // instead of using colan in case, -> can be used to avoid break statement.
    public static void main(String args[]) {
        int a = 5;

        switch (a) {
            // old switch method
            // case 1:
            // System.out.println("Sunday");
            // break;
            // case 2:
            // System.out.println("Monday");
            // break;
            // case 3:
            // System.out.println("Tuesday");
            // break;
            // case 4, 5:
            // System.out.println("Wednesday, Thursday");
            // break;
            // case 6:
            // System.out.println("Friday");
            // break;
            // case 7:
            // System.out.println("Saturday");
            // break;
            // default:
            // System.out.println("No days");

            // new switch method
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4, 5 -> System.out.println("Wednesday, Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("No days");

        }
    }
}

// more new method is return statement in every case

// switch(){
// case 1 -> return 1
// case 2 -> return 2
// }

// int return = switch(){
// case 1 -> 1
// case 2 -> 2
// }

// if you want switch statement as expression and at the same time if I want to
// use colan instead of arrow only by yeild keyword

// int return = switch(){
// case 1 : yeild 1
// case 2 : yeild 2
// }

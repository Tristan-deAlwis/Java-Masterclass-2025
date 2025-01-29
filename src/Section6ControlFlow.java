package src;

public class Section6ControlFlow {
    public static void main() {
        System.out.println("Section 6: Control Flow");

//        lesson57();
//        lesson58();
//        lesson59();
//        lesson60();
//        lesson61();
        lesson62();
//        lesson63();
//        lesson64();
//        lesson65();
//        lesson66();
//        lesson67();
//        lesson68();
//        lesson69();
//        lesson70();
//        lesson71();
//        lesson72();
//        lesson73();
//        lesson74();
//        lesson75();

    }

    private static void lesson57() {
        System.out.println("Lesson 57: The switch statement\n");

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4, 5");
                break;
        }

        System.out.println();
    }

    private static void lesson58() {
        System.out.println("Lesson 58: More switch statement\n");

        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4, 5");
        }

        String month = "APRIL";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

        System.out.println();
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }

    private static void lesson59() {
        System.out.println("Lesson 59: Traditional Switch Challenge\n");

        char charValue = 'A';
        switch (charValue) {
            case 'A' -> System.out.println("A is Alpha");
            case 'B' -> System.out.println("B is Bravo");
            case 'C' -> System.out.println("C is Charlie");
            case 'D' -> System.out.println("D is Delta");
            case 'E' -> System.out.println("E is Echo");
            default -> System.out.println("bad char");
        }
        ;

        System.out.println();
    }

    private static void lesson60() {
        System.out.println("Lesson 60: A Switch Expression Challenge\n");

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        System.out.println();
    }

    public static void printDayOfWeek(int day) {
        String dayOfTheWeek = switch (day) {
            case 0 -> dayOfTheWeek = "Sunday";
            case 1 -> dayOfTheWeek = "Monday";
            case 2 -> dayOfTheWeek = "Tuesday";
            case 3 -> dayOfTheWeek = "Wednesday";
            case 4 -> dayOfTheWeek = "Thursday";
            case 5 -> dayOfTheWeek = "Friday";
            case 6 -> dayOfTheWeek = "Saturday";
            default -> dayOfTheWeek = "Invalid Day";
        };
        System.out.println(day + " stands for " + dayOfTheWeek);
    }

    private static void lesson61() {
        System.out.println("Lesson 61: The for Statement\n");

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }
        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest(10_000.00, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

        for (double rate = 7.5; rate <= 10; rate += 0.25) {
            double interestAmount = calculateInterest(100.00, rate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("$100 at " + rate + "% interest = $" + interestAmount);
        }

        System.out.println();
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    private static void lesson62() {
        System.out.println("Lesson 62: The for Statement Challenge Exercise\n");

        int counter = 0;
        for (int i = 10; counter < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                counter++;
                System.out.println(i);
            }
        }

        System.out.println();
    }

    public static boolean isPrime (int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    private static void lesson63() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson64() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson65() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson66() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson67() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson68() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson69() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson70() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson71() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson72() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson73() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson74() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson75() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }
}

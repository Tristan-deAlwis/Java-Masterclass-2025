package src;

import java.util.Scanner;

public class Section6ControlFlow {
    public static void main() {
        System.out.println("Section 6: Control Flow");

        lesson57();
        lesson58();
        lesson59();
        lesson60();
        lesson61();
        lesson62();
        lesson63();
        lesson65();
        lesson66();
        lesson67();
        lesson71();
        lesson72();
        lesson73();
        lesson74();
        lesson75();

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
        System.out.println("Lesson 63: Sum 3 and 5 Challenge And Using IntelliJ's Debugger\n");

        int sum = 0;
        int counter = 0;
        for (int i = 1; counter < 5 && i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum += i;
                counter++;
            }
        }
        System.out.println(sum);

        System.out.println();
    }

    private static void lesson65() {
        System.out.println("Lesson 65: The while and do while statements\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int j = 1;
        boolean isReady = false;
        do {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
            isReady = (j > 0);
        } while (isReady);

        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }

        System.out.println();
    }

    private static void lesson66() {
        System.out.println("Lesson 66: The while Loop Challenge Exercise\n");

        int i = 5;
        int countEven = 0;
        int countOdd = 0;

        while (i <= 20) {
            if (isEvenNumber(i)) {
                System.out.println(i + " is an even number");
                countEven++;
                if (countEven >= 5) {
                    break;
                }
            } else {
                countOdd++;
            }
            i++;
        }
        System.out.println(countEven + " even numbers");
        System.out.println(countOdd + " odd numbers");

        System.out.println();
    }

    public static boolean isEvenNumber(int number) {
        boolean answer = false;
        answer = number % 2 == 0;
        return answer;
    }

    private static void lesson67() {
        System.out.println("Lesson 67: Digit Sum Challenge\n");

        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));

        System.out.println();
    }

    public static int sumDigits (int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;
            while (number > 9) {
                sum += (number % 10);
                number = number / 10;
            }
            sum += number;
            return sum;
        }
    }

    private static void lesson71() {
        System.out.println("Lesson 71: Parsing Values and Reading Input using System.console()\n");

        int currentYear = 2022;
        String usersDateOfBirth = "1999";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));

        String usersAgeWithPartialYear = "22.5";
        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
        System.out.println("The user says he is " + ageWithPartialYear);

        System.out.println(getInputFromConsole(currentYear));

        System.out.println(getInputFromScanner(currentYear));

        System.out.println();
    }

    public static String getInputFromConsole (int currentYear) {
        String name = System.console().readLine("Hi, What's your Name? ");
        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner (int currentYear) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hi, What's your Name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!! Try again.");
            }
        } while (!validDOB);

        return "So you are " + age + " years old";
    }

    private static void lesson72() {
        System.out.println("Lesson 72: Exception Handling, and Introduction to Scanner\n");

        int currentYear = 2022;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

        System.out.println();
    }

    private static void lesson73() {
        System.out.println("Lesson 73: Reading Input with Scanner\n");

        int currentYear = 2022;

        System.out.println(getInputFromScanner(currentYear));

        System.out.println();
    }

    public static int checkData (int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minumumYear = currentYear - 125;

        if((dob < minumumYear) || (dob > currentYear)) {
            return -1;
        }

        return (currentYear - dob);
    }

    private static void lesson74() {
        System.out.println("Lesson 74: Reading User Input Challenge\n");

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        double sum = 0;

        do {
            System.out.println("Each number #" + counter + ":");
            String nextNumber = scanner.nextLine();
            try {
//                int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
            }
        } while (counter <= 5);
        System.out.println("Sum is " + sum);

        System.out.println();
    }

    private static void lesson75() {
        System.out.println("Lesson 75: Min and Max Challenge\n");

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 1;
        int counter = 0;

        while (true) {
            System.out.println("Enter a number:");
            String nextNumber = scanner.nextLine();

            try {
                int number = Integer.parseInt(nextNumber);
                if (counter == 0 || number < min) {
                    min = number;
                } if (counter == 0 || number > max) {
                    max = number;
                }
                counter++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid number");
                break;
            }
        }

        System.out.println("Min is " + min);
        System.out.println("Max is " + max);

        System.out.println();
    }
}

package src;

public class Section4IntelliJBasics { //A class
    public static void main(String[] args) {
        System.out.println("Section 4: IntelliJ Basics");

        lesson33();
        lesson34();
        lesson35();
        lesson36();
        lesson37();
        lesson38();
        lesson39();
        lesson40();
    }

    private static void lesson33() {
        System.out.println("Lesson 33: Hello World in IntelliJ\n");

        System.out.println("Hello World!");
        System.out.println("\n");
    }

    private static void lesson34() { //A method
        //A code block
        System.out.println("Lesson 34: Hello World in IntelliJ\n");

        System.out.println("Hello, Tim");

    }

    private static void lesson35() {
        System.out.println("Lesson 35: if-then Statement\n");

        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I Am scared of aliens");
        }
    }

    public static void lesson36() {
        System.out.println("Lesson 36: Logical AND Operator\n");

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
    }

    private static void lesson37() {
        System.out.println("Lesson 37: Logical OR Operator\n");

        int topScore = 80;
        int secondTopScore = 95;
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
    }

    private static void lesson38() {
        System.out.println("Lesson 38: Assignment Operator VS Equals to Operator\n");

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar != false) {
            System.out.println("This is not supposed to happen");
        }
    }

    private static void lesson39() {
        System.out.println("Lesson 39: Ternary Operator\n");

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);
    }

    private static void lesson40() {
        System.out.println("Lesson 40: Operator Precedence and Operator Challenge\n");

        double var = 20.00;
        double var2 = 80.00;
        double var3 = (var + var2) * 100.00; System.out.println(var3);
        double var4 = var3 % 40.00; System.out.println(var4);
        boolean var5 = var4 == 0.00 ? true : false; System.out.println(var5);
        if (!var5)
            System.out.println("got some remainder");
    }
}

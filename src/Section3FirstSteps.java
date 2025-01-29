package src;

public class Section3FirstSteps {
    public static void main() {
        System.out.println("Section 3: First Steps");

        lesson26();
        lesson27();
    }

    public static void lesson26() {
        System.out.println("Lesson 26: Operators, Operands and Expressions\n");

        System.out.println("10/3 = " + 10 / 3);
        System.out.println("10%3 = " + 10 % 3);
        System.out.println("\n");
    }

    public static void lesson27() {
        System.out.println("Lesson 27: Abbreviating Operators\n");

        int result = 1;
        result = result +1;
        System.out.println("result = " + result);
        System.out.println("\n");

        result = 1;
        result++;
        System.out.println("result = " + result);
        System.out.println("\n");

        result = 1;
        result--;
        System.out.println("result = " + result);
        System.out.println("\n");

        result = 1;
        result-= 1;
        System.out.println("result = " + result);
        System.out.println("\n");

        result = 1;
        result+= 5;
        System.out.println("result = " + result);
        System.out.println("\n");

        result = 10;
        result-= 5;
        System.out.println("result = " + result);
        System.out.println("\n");
    }
}

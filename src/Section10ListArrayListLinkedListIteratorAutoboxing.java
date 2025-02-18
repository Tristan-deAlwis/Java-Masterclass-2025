package src;

import java.util.ArrayList;
import java.util.Arrays;

public class Section10ListArrayListLinkedListIteratorAutoboxing {
    public static void main(String[] args) {
        System.out.println("Section 9: Arrays");

        lesson132();
//        lesson133();
//        lesson134();
//        lesson135();
//        lesson136();
//        lesson137();
//        lesson138();
//        lesson139();
//        lesson140();
//        lesson141();
//        lesson142();
//        lesson143();
//        lesson144();
//        lesson145();
//        lesson146();
//        lesson147();
//        lesson148();
    }

    private static void lesson132() {
        System.out.println("Lesson 132: List and ArrayList Part 1\n");

        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));

        System.out.println();
    }

    record GroceryItem(String name, String type, int count) {
        public GroceryItem(String name) {
            this(name, "DAIRY", 1);
        }
    }

    private static void lesson133() {
        System.out.println("Lesson xx: XXX\n");
        System.out.println();
    }

    private static void lesson134() {
        System.out.println("Lesson xx: XXX\n");
        System.out.println();
    }

    private static void lesson135() {
        System.out.println("Lesson xx: XXX\n");
        System.out.println();
    }

    private static void lesson136() {
        System.out.println("Lesson xx: XXX\n");
        System.out.println();
    }

    private static void lesson137() {
        System.out.println("Lesson xx: XXX\n");
        System.out.println();
    }

    private static void lesson138() {
        System.out.println("Lesson xx: XXX\n");
        System.out.println();
    }

    private static void lesson139() {
        System.out.println("Lesson xx: XXX\n");
        System.out.println();
    }

    private static void lesson140() {
        System.out.println("Lesson xx: XXX\n");
        System.out.println();
    }

    private static void lesson141() {
        System.out.println("Lesson xx: XXX\n");
        System.out.println();
    }

    private static void lesson142() {
        System.out.println("Lesson xx: XXX\n");
        System.out.println();
    }

    private static void lesson143() {
        System.out.println("Lesson xx: XXX\n");
        System.out.println();
    }

    private static void lesson144() {
        System.out.println("Lesson xx: XXX\n");
        System.out.println();
    }

    private static void lesson145() {
        System.out.println("Lesson xx: XXX\n");
        System.out.println();
    }

    private static void lesson146() {
        System.out.println("Lesson xx: XXX\n");
        System.out.println();
    }

    private static void lesson147() {
        System.out.println("Lesson xx: XXX\n");
        System.out.println();
    }

    private static void lesson148() {
        System.out.println("Lesson xx: XXX\n");
        System.out.println();
    }
}

package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Section10ListArrayListLinkedListIteratorAutoboxing {
    public static void main(String[] args) {
        System.out.println("Section 9: Arrays");

//        lesson132();
//        lesson133();
        lesson134();
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

        @Override
        public String toString() {
            return String.format("%d %s in %s", count, name.toUpperCase(), type);
        }
    }

    private static void lesson133() {
        System.out.println("Lesson 133: ArrayList Part 2\n");
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("milk"));
        groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
        groceryList.set(0,
                new GroceryItem("apples", "PRODUCE", 6));
        groceryList.remove(1);
        System.out.println(groceryList);

        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println();
    }

    private static void lesson134() {
        System.out.println("Lesson 134: ArrayList Part 3\n");

        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third item = " + groceries.get(2));

        if (groceries.contains("mustard")) {
            System.out.println("List contains mustard");
        }

        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apples", "milk", "mustard",
                "cheese"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk", "mustard",
                "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

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

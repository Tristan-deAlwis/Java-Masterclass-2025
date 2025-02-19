package src;

import java.util.*;

public class Section10ListArrayListLinkedListIteratorAutoboxing {
    public static void main(String[] args) {
        System.out.println("Section 9: Arrays");

//        lesson132();
//        lesson133();
//        lesson134();
//        lesson135();
//        lesson136();
        lesson138();
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
        System.out.println("Lesson 135: Arrays vs. ArrayLists\n");

        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

//        originalList.add("fourth");

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

        System.out.println();
    }

    private static void lesson136() {
        System.out.println("Lesson 136: ArrayList Challenge Part 1\n");
        ArrayList<String> groceryList = GroceryList();
        System.out.println(groceryList);
        System.out.println();
    }

    public static ArrayList<String> GroceryList() {
        String item;
        ArrayList<String> list = new ArrayList<>();
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Available actions\n0 - to shutdown\n1 - to add item(s) to list (comma delimited list)\n2 - to remove anyitems (comma delimited list)\nEnter a number for which action you want to do");
        String input = scanner.nextLine();

        while (flag) {
            switch (input) {
                case "1" -> {
                    System.out.println("What would you like to input?");
                    item = scanner.nextLine();
                    list.add(item);
                    System.out.println(list);
                    return list;
                } case "2" -> {
                    System.out.println(list);
                    System.out.println("What would you like to remove");
                    item = scanner.nextLine();
                    list.remove(item);
                    System.out.println(list);
                    return list;
                } default -> {
                    flag = false;
                    return list;
                }
            }
        }
        list.sort(Comparator.naturalOrder());
        return list;
    }

    private static void lesson138() {
        System.out.println("Lesson 138: LinkedList Part 1\n");

//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);

        System.out.println();
    }

    public static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addFirst("Hobart");
//        Queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
//        Stack Methods
        list.push("Alice Springs");
    }

    public static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove(); // removes first element
        System.out.println(s1 + " was removed");

        String s2 = list.removeFirst(); // removes first element
        System.out.println(s2 + " was removed");

        String s3 = list.removeLast(); // removes last element
        System.out.println(s3 + " was removed");
//        Queue/Deque poll methods
        String p1 = list.poll(); // removes first element
        System.out.println(p1 + " was removed");
        String p2 = list.pollFirst(); // removes first element
        System.out.println(p2 + " was removed");
        String p3 = list.pollLast(); // removes last element
        System.out.println(p3 + " was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        String p4 = list.pop();
        System.out.println(p4 + " was removed");
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

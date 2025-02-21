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
//        lesson138();
//        lesson139();
//        lesson140();
//        lesson141();
//        lesson142();
        lesson143();
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
        list.addLast("Hobart");
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
        System.out.println("Lesson 139: LinkedList Part 2\n");

        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        gettingElements(placesToVisit);

        printItinerary(placesToVisit);

        printItinerary2(placesToVisit);

        printItinerary3(placesToVisit);

        System.out.println();
    }

    public static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4));

        System.out.println("First Element = " + list.getFirst());
        System.out.println("Last Element = " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.indexOf("Melbourne"));

//        Queue retrieval method
        System.out.println("Element from element() = " + list.element());
//        Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i -1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {
            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    private static void lesson140() {
        System.out.println("Lesson 140: Iterators\n");

        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        testIterator(placesToVisit);

        System.out.println();
    }

    public static void testIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")) {
                iterator.add("Lake Wivenhoe");
            }
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        System.out.println(list);

        var iterator2 = list.listIterator(3);
        System.out.println(iterator2.previous());
    }

    private static void lesson141() {
        System.out.println("Lesson 141: LinkedList Challenge\n");

        LinkedList<Place> cities = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(cities, adelaide);
        addPlace(cities, new Place("adelaide", 1374));
        addPlace(cities, new Place("Brisbane", 917));
        addPlace(cities, new Place("Perth", 3293));
        addPlace(cities, new Place("Alce Prings", 2771));
        addPlace(cities, new Place("Darwin", 3972));
        addPlace(cities, new Place("Melobourne", 877));
        addPlace(cities, new Place("Sydney", 0));

        System.out.println(cities);

        System.out.println();
    }

    record Place(String name, int distance) {

        @Override
        public String toString() {
            return String.format("%s (%d)", name, distance);
        }
    }

    public static void addPlace(LinkedList<Place> list, Place place) {
        if (list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        int matchedIndex = 0;
        for (var listPlace: list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }

            matchedIndex++;
        }

        list.add(place);
    }

    private static void lesson142() {
        System.out.println("Lesson 142: LinkedList Challenge, Continued\n");

        LinkedList<Place> cities = new LinkedList<>();

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(cities, adelaide);
        addPlace(cities, new Place("adelaide", 1374));
        addPlace(cities, new Place("Brisbane", 917));
        addPlace(cities, new Place("Perth", 3293));
        addPlace(cities, new Place("Alce Prings", 2771));
        addPlace(cities, new Place("Darwin", 3972));
        addPlace(cities, new Place("Melobourne", 877));
        addPlace(cities, new Place("Sydney", 0));

        System.out.println(cities);

        var iterator = cities.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;

        printMenu();

        while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }
            System.out.print("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem) {
                case "F":
                    System.out.println("User wants to go forward");
                    if (!forward) {           // Reversing Direction
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();  // Adjust position forward
                        }
                    }

                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }

                    break;

                case "B":
                    System.out.println("User wants to go backwards");
                    if (forward) {           // Reversing Direction
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();  // Adjust position backwards
                        }
                    }

                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;

                case "M":
                    printMenu();
                    break;

                case "L":
                    System.out.println(cities);
                    break;

                default:
                    quitLoop = true;
                    break;
            }
        }

        System.out.println();
    }

    public static void printMenu() {

        System.out.println("""
                Available actions (select word or letter):
                (F)orward
                (B)ackwards
                (L)ist Places
                (M)enu
                (Q)uit""");
    }

    private static void lesson143() {
        System.out.println("Lesson 143: Introduction to Autoboxing and Unboxing\n");

        Integer boxedInt = Integer.valueOf(15); // preferred but unnecessary
        Integer deprecatedBoxing = new Integer(15); // deprecated since JDK 9
        int unboxedInt = boxedInt.intValue(); // unnecessary

//        Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        System.out.println();
    }

    public static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    public static double getLiteralDoublePrimitive() {
        return 100.0;
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

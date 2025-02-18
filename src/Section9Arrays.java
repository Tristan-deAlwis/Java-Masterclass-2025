package src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Section9Arrays {

    public static void main(String[] args) {
        System.out.println("Section 9: Arrays");

//        lesson119();
//        lesson120();
//        lesson121();
//        lesson122();
//        lesson123();
//        lesson125();
//        lesson126();
        lesson127();
//        lesson128();
//        lesson129();
//        lesson130();
    }

    private static void lesson119() {
        System.out.println("Lesson 119: Arrays Part 1\n");

        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);
        System.out.println();

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);
        System.out.println();

        int[] newArray;
        newArray = new int[]  {5,4,3,2,1};
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i] + " ");
        }

        System.out.println();
    }

    private static void lesson120() {
        System.out.println("Lesson 120: Arrays Part 2\n");

        int[] newArray;
        newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray.length - i;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();

        for (int j : newArray) {
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if (objectVariable instanceof  int[]) {
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;

        System.out.println();
    }

    private static void lesson121() {
        System.out.println("Lesson 121: Using java.util.Arrays (sort, fill, copyOf )\n");

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        System.out.println();
    }

    public static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }

    private static void lesson122() {
        System.out.println("Lesson 122: Finding a Match, Using a Binary Search and testing equality of arrays\n");

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the List");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,5, 0};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

        System.out.println();
    }

    private static void lesson123() {
        System.out.println("Lesson 123: Arrays Challenge Exercise\n");

        int[] randomArray = getRandomArray(10);
        System.out.println(Arrays.toString(randomArray));

        int[] sortedArray = sortIntegers(new int[] {7,30,35});
        System.out.println(Arrays.toString(sortedArray));

        System.out.println();
    }

    public static int[] sortIntegers(int[] array) {
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i +1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i+1] = temp;
                    flag = true;
                    System.out.println("---->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }


        return sortedArray;
    }

    private static void lesson125() {
        System.out.println("Lesson 125: References Types vs Value Types\n");

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        modifyArray(myIntArray);

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        System.out.println();
    }

    public static void modifyArray(int[] array) {
        array[1] = 2;
    }

    private static void lesson126() {
        System.out.println("Lesson 126: Variable Arguments (Varargs)\n");

        System.out.println("Hello World again");

        String[] splitStrings = "Hello World again".split(" ");
        printText(splitStrings);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("_".repeat(20));
        printText();

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println(String.join(",", sArray));
    }

    public static void printText(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }

    private static void lesson127() {
        System.out.println("Lesson 127: Minimum Element Challenge\n");

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = " + returnedMin);

        System.out.println();
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }

        return min;
    }

    private static void lesson128() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
    }

    private static void lesson129() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
    }

    private static void lesson130() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
    }
}

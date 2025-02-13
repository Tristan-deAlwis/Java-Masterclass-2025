package src;

import java.util.Arrays;

public class Section9Arrays {

    public static void main() {
        System.out.println("Section 9: Arrays");

//        lesson119();
        lesson120();
//        lesson121();
//        lesson122();
//        lesson123();
//        lesson124();
//        lesson125();
//        lesson126();
//        lesson127();
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
        System.out.println("Lesson xxx: XXX\n");


        System.out.println();
    }

    private static void lesson122() {
        System.out.println("Lesson xxx: XXX\n");


        System.out.println();
    }

    private static void lesson123() {
        System.out.println("Lesson xxx: XXX\n");


        System.out.println();
    }

    private static void lesson124() {
        System.out.println("Lesson xxx: XXX\n");


        System.out.println();
    }

    private static void lesson125() {
        System.out.println("Lesson xxx: XXX\n");


        System.out.println();
    }

    private static void lesson126() {
        System.out.println("Lesson xxx: XXX\n");


        System.out.println();
    }

    private static void lesson127() {
        System.out.println("Lesson xxx: XXX\n");


        System.out.println();
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

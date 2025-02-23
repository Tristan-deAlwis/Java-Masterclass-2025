package src;

public class Section11AbstractionInJava {
    public static void main(String[] args) {
        System.out.println("Section 9: Arrays");

        lesson151();
//        lesson152();
//        lesson153();
//        lesson154();
//        lesson155();
//        lesson156();
//        lesson157();
//        lesson158();
//        lesson159();
//        lesson160();
//        lesson161();
//        lesson162();
//        lesson163();
    }

    private static void lesson151() {
        System.out.println("Lesson 151: Abstract Classes Part 1\n");
        System.out.println();
    }

    public abstract class Animal {

        protected String type;
        private String size;
        private double weight;

        public Animal(String type, String size, double weight) {

            this.type = type;
            this.size = size;
            this.weight = weight;
        }

        public abstract void move(String speed);
        public abstract void makeNoise();
    }

    public class Dog extends Animal {

        public Dog(String type, String size, double weight) {
            super(type, size, weight);
        }

        @Override
        public void move(String speed) {

        }

        @Override
        public void makeNoise() {

        }
    }

    private static void lesson152() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson153() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson154() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson155() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson156() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson157() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson158() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson159() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson160() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson161() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson162() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson163() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }
}

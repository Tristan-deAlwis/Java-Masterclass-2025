package src;

import java.util.ArrayList;

public class Section11AbstractionInJava {
    public static void main(String[] args) {
        System.out.println("Section 9: Arrays");

//        lesson151();
        lesson152();
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

    public static abstract class Animal {

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

    public static class Dog extends Animal {

        public Dog(String type, String size, double weight) {
            super(type, size, weight);
        }

        @Override
        public void move(String speed) {

            if (speed.equals("slow")) {
                System.out.println(type + " walking");
            } else {
                System.out.println(type + " running");
            }
        }

        @Override
        public void makeNoise() {

            if (type == "Wolf") {
                System.out.print("Howling! ");
            } else {
                System.out.print("Woof! ");
            }
        }
    }

    private static void lesson152() {
        System.out.println("Lesson 152: Abstract Classes Part 2\n");

//        Animal animal = new Animal("animal", "big", 100);
        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));

        for(Animal animal : animals) {
            doAnimalStuff(animal);
        }

        System.out.println();
    }

    private static void doAnimalStuff(Animal animal) {

        animal.makeNoise();
        animal.move("slow");
    }

    public static class Fish extends Animal {

        public Fish(String type, String size, double weight) {
            super(type, size, weight);
        }

        @Override
        public void move(String speed) {

            if (speed.equals("slow")) {
                System.out.println(type + " lazily swimming");
            } else {
                System.out.println(type + " darting frantically");
            }
        }

        @Override
        public void makeNoise() {

            if (type == "Goldfish") {
                System.out.print("swish! ");
            } else {
                System.out.print("splash! ");
            }
        }
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

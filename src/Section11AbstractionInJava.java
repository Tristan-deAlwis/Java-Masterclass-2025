package src;

import java.util.ArrayList;

abstract class Mammal extends Section11AbstractionInJava.Animal {
    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        System.out.print(getExplicitType() + " ");
        System.out.println(speed.equals("slow") ? "walks" : "runs");
    }

    public abstract void shedHair();
}

public class Section11AbstractionInJava {
    public static void main(String[] args) {
        System.out.println("Section 11: Abstraction in Java");

        lesson151();
        lesson152();
        lesson153();
        lesson154();
        lesson155();
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

        public final String getExplicitType() {
            return getClass().getSimpleName() + " (" + type + ")";
        }
    }

    public static class Dog extends Mammal {

        public Dog(String type, String size, double weight) {
            super(type, size, weight);
        }

        @Override
        public void move(String speed) {

            if (speed.equals("slow")) {
                System.out.println(getExplicitType() + " walking");
            } else {
                System.out.println(getExplicitType() + " running");
            }
        }

        @Override
        public void shedHair() {
            System.out.println(getExplicitType() + " sheds all the time");
        }

        @Override
        public void makeNoise() {

            if (type.equals("Wolf")) {
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
                System.out.println(getExplicitType() + " lazily swimming");
            } else {
                System.out.println(getExplicitType() + " darting frantically");
            }
        }

        @Override
        public void makeNoise() {

            if (type.equals("Goldfish")) {
                System.out.print("swish! ");
            } else {
                System.out.print("splash! ");
            }
        }
    }

    private static void lesson153() {
        System.out.println("Lesson 153: Abstract Classes Part 3\n");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Horse("Clydesdale", "large", 1000));

        for(Animal animal : animals) {
            doAnimalStuff(animal);
            if (animal instanceof Mammal currentMammal) {
                currentMammal.shedHair();
            }
        }

        System.out.println();
    }

    public static class Horse extends Mammal {

        public Horse(String type, String size, double weight) {
            super(type, size, weight);
        }

        @Override
        public void shedHair() {

            System.out.println(getExplicitType() + " sheds in the spring");
        }

        @Override
        public void makeNoise() {

        }
    }

    private static void lesson154() {
        System.out.println("Lesson 154: Abstract Class Challenge Part 1\n");

        Store.main(new String[]{""});

        System.out.println();
    }

    record OrderItem(int qty, ProductForSale product) {}

    public static class Store {
        private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

        public static void main(String[] args) {

            storeProducts.add(new ArtObject("Oil Painting", 1350,
                    "Impressionistic work by ABF painted in 2010"));

            storeProducts.add(new ArtObject("Sculpture", 2000,
                    "Bronze work by JKF, produced in 1950"));

            storeProducts.add(new Furniture("Desk", 500,
                    "Mahogany Desk"));

            storeProducts.add(new Furniture("Lamp", 200,
                    "Tiffany Lamp with Hummingbirds"));

            listProducts();

            System.out.println("\nOrder 1");
            var order1 = new ArrayList<OrderItem>();
            addItemToOrder(order1, 1, 2);
            addItemToOrder(order1, 0, 1);
            printOrder(order1);

            System.out.println("\nOrder 2");
            var order2 = new ArrayList<OrderItem>();
            addItemToOrder(order2, 3, 5);
            addItemToOrder(order2, 0, 1);
            addItemToOrder(order2, 2, 1);
            printOrder(order2);
        }

        public static void listProducts() {

            for (var item : storeProducts) {
                System.out.println("-".repeat(30));
                item.showDetails();
            }
        }

        public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex,
                                          int qty) {
            order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
        }

        public static void printOrder(ArrayList<OrderItem> order) {

            double salesTotal = 0;
            for (var item : order) {
                item.product().printPricedItem(item.qty());
                salesTotal += item.product().getSalesPrice(item.qty());
            }
            System.out.printf("Sales Total = $%6.2f %n", salesTotal);
        }
    }

    public static abstract class ProductForSale {
        protected String type;
        protected double price;
        protected String description;

        public ProductForSale(String type, double price, String description) {
            this.type = type;
            this.price = price;
            this.description = description;
        }

        public double getSalesPrice(int qty) {
            return qty * price;
        }

        public void printPricedItem(int qty) {

            System.out.printf("%2d qty at $%8.2f each,  %-15s %-35s %n",
                    qty, price, type, description);
        }

        public abstract void showDetails();
    }

    public static class ArtObject extends ProductForSale {

        public ArtObject(String type, double price, String description) {
            super(type, price, description);
        }

        @Override
        public void showDetails() {

            System.out.println("This " + type + " is a beautiful reproduction");
            System.out.printf("The price of the piece is $%6.2f %n", price);
            System.out.println(description);
        }
    }

    public static class Furniture extends ProductForSale {

        public Furniture(String type, double price, String description) {
            super(type, price, description);
        }

        @Override
        public void showDetails() {

            System.out.println("This " + type + " was manufactured in North Carolina");
            System.out.printf("The price of the piece is $%6.2f %n", price);
            System.out.println(description);
        }
    }


//    2-3 class that extend ProductForSale

    private static void lesson155() {
        System.out.println("Lesson 155: Abstract Class Challenge Part 2\n");

        Store.main(new String[]{""});

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

package src;

public class Section7OOPPart1Inheritance {
    public static void main() {
        System.out.println("Section 6: Control Flow");

//        lesson77();
//        lesson78();
//        lesson79();
//        lesson80();
//        lesson89();
//        lesson90();
        lesson91();
//        lesson92();
//        lesson100();
    }

    private static void lesson77() {
        System.out.println("Lesson 77: Introduction to Classes and Objects\n");



        System.out.println();
    }

    public static class Car {

        private String make = "Tesla";
        private String model = "Model X";
        private String color = "Gray";
        private int doors = 2;
        private boolean convertible = true;

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getDoors() {
            return doors;
        }

        public boolean isConvertible() {
            return convertible;
        }

        public void setMake(String make) {
            if (make == null) make = "Unknown";
            String lowercaseMake = make.toLowerCase();
            switch (lowercaseMake) {
                case "holden", "porsche", "tesla" -> this.make = make;
                default -> {
                    this.make = "Unsupported";
                }
            }
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setDoors(int doors) {
            this.doors = doors;
        }

        public void setConvertible(boolean convertible) {
            this.convertible = convertible;
        }

        public void describeCar() {
            System.out.println(doors + "-Door " +
                    color + " " +
                    make + " " +
                    model + " " +
                    (convertible ? "Convertible" : ""));
        }


    }

    private static void lesson78() {
        System.out.println("Lesson 78: Introduction to Classes, Using Getter Methods\n");

        Car car = new Car();
//        car.make() = "Porsche";
//        car.model() = "Carrera";
//        car.color() = "Red";
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        System.out.println();
    }

    private static void lesson79() {
        System.out.println("Lesson 79: Classes, Using Setters, and Creating Objects\n");

        // "this" is a special keyword in java

        Car car = new Car();
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        car.setMake("Porsche");
        car.setModel("Targa");
        car.setDoors(2);
        car.setConvertible(false);
        car.setColor("red");

        System.out.println();
    }

    private static void lesson80() {
        System.out.println("Lesson 80: Classes Challenge Exercise\n");

        Account account = new Account();
        account.setNumber("10_000.00");
        account.setBalance(10_000.00);
        account.setCustomerName("Marty Giver");
        account.setEmail("mgiver@email.com");
        account.setPhoneNumber("555-555-555");

        account.withdrawal(10_001);
        account.deposit(-1);
        account.deposit(1);
        account.withdrawal(10_001);

        System.out.println();
    }

    public static class Account {
        private String number;
        private double balance;
        private String customerName;
        private String email;
        private String phoneNumber;

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void deposit (int amount) {
            if (amount < 0) {
                System.out.println("Must be a positive deposit");
            } else {
                this.balance = balance + amount;
                System.out.println("New balance: " + balance);
            }

        }

        public void withdrawal (int amount) {
            if (this.balance - amount < 0) {
                System.out.println("Insufficient funds");
            } else {
                this.balance = balance - amount;
                System.out.println("New balance: " + balance);
            }
        }
    }

    private static void lesson89() {
        System.out.println("Lesson 89: Inheritance - Part 1\n");

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");

        System.out.println();
    }

    public static class Animal {
        protected String type;
        private String size;
        private double weight;

        public Animal() {

        }

        public Animal(String type, String size, double weight) {
            this.type = type;
            this.size = size;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "type='" + type + '\'' +
                    ", size='" + size + '\'' +
                    ", weight=" + weight +
                    '}';
        }

        public void move(String speed) {
            System.out.println(type + " moves " + speed);
        }

        public void makeNoise() {
            System.out.println(type + " makes some kind of noise");
        }
    }

    public static class Dog extends Animal {
        private String earShape;
        private String tailShape;

        public Dog() {
            super("Mutt", "Big", 50);
        }

        public Dog (String type, double weight) {
            this(type, weight, "Perky", "Curled");
        }

        public Dog(String type, double weight, String earShape, String tailShape) {
            super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
            this.earShape = earShape;
            this.tailShape = tailShape;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "earShape='" + earShape + '\'' +
                    ", tailShape='" + tailShape + '\'' +
                    "} " + super.toString();
        }

        public void makeNoise() {
            if (type == "Wolf" ) {
                System.out.println("Howl");
            }
            bark();
            System.out.println();
        }

        @Override
        public void move(String speed) {
            super.move(speed);
//            System.out.println("Dogs walk, run, and wag their tail");
            if (speed == "slow") {
                walk();
                wagTail();
            } else {
                run();
                bark();
            }
            System.out.println();
        }

        private void bark() {
            System.out.print("woof! ");
        }

        private void run() {
            System.out.print("Dog running ");
        }

        private void walk() {
            System.out.print("Dog walking ");
        }

        private void wagTail() {
            System.out.print("Tail wagging ");
        }
    }

    private static void lesson90() {
        System.out.println("Lesson 90: Inheritance - Part 2\n");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog ("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");


        System.out.println();
    }

    private static void lesson91() {
        System.out.println("Lesson 91: Inheritance - Part 3\n");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog ("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog ("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");

        System.out.println();
    }

    public static class Fish extends Animal {
        private int gills;
        private int fins;

        public Fish(String type, double weight, int gills, int fins) {
            super(type, "small", weight);
            this.gills = gills;
            this.fins = fins;
        }

        private void moveMuscles() {
            System.out.println("muscles moving");
        }

        public void moveBackFin() {
            System.out.println("backfin moving");
        }

        @Override
        public void move(String speed) {
            super.move(speed);
            moveMuscles();
            if (speed == "fast") {
                moveBackFin();
            }
            System.out.println();
        }

        @Override
        public String toString() {
            return "Fish{" +
                    "gills=" + gills +
                    ", fins=" + fins +
                    "} " + super.toString();
        }
    }

    private static void lesson92() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson100() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }
}

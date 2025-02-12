package src;

import java.util.Scanner;

public class Section8OOPPart2Polymorphism {
    public static void main() {
        System.out.println("Section 8: OOP Part 2 - Polymorphism");

//        lesson103();
//        lesson104();
//        lesson105();
//        lesson106();
//        lesson107();
//        lesson108();
//        lesson109();
//        lesson110();
//        lesson111();
        lesson112();
//        lesson113();
//        lesson114();
//        lesson115();
//        lesson116();
//        lesson117();
    }


    public static class Product {
        private String model;
        private String manufacturer;
        private int width;
        private int height;
        private int depth;

        public Product(String model, String manufacturer) {
            this.model = model;
            this.manufacturer = manufacturer;
        }
    }

    static class Monitor extends Product {
        private int size;
        private String resolution;

        public Monitor(String model, String manufacturer) {
            super(model, manufacturer);
        }

        public Monitor(String model, String manufacturer, int size, String resolution) {
            super(model, manufacturer);
            this.size = size;
            this.resolution = resolution;
        }

        public void drawPixelAt(int x, int y, String color) {
            System.out.println(String.format(
                    "Drawing pixel at %d,%d in color %s ", x, y, color
            ));
        }
    }

    static class Motherboard extends Product {
        private int ramSlots;
        private int cardSlots;
        private String bios;

        public Motherboard(String model, String manufacturer) {
            super(model, manufacturer);
        }

        public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
            super(model, manufacturer);
            this.ramSlots = ramSlots;
            this.cardSlots = cardSlots;
            this.bios = bios;
        }

        public void loadPrograms(String programName) {
            System.out.println("Program " + programName + " is now loading...");
        }
    }

    static class ComputerCase extends Product {
        private String powerSupply;

        public ComputerCase(String model, String manufacturer) {
            super(model, manufacturer);
        }

        public ComputerCase(String model, String manufacturer, String powerSupply) {
            super(model, manufacturer);
            this.powerSupply = powerSupply;
        }

        public void pressPowerButton() {
            System.out.println("Power button pressed");
        }
    }

    static class PersonalComputer extends Product {
        private ComputerCase computerCase;
        private Monitor monitor;
        private Motherboard motherboard;

        public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
            super(model, manufacturer);
            this.computerCase = computerCase;
            this.monitor = monitor;
            this.motherboard = motherboard;
        }

        private void drawLogo() {
            monitor.drawPixelAt(1200, 50, "yellow");
        }

        public void powerUp() {
            computerCase.pressPowerButton();
            drawLogo();
        }

//        public ComputerCase getComputerCase() {
//            return computerCase;
//        }
//
//        public Monitor getMonitor() {
//            return monitor;
//        }
//
//        public Motherboard getMotherboard() {
//            return motherboard;
//        }
    }

    private static void lesson103() {
        System.out.println("Lesson 103: Composition Part 2\n");

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540x1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().draaPixelAt(10, 10, "red");
//        thePC.getMotherboard().loadPrograms("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
        System.out.println();
    }

    private static void lesson104() {
        System.out.println("Lesson 104: Composition Challenge\n");

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();

        System.out.println();
    }

    public static class SmartKitchen {
        private Refrigerator iceBox;
        private DishWasher dishWasher;
        private CoffeeMaker brewMaster;

        public SmartKitchen() {
            iceBox = new Refrigerator();
            dishWasher = new DishWasher();
            brewMaster = new CoffeeMaker();
        }

        public Refrigerator getIceBox() {
            return iceBox;
        }

        public DishWasher getDishWasher() {
            return dishWasher;
        }

        public CoffeeMaker getBrewMaster() {
            return brewMaster;
        }

        public void setKitchenState(boolean fridgeFlag, boolean dishWasherFlag, boolean coffeeFlag) {
            iceBox.setHasWorkToDo(fridgeFlag);
            dishWasher.setHasWorkToDo(dishWasherFlag);
            brewMaster.setHasWorkToDo(coffeeFlag);
        }

        public void doKitchenWork() {
            iceBox.orderFood();
            dishWasher.doDishes();
            brewMaster.brewCoffee();
        }
    }

    static class Refrigerator {
        private boolean hasWorkToDo;

        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }

        public void orderFood() {
            if (hasWorkToDo) {
                System.out.println("Ordering Food");
                hasWorkToDo = false;
            }
        }
    }

    static class DishWasher {
        private boolean hasWorkToDo;

        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }

        public void doDishes() {
            if (hasWorkToDo) {
                System.out.println("Washing Dishes");
                hasWorkToDo = false;
            }
        }
    }

    static class CoffeeMaker {
        private boolean hasWorkToDo;

        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }

        public void brewCoffee() {
            if (hasWorkToDo) {
                System.out.println("Brewing Coffee");
                hasWorkToDo = false;
            }
        }
    }

    private static void lesson105() {
        System.out.println("Lesson 105: Encapsulation, Part 1\n");

        Player player = new Player();
        player.fullName = "Trim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

//        player.health = 200;
        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());
        System.out.println();
    }

    public static class Player {
        public String fullName;
        public int health;
        public String weapon;

        public void loseHealth(int damage) {
            if (health <= damage) {
                System.out.println("Player knocked out of the game");
                health -= damage;
            } else {
                health -= damage;
            }
        }

        public int healthRemaining() {
            return health;
        }

        public void restoreHealth(int extraHealth) {

            health += extraHealth;
            if (health > 100) {
                System.out.println("Player restored to 100%");
                health = 100;
            }
        }
    }

    private static void lesson106() {
        System.out.println("Lesson 106: Encapsulation, Part 2\n");

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Remaining health = " + tim.healthRemaining());
        System.out.println();
    }

    public static class EnhancedPlayer {
        private String fullName;
        private int healthPercentage;
        private String weapon;

        public EnhancedPlayer(String fullName) {
            this(fullName, 100, "Sword");
        }

        public EnhancedPlayer(String fullName, int health, String weapon) {
            this.fullName = fullName;
            if (health <= 0) {
                this.healthPercentage = 1;
            } else if (health > 100) {
                this.healthPercentage = 100;
            } else {
                this.healthPercentage = health;
            }
            this.weapon = weapon;
        }

        public void loseHealth(int damage) {
            if (healthPercentage <= damage) {
                System.out.println("Player knocked out of the game");
                healthPercentage -= damage;
            } else {
                healthPercentage -= damage;
            }
        }

        public int healthRemaining() {
            return healthPercentage;
        }

        public void restoreHealth(int extraHealth) {

            healthPercentage += extraHealth;
            if (healthPercentage > 100) {
                System.out.println("Player restored to 100%");
                healthPercentage = 100;
            }
        }
    }

    private static void lesson107() {
        System.out.println("Lesson 107: Encapsulation Challenge\n");

        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPagesPrinted());

        System.out.println();
    }

    public static class Printer {
        private int tonerLevel;
        private int pagesPrinted;
        private boolean duplex;

        public Printer(int tonerLevel, boolean duplex) {
            this.pagesPrinted = 0;
            this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
            this.duplex = duplex;
        }

        public int addToner(int tonerAmount) {

            int tempAmount = tonerAmount + tonerLevel;
            if (tempAmount > 100 || tempAmount < 0) {
                return -1;
            }
            tonerLevel += tonerAmount;
            return tonerLevel;
        }

        public int printPages(int pages) {

            int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
            pagesPrinted += jobPages;
            return jobPages;
        }

        public int getPagesPrinted() {
            return pagesPrinted;
        }

    }

    private static void lesson108() {
        System.out.println("Lesson 108: Polymorphism, Part 1\n");

        Movie theMovie = new Adventure("Star Wars");
        theMovie.watchMovie();
        System.out.println();
    }

    public static class Movie {
        private String title;

        public Movie(String title) {
            this.title = title;
        }

        public void watchMovie() {
            String instanceType = this.getClass().getSimpleName();
            System.out.println(title + " is a " + instanceType + " film");
        }

        public static Movie getMovie(String type, String title) {
            return switch (type.toUpperCase().charAt(0)) {
                case 'A' -> new Adventure(title);
                case 'C' -> new Comedy(title);
                case 'S' -> new ScienceFiction(title);
                default -> new Movie(title);
            };
        }
    }

    static class Adventure extends Movie {
        public Adventure(String title) {
            super(title);
        }

        @Override
        public void watchMovie() {
            super.watchMovie();
            System.out.printf(".. %s%n".repeat(3),
                    "Pleasant Scene",
                    "Scary Music",
                    "Something Bad Happens");
        }

        public void watchAdventure() {
            System.out.println("Watching an Adventure!");
        }
    }

    static class Comedy extends Movie {
        public Comedy(String title) {
            super(title);
        }

        @Override
        public void watchMovie() {
            super.watchMovie();
            System.out.printf(".. %s%n".repeat(3),
                    "Something funny",
                    "Something even funnier happens",
                    "Happy Ending");
        }

        public void watchComedy() {
            System.out.println("Watching a Comedy!");
        }
    }

    static class ScienceFiction extends Movie {
        public ScienceFiction(String title) {
            super(title);
        }

        @Override
        public void watchMovie() {
            super.watchMovie();
            System.out.printf(".. %s%n".repeat(3),
                    "Bad Aliens do Bad Stuff",
                    "Space Guys Chase Aliens",
                    "Planet Blows Up");
        }

        public void watchScienceFiction() {
            System.out.println("Watching a SciFi Thriller!");
        }
    }

    private static void lesson109() {
        System.out.println("Lesson 109: Polymorphism, Part 2\n");

//        Movie theMovie = Movie.getMovie("Science", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type or Q to quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

        System.out.println();
    }

    private static void lesson110() {
        System.out.println("Lesson 110:  Casting with classes, and using Object and var references\n");

        Movie movie = Movie.getMovie("a", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        System.out.println();
    }

    private static void lesson111() {
        System.out.println("Lesson 111: Testing the runtime type using the instanceof operator\n");

        Object unknownObject = Movie.getMovie("S", "Star Wars");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }

        System.out.println();
    }

    private static void lesson112() {
        System.out.println("Lesson 112: Polymorphism Challenge Exercise\n");

        Car car1 = new Car("This is a Car");
        car1.startEngine();
        car1.runEngine();
        car1.drive();

        GasPoweredCar car2 = new GasPoweredCar("This is a Gas Powered Car", 20, 4);
        car2.startEngine();
        car2.runEngine();
        car2.drive();

        ElectricCar car3 = new ElectricCar("This is an Electric Car", 25, 4);
        car3.startEngine();
        car3.runEngine();
        car3.drive();

        HybridCar car4 = new HybridCar("This is a hybrid Car", 55, 100, 4);
        car4.startEngine();
        car4.runEngine();
        car4.drive();


        System.out.println();
    }

    public static class Car {
        String description;

        public Car(String description) {
            this.description = description;
        }

        private void startEngine() {
            System.out.println("Engine Started\n");
        }

        private void drive() {
            System.out.println("Driving\n");

        }

        protected void runEngine() {
            System.out.println("Engine Running\n");
        }

    }

    public static class GasPoweredCar extends Car {
        double avgKmPerLitre;
        int cylinders;

        public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
            super(description);
            this.avgKmPerLitre = avgKmPerLitre;
            this.cylinders = cylinders;
        }

        private void startEngine() {
            System.out.println("Engine Started with gas\n");
        }

        private void drive() {
            System.out.println("Driving on gas\n");

        }

        protected void runEngine() {
            System.out.println("Engine Running on gas\n");
        }
    }

    public static class ElectricCar extends Car {
        double avgKmPerCharge;
        int batterySize;

        public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
            super(description);
            this.avgKmPerCharge = avgKmPerCharge;
            this.batterySize = batterySize;
        }

        private void startEngine() {
            System.out.println("Battery sending electrons to Engine\n");
        }

        private void drive() {
            System.out.println("Electric Motor moving\n");

        }

        protected void runEngine() {
            System.out.println("Electric Engine powered on\n");
        }
    }

    public static class HybridCar extends Car {
        double avgKmPerLitre;
        int batterySize;
        int cylinders;

        public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
            super(description);
            this.avgKmPerLitre = avgKmPerLitre;
            this.batterySize = batterySize;
            this.cylinders = cylinders;
        }

        private void startEngine() {
            System.out.println("Engine Started with either gas or electricity\n");
        }

        private void drive() {
            System.out.println("Car driving on gas/electricity\n");

        }

        protected void runEngine() {
            System.out.println("Engine powered by gas/electricity\n");
        }
    }

    private static void lesson113() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
    }

    private static void lesson114() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
    }

    private static void lesson115() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
    }

    private static void lesson116() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
    }

    private static void lesson117() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
    }
}

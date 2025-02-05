package src;

public class Section8OOPPart2Polymorphism {
    public static void main() {
        System.out.println("Section 8: OOP Part 2 - Polymorphism");

//        lesson103();
//        lesson104();
//        lesson105();
        lesson106();
//        lesson107();
//        lesson108();
//        lesson109();
//        lesson110();
//        lesson111();
//        lesson112();
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
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
    }

    private static void lesson108() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
    }

    private static void lesson109() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
    }

    private static void lesson110() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
    }

    private static void lesson111() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
    }

    private static void lesson112() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
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

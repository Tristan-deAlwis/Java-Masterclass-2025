package src;

public class Section8OOPPart2Polymorphism {
    public static void main(String[] args) {
        System.out.println("Section 7: OOP Part 1 - Inheritance");

        lesson103();
        lesson104();
        lesson105();
        lesson106();
        lesson107();
        lesson108();
        lesson109();
        lesson110();
        lesson111();
        lesson112();
        lesson113();
        lesson114();
        lesson115();
        lesson116();
        lesson117();
    }


    public class Product {
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

    class Monitor extends Product {
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

        public void draaPixelAt(int x, int y, String color) {
            System.out.println(String.format(
                    "Drawing pixel at %d,%d in color %s ", x, y, color
            ));
        }
    }

    class Motherboard extends Product {
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

    class ComputerCase extends Product {
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

    public class PersonalComputer extends Product {
        private ComputerCase computerCase;
        private Monitor monitor;
        private Motherboard motherboard;

        public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, Motherboard motherboard) {
            super(model, manufacturer);
            this.computerCase = computerCase;
            this.monitor = monitor;
            this.motherboard = motherboard;
        }

        public ComputerCase getComputerCase() {
            return computerCase;
        }

        public Monitor getMonitor() {
            return monitor;
        }

        public Motherboard getMotherboard() {
            return motherboard;
        }
    }

    private static void lesson103() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
    }

    private static void lesson104() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
    }

    private static void lesson105() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
    }

    private static void lesson106() {
        System.out.println("Lesson xxx: XXX\n");
        System.out.println();
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

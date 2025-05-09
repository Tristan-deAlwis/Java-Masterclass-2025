package src;

public class Section7OOPPart1Inheritance {
    public static void main() {
        System.out.println("Section 7: OOP Part 1 - Inheritance");

        lesson78();
        lesson79();
        lesson80();
        lesson89();
        lesson90();
        lesson91();
        lesson92();
        lesson93();
        lesson94();
        lesson97();
        lesson98();
        lesson99();
        lesson100();
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
        System.out.println("Lesson 92: What is java.lang.Object?\n");

        Student max = new Student("Max", 21);
        System.out.println(max);

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println(jimmy);

        System.out.println();
    }

    public static class Main extends Object {

    }

    static class Student {
        private String name;
        private int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " is " + age;
        }
    }

    static class PrimarySchoolStudent extends Student {
        private String parentName;

        PrimarySchoolStudent(String name, int age, String parentName) {
            super(name, age);
            this.parentName = parentName;
        }

        @Override
        public String toString() {
            return parentName + "'s kid, " + super.toString();
        }
    }

    private static void lesson93() {
        System.out.println("Lesson 93: Inheritance Challenge - Part 1\n");

        Employee amy = new Employee("Amy", "1976", "2025");
        System.out.println(amy);

        System.out.println();
    }

    static class Worker {
        private String name;
        private String birthDate;
        protected String endDate;

        public Worker() {}

        public Worker(String name, String birthDate) {
            this.name = name;
            this.birthDate = birthDate;
        }

        public int getAge() {
            int age = 2025 - Integer.parseInt(birthDate);
            return age;
        }

        public double collectPay() {
            return 0.0;
        }

        public void terminate (String endDate) {
            this.endDate = endDate;
        }

        @Override
        public String toString() {
            return "Worker{" +
                    "name='" + name + '\'' +
                    ", birthDate='" + birthDate + '\'' +
                    ", endDate='" + endDate + '\'' +
                    '}';
        }
    }

    static class Employee extends Worker {
        protected long employeeID;
        protected String hireDate;

        private static int employeeNo = 1;

        public Employee() {}

        public Employee(String name, String birthDate, String hireDate) {
            super(name, birthDate);
            this.employeeID = Employee.employeeNo++;
            this.hireDate = hireDate;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "employeeID=" + employeeID +
                    ", hireDate='" + hireDate + '\'' +
                    "} " + super.toString();
        }
    }

    private static void lesson94() {
        System.out.println("Lesson 94: Inheritance Challenge Part 2\n");

        SalariedEmployee joe = new SalariedEmployee("Joe", "1976", "2025", 50_000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's pension check = $" + joe.collectPay());

        System.out.println();
    }

    static class SalariedEmployee extends Employee {
        private double annualSalary;
        private boolean isRetired;

        public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
            super(name, birthDate, hireDate);
            this.annualSalary = annualSalary;
            this.isRetired = isRetired;
        }

        @Override
        public double collectPay() {
            double paycheck = annualSalary / 26;
            double adjustedPay = (isRetired) ? 0.9*paycheck : paycheck;

            return (int) adjustedPay;
        }

        public void retire() {
            terminate("2025");
            isRetired = true;
        }

        @Override
        public String toString() {
            return "SalariedEmployee{" +
                    "annualSalary=" + annualSalary +
                    ", isRetired=" + isRetired +
                    "} " + super.toString();
        }
    }

    private static void lesson97() {
        System.out.println("Lesson 97: The Text Block and other Formatting Options\n");

        String bulletIt = "Print a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                    \u2022 First Point
                        \u2022 SubPoint""";

        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);

        for (int i = 1; i <= 10_000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
            }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

        System.out.println();
    }

    private static void lesson98() {
        System.out.println("Lesson 98: Another Look at the String\n");

        printInformation("Hello World");
        printInformation("");
        printInformation("\t    \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));

        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorld.equals(helloWorldLower)) {
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("World")) {
            System.out.println("String contains World");
        }
        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }

        System.out.println();
    }

    public static void printInformation(String string){
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is Blank");
        }
        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length - 1));


    }

    private static void lesson99() {
        System.out.println("Lesson 99: String Manipulation Methods/n");

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3,5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("newDate = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("newDate = " + newDate);

        newDate = "25" + "/" + "11" + "/" + "1982";
        System.out.println("newDate = " + newDate);

        newDate = "25".concat("/").concat("11").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);

        System.out.println(newDate.replace("/", "-"));
        System.out.println(newDate.replace("2", "00"));

        System.out.println(newDate.replaceFirst("/", "-"));
        System.out.println(newDate.replaceAll("/", "---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));
        System.out.println("-".repeat(20));

        System.out.println();
    }

    private static void lesson100() {
        System.out.println("Lesson 100: The StringBuilder class\n");

        StringBuilder helloBuilder = new StringBuilder("Hello");
        System.out.println(helloBuilder);

        StringBuilder emptyBuilder = new StringBuilder();
        System.out.println(emptyBuilder);

        StringBuilder emptyBuilder5 = new StringBuilder(5);
        System.out.println(emptyBuilder5);

        StringBuilder stringBuilder = new StringBuilder(helloBuilder);
        System.out.println(stringBuilder);

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");

        StringBuilder helloWorldBuilder = new StringBuilder( "Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");

        printInformation2(helloWorld);
        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder( "Hello" + " World");
        builderPlus.append(" and Goodbye");

        builderPlus.deleteCharAt(16).insert(16, 'g');
        System.out.println(builderPlus);

        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);

        System.out.println();
    }

    public static void printInformation2(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }
}
